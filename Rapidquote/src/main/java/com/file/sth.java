package com.file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sth {
	public static void main(String[] args) {
		
		Date date = new Date();	
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	
		String strDate = dateFormat.format(date);
		System.out.println("String : " + strDate);
		
		
		try {
			Date Date2 = dateFormat.parse(strDate);
			System.out.println("Date : " + Date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		
		/*
		 * String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss.SSSZ"; SimpleDateFormat
		 * simpleDateFormat = new SimpleDateFormat(pattern, new Locale("da", "DK"));
		 * String date1 = simpleDateFormat.format(new Date());
		 * System.out.println(date1);
		 */
		
	}
}