import services.FedEx;
import services.FirstFlight;

public class LaunchApp {

	public static void main(String[] args) {
		
		
		FlipKart fp=new FlipKart(new FirstFlight());
		
//		int age=8;
//		age=9;
		
//		fp.setService(new BlueDart());
//		fp.setService(new FedEx());
		
		boolean status=fp.deliverTheProduct(45454.4);

		if(status)
			System.out.println("Delivered successfully");
		else
			System.out.println("Failed to deliver the product");
	}

}
