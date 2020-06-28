/**
 * 
 */
package com.saumac.currencyConversionLogic;

import java.text.NumberFormat;

import com.saumac.enums.LargeNumbers;
import com.saumac.interfaces.Standards;

/**
 * @author SauMac
 *
 */
public class UsStandardConversion implements Standards {

	public NumberFormat numberFormat = NumberFormat.getInstance();

	public double convertToNumeral(double result, LargeNumbers i, String currencySymbol) {
		String numericValueInText = "";
		double numeral = 0.0;
		numberFormat.setMinimumFractionDigits(2);

		switch (i) {
		case zero:
			numeral = result * LargeNumbers.zero.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case million:
			numeral = result * LargeNumbers.million.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case billion:
			numeral = result * LargeNumbers.billion.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case trillion:
			numeral = result * LargeNumbers.trillion.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case thousand:
			numeral = result * LargeNumbers.thousand.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case hundred:
			numeral = result * LargeNumbers.hundred.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case lakh:
			numeral = result * LargeNumbers.lakh.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		case crore:
			numeral = result * LargeNumbers.crore.getValue();
			numericValueInText = numberFormat.format(numeral);
			System.out.println(currencySymbol + " " + numericValueInText);
			break;
		default:
			System.out.println("Wrong");
		}

		return numeral;
	}

	public void USstandard(double inputNumber, LargeNumbers largeNumber, float foreignRate, String currencySymbol) {

		double convertedAmount = inputNumber * foreignRate;
		convertedAmount = convertToNumeral(convertedAmount, largeNumber, currencySymbol);
		String NumberInWords = Long.toString((long) convertedAmount);
		int leadingDigits = NumberInWords.length() - 1;

		switch (leadingDigits) {
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
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Thousand");
			break;
		case 6:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Million");
			break;
		case 7:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Million");
			break;
		case 8:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Million");
			break;
		case 9:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Billion");
			break;
		case 10:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Billion");
			break;
		case 11:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(3, 5) + " Billion");
			break;
		case 12:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Trillion");
			break;
		case 13:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Trillion");
			break;
		}
	}

	public void INstandard(double inputNumber, LargeNumbers largeNumber, float foreignRate, String currencySymbol) {

		double convertedAmount = inputNumber * foreignRate;
		convertedAmount = convertToNumeral(convertedAmount, largeNumber, currencySymbol);
		String NumberInWords = Long.toString((long)convertedAmount);
		int leadingDigits = NumberInWords.length() - 1;
		
		switch (leadingDigits) {
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
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Thousand");
			break;
		case 4:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Thousand");
			break;
		case 5:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 6:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(1, 3) + " Lakh");
			break;
		case 7:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Crore");
			break;
		case 8:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(3, 5) + " Crore");
			break;
		case 9:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 3) + "."
					+ NumberInWords.substring(1, 3) + " Crore");
			break;
		case 10:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 4) + "."
					+ NumberInWords.substring(2, 4) + " Crore");
			break;
		case 11:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(3, 5) + " Thousand Crore");
			break;
		case 12:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 1) + "."
					+ NumberInWords.substring(1, 3) + " Lakh Crore");
			break;
		case 13:
			System.out.println("Answer: " + currencySymbol + " " + NumberInWords.substring(0, 2) + "."
					+ NumberInWords.substring(2, 4) + " Lakh Crore");
			break;
		}
	}

}
