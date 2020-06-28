/**
 * 
 */
package com.saumac.convert;

import com.saumac.currencyConversionLogic.InStandardConversion;
import com.saumac.currencyConversionLogic.UsStandardConversion;
import com.saumac.enums.LargeNumbers;
import com.saumac.interfaces.Standards;

/**
 * @author svyas013
 * free.currencyconverterapi.com/api/v5/convert?q=USD_INR&compact=
 */
public class Main implements Standards {

	public static float USD = 75.63f;
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
		
		UsStandardConversion convertToUsStandard = new UsStandardConversion();
		InStandardConversion convertToInStandard = new InStandardConversion();
		
//		System.out.println("Input: \n");
		
		System.out.println("Output: \n");
		
		System.out.println("--------------------------------USD to INR--------------------------------------\n");
		
		System.out.println(">>>> US Standard >>>>");
		convertToUsStandard.USstandard(35.7, LargeNumbers.million, USD, rupees);
		System.out.println("\n>>>> IN Standard >>>>");
		convertToInStandard.INstandard(35.7, LargeNumbers.million, USD, rupees);
		
		System.out.println("\n--------------------------------INR to USD--------------------------------------\n");
		
		System.out.println(">>>> US Standard >>>>");
		convertToUsStandard.USstandard(1, LargeNumbers.crore, INR, dollar);
		System.out.println("\n>>>> IN Standard >>>>");
		convertToInStandard.INstandard(1, LargeNumbers.crore, INR, dollar);

	}
}
