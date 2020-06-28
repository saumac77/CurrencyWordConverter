/**
 * 
 */
package com.saumac.interfaces;

import java.text.NumberFormat;

import com.saumac.enums.LargeNumbers;

/**
 * @author svyas013
 *
 */
public interface Standards {
	
	public NumberFormat numberFormat = NumberFormat.getInstance();

	public static void USstandard(float number, LargeNumbers digits) {
	}
	
	public static void INstandard(float number, LargeNumbers digits) {
	}
	
	public static double convertToNumeral(double result, LargeNumbers i, String currencySymbol) {
		String numericValueInText = "";
		double numeral = 0.0;
		numberFormat.setMinimumFractionDigits(2);

		switch (i) {
		case zero:
			numeral = result * LargeNumbers.zero.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case million:
			numeral = result * LargeNumbers.million.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case billion:
			numeral = result * LargeNumbers.billion.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case trillion:
			numeral = result * LargeNumbers.trillion.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case thousand:
			numeral = result * LargeNumbers.thousand.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case hundred:
			numeral = result * LargeNumbers.hundred.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case lakh:
			numeral = result * LargeNumbers.lakh.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		case crore:
			numeral = result * LargeNumbers.crore.getValue();
			numericValueInText = numberFormat.format(numeral);
			break;
		default:
			System.out.println("Wrong");
			break;
		}
		
		System.out.println(currencySymbol + " " + numericValueInText);

		return numeral;
	}

}
