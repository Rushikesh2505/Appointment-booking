package com.file.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpiryValidator {

	public static String validate(String date) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date expiryDate = formatter.parse(date);

		Date today = new Date();
		Date currentDate = formatter.parse(String.valueOf(formatter.format(today)));

		System.out.println(" expiryDate " + expiryDate);
		System.out.println(" today " + today);
		System.out.println(" currentDate " + currentDate);
		
		String action = "";
		if (currentDate.compareTo(expiryDate) < 0) {
			action = "NotExpired";
			System.out.println("NotExpired");
		} 
		else if (currentDate.compareTo(expiryDate) >= 0) {
			action = "Expired";
			System.out.println("Expired");
		} 
		
		
		return action;

	}

}
