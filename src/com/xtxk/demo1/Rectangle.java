package com.xtxk.demo1;

/**
 * 
 * @author tiger
 *
 * 长方形
 */
public class Rectangle implements Graph {
	private static final String NAME = "长方形=";

	public void getArea() {
		System.out.println(NAME +"长*宽");
	}

	public void getPerimiter() {
		// TODO Auto-generated method stub
		System.out.println(NAME+"2*(长+宽)");
	}

}
