package com.xtxk.demo1;

/**
 * 
 * @author tiger
 *
 */
public class Client {
	
	/**
	 * 客户端依赖 图形接口
	 */

	public void calculate(Graph graph){
		graph.getArea();// 计算面积
		graph.getPerimiter();// 计算周长
	}
}
