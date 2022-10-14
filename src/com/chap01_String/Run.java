package com.chap01_String;

public class Run {
	public static void main(String[] args) {
//		method1();
		method2();
	}
	public static void method1() {
		
		//리터럴일때
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		//new 생성자 이용할때
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println("============");
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

		//초기화
		String stri = "";
		char ch = ' ';
		
		String s1 = new String("ABC");
		String s2 = new String("ABC" + "D");
		String s3 = "ABCD";
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
	}
	
	public static void method2() {
		String str = "abc";
		
		//1.charAt(인덱스)
		System.out.println(str.charAt(2));
		//2.concat => 합치기
		System.out.println(str.concat("def"));
		//3.contains(문자열) => 포함여부
		System.out.println(str.contains("bc"));
		//length() => 문자열 길이
		System.out.println(str.length());
		
		str = "a,b,c";
		//split() => 문자 구분/쪼개기
		String[] strArr = str.split(",");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);			
		}
		
		//trim(): 앞,뒤 공백제거
		str = "    aBc  ";
		System.out.println(str);
		System.out.println(str.trim());
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
	
	
	
	
	
	
	
	
	
	

}