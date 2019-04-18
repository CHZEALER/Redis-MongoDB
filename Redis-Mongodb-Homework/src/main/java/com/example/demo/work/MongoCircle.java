package com.example.demo.work;

import java.util.List;

import org.bson.Document;
import org.springframework.data.geo.Point;

import com.mongodb.DBObject;

/**
 * 实现mongo的圆形范围内的地理位置搜索
 * @author CHZEALER
 *
 */
public class MongoCircle {
	/*
	 *  UserDao
	 */
	//圆形
//	List<Document> withinCircle(String collection, String locationField, Point center, long redius,
//			DBObject fields, DBObject query, int limit);

	
	/*
	 * UserDaoImpl
	 */
	//圆形
//		@Override
//		public List<Document> withinCircle(String collection, String locationField, Point center, long redius,
//											DBObject fields, DBObject query, int limit) {
//			if(query==null)
//				query = new BasicDBObject();
//
//			System.out.println("withinCircle:{}"+query.toString());
//			Bson bson = Filters.and(Arrays.asList(
//					Filters.geoWithinCenter(locationField, center.getX(), center.getY(), redius)));
//			FindIterable findIterable = mongoTemplate.getCollection("test").find(bson);
//			List<Document> result = new ArrayList<Document>();
//			MongoCursor<Document> mongoCursor = mongoTemplate.getCollection(collection).find(bson).limit(limit).iterator();
//
//			MongoCursor<Document> mongoCursor1 = findIterable.iterator();
//			while(mongoCursor.hasNext()){
//				result.add(mongoCursor.next());
//			}
//			return result;
//		}
	
	/*
	 * UserController
	 */
	//圆形
//		@RequestMapping("/withinCircle")
//	    public List<Document> withinCircle(){
//	 	   DBObject query = new BasicDBObject();
//			DBObject field = new BasicDBObject();
//			Point point=new Point(50, 50);
//		   Long redius=50L;
//			int limit = 3;
//			List<Document> listfinal = userService.withinCircle("location",  "loc", point, redius, field, query, limit);
//			for(Document obj : listfinal)
//				System.out.println(obj);
//			return listfinal;
//	    }
	
	
	/*
	 * UserService
	 */
	//圆形
//	List<Document> withinCircle(String collection, String locationField, Point center, long redius,
//			DBObject fields, DBObject query, int limit);
	

	/*
	 * UserServiceImpl
	 */
	//圆形
//		@Override
//		public List<Document> withinCircle(String collection, String locationField, Point center, long redius,
//				DBObject fields, DBObject query, int limit) {
//			
//			return userDao.withinCircle(collection, locationField, center, redius, fields, query, limit);
//		}
	
	
	
	
	
	
}
