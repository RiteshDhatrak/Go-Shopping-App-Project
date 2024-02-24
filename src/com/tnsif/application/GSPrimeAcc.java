package com.tnsif.application;

import com.tnsif.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{

private static final float deliveryCharges =500.0f;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
}

	public void bookProduct(float charges) {
		System.out.println("This is A Prime Account");
		System.out.println("charges of Prime Account :" + charges);
		System.out.println("bookProduct limit:" +(charges - 500.0f));
		}

	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


}


