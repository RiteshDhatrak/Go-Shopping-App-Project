package com.tnsif.application;

import com.tnsif.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc(int accNo,String accNm, Float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}
	
	public void bookPrduct(float deliveryCharges) {
		System.out.println(+ getCharges ());
		System.out.println(deliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharges()=" + getDeliveryCharges() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
