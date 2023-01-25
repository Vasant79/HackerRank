package com.datetimecalander;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 * printing day of a given time
 * always use date and time class java 8 - for more refer javaT
 */
public class CalanderDemo {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2023, 01, 23);

		DayOfWeek dow = DayOfWeek.from(ld);

		System.out.println(dow);

	}

}
