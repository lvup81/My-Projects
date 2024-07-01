package services;

public class BlueDart implements IDeliveryService {

	@Override
	public boolean deliverProduct(Double amount) 
	{
		System.out.println("Product is delivered through BlueDart and amount :"+ amount);
		return true;
	}

}
