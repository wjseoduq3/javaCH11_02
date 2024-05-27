package com.jdy.ch11_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		String strnow1 = now.toString();
		System.out.println(strnow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strnow2 = sdf.format(now);
		System.out.println(strnow2);
		
		// Calendar now2 = new Calendar;  추상클래스 --> new로 인스턴스 생성 불가
		Calendar now2 = Calendar.getInstance();
		int year = now2.get(Calendar.YEAR);
		System.out.println(year);
		int month = now2.get(Calendar.MONTH);
		System.out.println(month+1);  // 0부터 시작하므로 +1
		int day = now2.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now2.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		int ampm = now2.get(Calendar.AM_PM);
		System.out.println(ampm);
			
	}

}
