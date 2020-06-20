package com.saumac.enums;

public enum LargeNumbers {
	million(1e+6), billion(1e+9), trillion(1e+12), thousand(1e+3), hundred(1e+2), lakh(1e+5), crore(1e+7), zero(1);

	private double value;

	LargeNumbers(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
