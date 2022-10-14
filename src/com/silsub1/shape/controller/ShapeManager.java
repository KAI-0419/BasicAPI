package com.silsub1.shape.controller;

import com.silsub1.shape.model.vo.IShape;
import com.silsub1.shape.model.vo.Triangle;

public class ShapeManager {
	public static void main(String[] args) {
		new ShapeManager().calcShapeArray();
	}
	
	public void calcShapeArray() {
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Triangle(11.3, 21.5);
		iarr[1] = new Triangle(22.1, 10.5);
		iarr[2] = new Triangle(5.7, 9.3);
		
		for(IShape t : iarr) {
			System.out.println("면적: "+t.area());
			System.out.println("둘레ㅣ "+t.perimeter());
			
			if(t instanceof Triangle) {
				System.out.println("빗변: "+ ((Triangle)t).getHypotenuse());
			}
		}
	}
}