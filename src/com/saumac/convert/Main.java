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

	public static float USD = 75.96f;
	public static float INR = 1/USD;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsdToInr(1, LargeNumbers.million);
		System.out.println("\n----------------------------------------------------------------------\n");
//		InrToUsd(15000, Main.largeNumbers.crore);

	}

	public static void UsdToInr(double number, LargeNumbers i) {
		UsStandardConversion.USstandard(number, i, USD);
		UsStandardConversion.INstandard(number, i, INR);
	}

	public static void InrToUsd(double number, LargeNumbers i) {
		UsStandardConversion.USstandard(number, i, USD);
		UsStandardConversion.INstandard(number, i, INR);
	}

}
