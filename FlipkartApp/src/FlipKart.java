import services.IDeliveryService;


public class FlipKart  
{
	
	private IDeliveryService service;

	
	//Constructor injection
	
	public FlipKart(IDeliveryService service) {
		super();
		this.service = service;
	}



	//setter injection
	public void setService(IDeliveryService service) //IDeliveryService service =new BlueDart();
	{
		this.service = service;
	}
	


	public boolean deliverTheProduct(Double amount)
	{
//		boolean status=service.deliverProduct(amount);
//		return status;
		
		return service.deliverProduct(amount);
	}

}
