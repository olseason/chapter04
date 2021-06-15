package com.javaex.ex03;

public class MyList<T> {

	
	//필드
	private T[] oArray;
	private int crtPos;
	
	
	//생성자
	
	public MyList() {
		this.oArray = (T[])new Object[3];
		crtPos = 0;
	}
	
	
	
	//메소드 gs
	
	//메소드 일반 
	public void add(T object) {
		oArray[crtPos] = object;
		crtPos = crtPos + 1;
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	
	
	
}
