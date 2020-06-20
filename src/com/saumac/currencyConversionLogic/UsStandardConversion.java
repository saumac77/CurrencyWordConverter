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

	public static float USconversion(double number, float currency) {
		float result = (float) (number * currency);
		return result;
	}
	
	public static long convertToNumeral(float result, LargeNumbers i) {
		Double numeral = 0.0;

		switch (i) {
		case zero:
			numeral = result * LargeNumbers.zero.getValue();
			String solution0 = Long.toString(numeral.longValue());
			System.out.println(solution0);
			break;
		case million:
			numeral = result * LargeNumbers.million.getValue();
			String solution = Long.toString(numeral.longValue());
			System.out.println(solution);
			break;
		case billion:
			numeral = result * LargeNumbers.billion.getValue();
			String solution1 = Long.toString(numeral.longValue());
			System.out.println(solution1);
			break;
		case trillion:
			numeral = result * LargeNumbers.trillion.getValue();
			String solution3 = Long.toString(numeral.longValue());
			System.out.println(solution3);
			break;
		case thousand:
			numeral = result * LargeNumbers.thousand.getValue();
			String solution4 = Long.toString(numeral.longValue());
			System.out.println(solution4);
			break;
		case hundred:
			numeral = result * LargeNumbers.hundred.getValue();
			String solution5 = Long.toString(numeral.longValue());
			System.out.println(solution5);
			break;
		case lakh:
			numeral = result * LargeNumbers.lakh.getValue();
			String solution6 = Long.toString(numeral.longValue());
			System.out.println(solution6);
			break;
		case crore:
			numeral = result * LargeNumbers.crore.getValue();
			String solution7 = Long.toString(numeral.longValue());
			System.out.println(solution7);
			break;
		default:
			System.out.println("Wrong");
		}

		return numeral.longValue();
	}
	
	public static void USstandard(double number, LargeNumbers digits, float currency, String currencySymbol) {
		// TODO Auto-generated method stub
		
		float resultNumber = (float) (number * currency);
		
		Long Number = convertToNumeral(resultNumber, digits);
		String NumberInWords = Long.toString(Number);

		int count = NumberInWords.length();

		switch (count - 1) {
		case 0:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords);
			break;
		case 1:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords + " (Tens)");
			break;
		case 2:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + " Hundred");
			break;
		case 3:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Thousand");
			break;
		case 6:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Million");
			break;
		case 7:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Million");
			break;
		case 8:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Million");
			break;
		case 9:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Billion");
			break;
		case 10:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Billion");
			break;
		case 11:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Billion");
			break;
		case 12:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Trillion");
			break;
		case 13:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Trillion");
			break;
		}
	}

	public static void INstandard(double number, LargeNumbers digits, float inrValue, String currencySymbol) {
		
		float resultNumber = (float) (number * inrValue);
		
		Long Number = convertToNumeral(resultNumber, digits);
		String NumberInWords = Long.toString(Number);

		int count = NumberInWords.length();

		switch (count - 1) {
		case 0:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords);
			break;
		case 1:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords + " (Tens)");
			break;
		case 2:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + " Hundred");
			break;
		case 3:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 6:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 7:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Crore");
			break;
		case 8:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(3, 5) + " Crore");
			break;
		case 9:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(1, 3) + " Crore");
			break;
		case 10:
			System.out.println(
					"Answer: " + currencySymbol + " " + NumberInWords.substring(0, 4) + "." + NumberInWords.substring(2, 4) + " Crore");
			break;
		case 11:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(3, 5)
					+ " Thousand Crore");
			break;
		case 12:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3)
					+ " Lakh Crore");
			break;
		case 13:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4)
					+ " Lakh Crore");
			break;
		}
	}
}
