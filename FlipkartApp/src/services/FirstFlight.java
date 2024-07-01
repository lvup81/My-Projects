package services;

public class FirstFlight implements IDeliveryService {

	@Override
	public boolean deliverProduct(Double amount) {

		System.out.println("Product is delivered through FirstFlight and amount :"+ amount);
		return true;
	}

}
