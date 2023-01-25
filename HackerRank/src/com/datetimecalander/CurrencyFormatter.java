package com.datetimecalander;

import java.text.NumberFormat;
import java.util.Locale;

/*
 * printinf value in term of local currency
 */

public class CurrencyFormatter {

	public static void main(String[] args) {

		// 1st approch
		// NumberFormat f = NumberFormat.getCurrencyInstance(Locale.US);
		// currency = f.format(1000.201);

		System.out.println("Currency");

		// 2nd - one line approch
		// System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(12342.97));

		// implementation
		double payment = 12324.134;

		// creating local for india - no builtin available

		Locale india = new Locale("en", "IN");

		System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(payment));

		System.out.println(NumberFormat.getCurrencyInstance(india).format(payment));

		System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
		System.out.println(NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
	}

}
