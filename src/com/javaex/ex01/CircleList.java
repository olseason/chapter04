package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	
	private Circle[] cArray;
	private int crtPos;

	
	public CircleList() {
		
	}
	
	
	public CircleList(int crtPos) {
		this.cArray = new Circle[3];
		crtPos = 0;
	}


	
	//메소드 일반 
	public void add(Circle point) {
		cArray[crtPos] = point;
		crtPos = crtPos + 1;      //crtPos++ 같은 개념 
	}
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}



	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
	
	
	
}
