package com.example.demo.work;
/**
 * 实现mongodb的map-reduce（不同页数的书籍的汇总）
 * @author CHZEALER
 *
 */
public class MapReduce {
	String map = "function(){ emit(this.pages, this.name); }";
	
    String reduce = "function( key, values ){ return Array.sum(values); }";
}
