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

		/*
		 * UsdToInr(7, LargeNumbers.million); System.out.println(
		 * "\n----------------------------------------------------------------------\n")
		 * ; InrToUsd(1, LargeNumbers.crore);
		 */
		
		UsStandardConversion UsdToInr = new UsStandardConversion();
		UsStandardConversion InrToUsd = new UsStandardConversion();
		
		UsdToInr.USstandard(700, LargeNumbers.million, USD, rupees);
		UsdToInr.INstandard(700, LargeNumbers.million, USD, rupees);
		
		System.out.println("\n----------------------------------------------------------------------\n");
		
		InrToUsd.USstandard(1, LargeNumbers.crore, INR, dollar);
		InrToUsd.INstandard(1, LargeNumbers.crore, INR, dollar);

	}
}
