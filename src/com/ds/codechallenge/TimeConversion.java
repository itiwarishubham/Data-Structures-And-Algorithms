package com.ds.codechallenge;

public class TimeConversion {

	public static String timeConversion(String s) {
		String dayOrNight = s.substring(s.length() - 2, s.length());
		if ("PM".equals(dayOrNight)) {
			int hour = Integer.parseInt(s.substring(0, 2));
			if (hour != 12)
				hour += 12;
			String temp = Integer.toString(hour);
			if (temp.length() == 1) {
				temp = "0" + temp;
			}
			return hour + s.substring(2, s.length()-2);
		} else {
			int hour = Integer.parseInt(s.substring(0, 2));
			if (hour == 12)
				hour = 0;
			String temp = Integer.toString(hour);
			if (temp.length() == 1) {
				temp = "0" + temp;
			}
			return temp + s.substring(2, s.length()-2);
		}
	}

}
