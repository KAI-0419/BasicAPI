package com.chap02_StringBuilder_StringBuffer;

public class Run {

	public static void main(String[] args) {
		method1();
		method2();
	}
	
	public static void method1() {
		StringBuilder sb = new StringBuilder("마지막 시간!");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
	}
	public static void method2(){
		String str = "반가워~";
		System.out.println("기존 str: " + System.identityHashCode(str));
		
		str += "난 String이라고 해";
		System.out.println("추가 후 str: " + System.identityHashCode(str));
		
		StringBuffer bf = new StringBuffer("안녕");
		System.out.println("기존 bf:" + System.identityHashCode(bf));
		
		bf.append("난 StringBuffer야");
		System.out.println("추가 후 bf: " + System.identityHashCode(bf));
		
		bf.insert(3, "모두들 ");
		System.out.println(bf);
		
		bf.delete(0,8);
		System.out.println(bf);
		
		bf.reverse();
		System.out.println(bf);
	}
}
