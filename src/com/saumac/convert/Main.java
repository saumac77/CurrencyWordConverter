/**
 * 
 */
package com.saumac.convert;

import com.saumac.currencyConversionLogic.UsStandardConversion;
import com.saumac.enums.LargeNumbers;
import com.saumac.interfaces.Standards;

/**
 * @author svyas013
 * free.currencyconverterapi.com/api/v5/convert?q=USD_INR&compact=
 */
public class Main implements Standards {

	public static float USD = 76.25f;
	public static float INR = 1/USD;
	public static String dollar = "$";
	public static String rupees = "Rs.";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsdToInr(1, LargeNumbers.million);
		System.out.println("\n----------------------------------------------------------------------\n");
		InrToUsd(1, LargeNumbers.crore);

	}

	public static void UsdToInr(double number, LargeNumbers i) {
		UsStandardConversion.USstandard(number, i, USD, rupees);
		UsStandardConversion.INstandard(number, i, USD, rupees);
	}

	public static void InrToUsd(double number, LargeNumbers i) {
		UsStandardConversion.USstandard(number, i, INR, dollar);
		UsStandardConversion.INstandard(number, i, INR, dollar);
	}

}
