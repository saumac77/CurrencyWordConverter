/**
 * 
 */
package com.saumac.interfaces;

import com.saumac.convert.Main;

/**
 * @author svyas013
 *
 */
public interface Standards {

	public static void USstandard(float number, Main.largeNumbers digits) {
		// TODO Auto-generated method stub
		Long Number = Main.convertToNumeral(number, digits);
		String NumberInWords = Long.toString(Number);

		int count = NumberInWords.length();

		switch (count - 1) {
		case 0:
			System.out.println("Answer: Rs " + NumberInWords);
			break;
		case 1:
			System.out.println("Answer: Rs " + NumberInWords + " (Tens)");
			break;
		case 2:
			System.out.println("Answer: Rs " + NumberInWords.substring(0, 1) + " Hundred");
			break;
		case 3:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Thousand");
			break;
		case 6:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Million");
			break;
		case 7:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Million");
			break;
		case 8:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Million");
			break;
		case 9:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Billion");
			break;
		case 10:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Billion");
			break;
		case 11:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(3, 5) + " Billion");
			break;
		case 12:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Trillion");
			break;
		case 13:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Trillion");
			break;
		}
	}

	public static void INstandard(float number, Main.largeNumbers digits) {
		Long Number = Main.convertToNumeral(number, digits);
		String NumberInWords = Long.toString(Number);

		int count = NumberInWords.length();

		switch (count - 1) {
		case 0:
			System.out.println("Answer: Rs " + NumberInWords);
			break;
		case 1:
			System.out.println("Answer: Rs " + NumberInWords + " (Tens)");
			break;
		case 2:
			System.out.println("Answer: Rs " + NumberInWords.substring(0, 1) + " Hundred");
			break;
		case 3:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 6:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 7:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3) + " Crore");
			break;
		case 8:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(3, 5) + " Crore");
			break;
		case 9:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 3) + "." + NumberInWords.substring(1, 3) + " Crore");
			break;
		case 10:
			System.out.println(
					"Answer: Rs " + NumberInWords.substring(0, 4) + "." + NumberInWords.substring(2, 4) + " Crore");
			break;
		case 11:
			System.out.println("Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(3, 5)
					+ " Thousand Crore");
			break;
		case 12:
			System.out.println("Answer: Rs " + NumberInWords.substring(0, 1) + "." + NumberInWords.substring(1, 3)
					+ " Lakh Crore");
			break;
		case 13:
			System.out.println("Answer: Rs " + NumberInWords.substring(0, 2) + "." + NumberInWords.substring(2, 4)
					+ " Lakh Crore");
			break;
		}
	}

}
