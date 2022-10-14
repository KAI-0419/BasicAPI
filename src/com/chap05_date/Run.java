package com.chap05_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Run {
	
	//1.Date
	
	//2.Calendar
	//3.GregorianCalendar
	//4.SimpleDateFormat
	
	public static void main(String[] args) {
//		Date originTime = new Date(1000L);
//		String originTime = new Date(0L).toGMTString();
//		System.out.println(originTime);
		
		Date today = new Date();
		System.out.println(today);
		
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(today));
		
		System.out.println(today.getTime());
		System.out.println(today.getYear());
		
		System.out.println("=============== 캘린더 ===============");
		
		//Calendar
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		int year = calendar.get(1);
		int month = calendar.get(Calendar.MONTH)+1;
		int date = calendar.get(Calendar.DATE);
		
		System.out.println(year+"년"+month+"월"+date+"일");
		
//		System.out.println(calendar.getTime());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		System.out.println(sdf1.format(today.getTime()));
		
		//
//		for(String name: TimeZone.getAvailableIDs()) {
//			System.out.println(name);
//		}
		
		TimeZone tz = TimeZone.getTimeZone("Etc/Greenwich");
		sdf1.setTimeZone(tz);
		System.out.println(sdf1.format(calendar.getTime()));
		
		System.out.println("=============== Gregorian ===============");
		
		//윤년
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(gc.getTime());
		
		System.out.println("year: "+gc.get(Calendar.YEAR));
		System.out.println("month: "+(gc.get(2)+1));
		
		gc.set(2018, 10-1, 15);
		System.out.println(gc.getTime());
		
		System.out.println(gc.isLeapYear(year+2));
	}

	
	
	
	
	
}
