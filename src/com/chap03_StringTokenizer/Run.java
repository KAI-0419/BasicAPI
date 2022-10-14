package com.chap03_StringTokenizer;

import java.util.StringTokenizer;

public class Run {
	public static void main(String[] args) {
		String str = "강현, 22, 충청남도 당진시, 남";
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}