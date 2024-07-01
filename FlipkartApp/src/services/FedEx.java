package services;

public class FedEx implements IDeliveryService {

	@Override
	public boolean deliverProduct(Double amount) {

		System.out.println("Product is delivered through FedEx and amount :"+ amount);
		return true;
	}

}
