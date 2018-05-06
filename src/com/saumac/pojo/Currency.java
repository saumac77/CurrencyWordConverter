/**
 * 
 */
package com.saumac.pojo;

/**
 * @author svyas013
 *
 */
public class Currency {

	public String MILLION = "MILLION";
	public String BILLION = "BILLION";
	public String TRILLION = "TRILLION";
	public String CRORE = "CRORE";
	public String THOUSAND = "THOUSAND";
	public String LAKH = "LAKH";
	public String ZERO = "ZERO";
	public Double InputNumber;

	public Double getInputNumber() {
		return InputNumber;
	}

	public void setInputNumber(Double inputNumber) {
		InputNumber = inputNumber;
	}

	public String getMILLION() {
		return MILLION;
	}

	public void setMILLION(String mILLION) {
		MILLION = mILLION;
	}

	public String getBILLION() {
		return BILLION;
	}

	public void setBILLION(String bILLION) {
		BILLION = bILLION;
	}

	public String getTRILLION() {
		return TRILLION;
	}

	public void setTRILLION(String tRILLION) {
		TRILLION = tRILLION;
	}

	public String getCRORE() {
		return CRORE;
	}

	public void setCRORE(String cRORE) {
		CRORE = cRORE;
	}

	public String getTHOUSAND() {
		return THOUSAND;
	}

	public void setTHOUSAND(String tHOUSAND) {
		THOUSAND = tHOUSAND;
	}

	public String getLAKH() {
		return LAKH;
	}

	public void setLAKH(String lAKH) {
		LAKH = lAKH;
	}

	public String getZERO() {
		return ZERO;
	}

	public void setZERO(String zERO) {
		ZERO = zERO;
	}

	@Override
	public String toString() {
		return "Currency [MILLION=" + MILLION + ", BILLION=" + BILLION + ", TRILLION=" + TRILLION + ", CRORE=" + CRORE
				+ ", THOUSAND=" + THOUSAND + ", LAKH=" + LAKH + ", ZERO=" + ZERO + ", InputNumber=" + InputNumber + "]";
	}

}
