package jo.secondstep.Food;

import java.util.ArrayList;
import java.util.List;

public class Bill {
	double totalAmount = 0;
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	private final double tax = 1.12;
	int count=1;
	public double calculate(Order order) {
		System.out.println("**Visit Us Again**\n Your Bill:");
		System.out.println("Order Number : "+order.getOrderNum());
		System.out.println("Customer Name: "+ order.getCustomer().getName());
		System.out.println("Customer Phone Number: "+ order.getCustomer().getCustomerPhone());
		System.out.println("Customer Location: "+ order.getCustomer().getCustomer_location());
		System.out.println("***************************************");

		System.out.println("Your Order : \n");
		System.out.println("  Name"+ "\t" +"  Price" );
		for (Items item : order.getCustomerOrder()) {
			System.out.println(count++ +"- "+item.getName() + "\t" + item.getPrice());

			totalAmount += item.getPrice();
		}
		System.out.println("12% tax was added \nTotal Amount = ");
		return totalAmount * tax;
	}

}
