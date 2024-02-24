package com.tnsif.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int AccNo,String accNm, float charges, Boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int AccNo,String accNm, float charges,float deliveryCharges);


}
    