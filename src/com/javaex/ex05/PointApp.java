package com.javaex.ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PointApp {

	public static void main(String[] args) {
		
		
		List<Point> pList = new LinkedList<Point>();
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(3,6);
		Point p03 = new Point(4,8);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		
		for(Point p : pList ) {
			System.out.println(p);
		}
		
		
		
	}

}
