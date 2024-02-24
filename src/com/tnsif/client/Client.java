package com.tnsif.client;
import com.tnsif.framework.PrimeAcc;
import com.tnsif.framework.NormalAcc;
import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;
import com.tnsif.application.GSShopFactory;


public class Client {
	
	public static void main (String[] args) {
		GSShopFactory sf =new GSShopFactory();

		PrimeAcc pa =new GSPrimeAcc(345432344, "Ritesh", 4000, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na =new GSNormalAcc(543452344,"Ritesh", 5000.0f, 1000);
		na.bookProduct(na.getDeliveryCharges());
		na.toString();
	}

}
