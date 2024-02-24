package com.tnsif.application;

import com.tnsif.framework.NormalAcc;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, Boolean isPrime) {
		PrimeAcc primeacc = new GSPrimeAcc(accNo,  accNm,  charges, isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc normalacc = new GSNormalAcc(accNo,  accNm, charges,  deliveryCharges);
		return normalacc;
	}
	

}
