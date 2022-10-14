package com.chap04_wrapperClass;

public class Run {
	
	// WrapperClass
	// 기본타입의 데이터를 객체화
	// 기본타입에 해당하는 데이터를 객체로 포장해주는 클래스 WrapperClass
	
	// Boxing   : 기본자료형 -> Wrapper클래스
	// Unboxing : Wrapper클래스 -> 기본자료형
	public static void main(String[] args) {
		//Boxing
		Integer i = new Integer(10);
		Integer i2 = new Integer(15);
		Double d = new Double(10.0);
		
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i)); //0은 비교해서 같을때, 양수면 i가 클때, 음수면 i2가 클때
		
		//AutoBoxing
		Short i3 = 10;
		Integer i4 = 5;
		Double d2 = 5.0;
		
		//UnBoxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnBoxing
		int a = i;
		int b = i2;
		
		abox(a+b); //int >> (autoBoxing) >> Integer >> (다형성) >> Object
		
		//문자열 -> 기본 자료형
		int inum = Integer.parseInt("4");
		double dnum = Double.parseDouble("4.4");
	    
		byte bnum = Byte.valueOf("1");
		long lnum = Long.valueOf("8");
		
		//(정석적인 방법)기본 자료형 -> 문자열
		String bstr = Byte.valueOf((byte)1).toString();
		String fstr = Float.valueOf(0.1f).toString();
	
		//편한 방법
		String dstr = 4.4+"";
	}
	
	public static void abox(Object obj) {
		System.out.println((Integer)obj);
	}

	
	
	
	
	
	
	

	
	
	
	
	
}
