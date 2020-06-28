/**
 * 
 */
package com.saumac.currencyConversionLogic;

import com.saumac.enums.LargeNumbers;
import com.saumac.interfaces.Standards;

/**
 * @author SauMac
 *
 */
public class UsStandardConversion implements Standards {

	public void USstandard(double inputNumber, LargeNumbers largeNumber, float foreignRate, String currencySymbol) {

		double convertedAmount = inputNumber * foreignRate;
		convertedAmount = Standards.convertToNumeral(convertedAmount, largeNumber, currencySymbol);
		String NumberInWords = Long.toString((long) convertedAmount);
		int leadingDigits = NumberInWords.length() - 1;

		switch (leadingDigits) {
		case 0:
			System.out.println(currencySymbol + " " + NumberInWords);
			break;
		case 1:
			System.out.println(currencySymbol + " " + NumberInWords + " (Tens)");
			break;
		case 2:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 1) + " Hundred");
			break;
		case 3:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Thousand");
			break;
		case 6:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Million");
			break;
		case 7:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Million");
			break;
		case 8:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Million");
			break;
		case 9:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Billion");
			break;
		case 10:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Billion");
			break;
		case 11:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Billion");
			break;
		case 12:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Trillion");
			break;
		case 13:
			System.out.println(currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Trillion");
			break;
		}
	}
}
