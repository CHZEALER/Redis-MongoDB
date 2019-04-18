package com.example.demo.work;

import org.apache.commons.lang3.RandomStringUtils;

import redis.clients.jedis.Jedis;
/**
 * 通过redis实现5分钟内登录失败次数限制（3次失败，不允许登陆）（有多种实现方法）
 * 连续启动该类三次不允许登录，五分钟后再试																																																																																																							
 * @author CHZEALER
 *
 */
public class RedisLoginFiveMin {
	public static void main(String[] args) {
        //服务初始化
        Jedis jedis = new Jedis("localhost");
        System.out.println("redis服务已启动！");
        
        
        //判断是否发过消息，如果没有则创建
        if (!jedis.exists("TestMap")){
            //假数据账号
            String user = "yangye";
            //假数据密码
            String psd = "yy666";
            //生成验证码
            String code = RandomStringUtils.randomNumeric(6);
            //记录访问次数
            String count = "1";
            //存入redis
            jedis.hset("TestMap","user",user);
            jedis.hset("TestMap","psd",psd);
            jedis.hset("TestMap","code",code);
            jedis.hset("TestMap","count",count);
            
            
            //设置5分钟的拒绝访问时间，5min=300s
            jedis.expire("TestMap",300);
            System.out.println("您的验证码为："+code+",五分钟内有效，当前为第"+count+"次输入，输入错误三次将限制访问");
        }else{
           String s =  jedis.hget("TestMap","count");
            //获取次数，并判断是否超过3次
           int count =  Integer.parseInt(s);
           if(count<3){
               String code =   RandomStringUtils.randomNumeric(6);
               count++;
               jedis.hset("TestMap","code",code);
               jedis.hset("TestMap","count",Integer.toString(count));
               System.out.println("您的验证码为："+code+",五分钟内有效，当前为第"+count+"次输入，输入错误三次将限制访问");
           }else{
               System.out.println("输入错误超过3次，请五分钟后再试");
           }
        }


    }
}
