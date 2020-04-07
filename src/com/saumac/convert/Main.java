/**
 * 
 */
package com.saumac.convert;

import com.saumac.interfaces.Standards;

/**
 * @author svyas013
 * free.currencyconverterapi.com/api/v5/convert?q=USD_INR&compact=
 */
public class Main implements Standards {

	public static float USD = 67.79f;
//	public static float number = 64.82f;
	public static float INR = 0.016f;
	
	public String test = "Nait please review this [pill requestr";

	public enum largeNumbers {
		million(1e+6), billion(1e+9), trillion(1e+12), thousand(1e+3), hundred(1e+2), lakh(1e+5), crore(1e+7), zero(1);

		private double value;

		largeNumbers(double value) {
			this.value = value;
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UsdToInr(211, Main.largeNumbers.million);
		System.out.println("\n----------------------------------------------------------------------\n");
//		InrToUsd(15000, Main.largeNumbers.crore);

	}

	public static void UsdToInr(double number, Main.largeNumbers i) {
		Standards.USstandard(USconversion(number), i);
		Standards.INstandard(USconversion(number), i);
	}

	public static void InrToUsd(double number, Main.largeNumbers i) {
		Standards.USstandard(INconversion(number), i);
		Standards.INstandard(INconversion(number), i);
	}

	public static float USconversion(double number) {
		float result = (float) (number * USD);
		return result;
	}

	public static float INconversion(double number) {
		float result = (float) (number * INR);
		return result;
	}

	public static long convertToNumeral(float result, Main.largeNumbers i) {
		Double numeral = 0.0;

		switch (i) {
		case zero:
			numeral = result * largeNumbers.zero.value;
			String solution0 = Long.toString(numeral.longValue());
			System.out.println(solution0);
			break;
		case million:
			numeral = result * largeNumbers.million.value;
			String solution = Long.toString(numeral.longValue());
			System.out.println(solution);
			break;
		case billion:
			numeral = result * largeNumbers.billion.value;
			String solution1 = Long.toString(numeral.longValue());
			System.out.println(solution1);
			break;
		case trillion:
			numeral = result * largeNumbers.trillion.value;
			String solution3 = Long.toString(numeral.longValue());
			System.out.println(solution3);
			break;
		case thousand:
			numeral = result * largeNumbers.thousand.value;
			String solution4 = Long.toString(numeral.longValue());
			System.out.println(solution4);
			break;
		case hundred:
			numeral = result * largeNumbers.hundred.value;
			String solution5 = Long.toString(numeral.longValue());
			System.out.println(solution5);
			break;
		case lakh:
			numeral = result * largeNumbers.lakh.value;
			String solution6 = Long.toString(numeral.longValue());
			System.out.println(solution6);
			break;
		case crore:
			numeral = result * largeNumbers.crore.value;
			String solution7 = Long.toString(numeral.longValue());
			System.out.println(solution7);
			break;
		default:
			System.out.println("Wrong");
		}

		return numeral.longValue();
	}

	public static int countZeros(int result) {
		String number;
		int count = 0;
		number = Integer.toString(result);
		for (int i = 1; i <= number.length(); i++) {
			count++;
		}
		System.out.println(count);

		return count;
	}

}
