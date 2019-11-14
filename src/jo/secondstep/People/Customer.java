package jo.secondstep.People;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jo.secondstep.Food.Items;
import jo.secondstep.Food.Resturant;

public class Customer extends Person {

	private String customer_location;
	private long customerPhone;
	List<Items> order = new ArrayList<Items>();
	public Customer(String name, Date birth, String customer_location, long customerPhone) {
		super(name, birth);
		this.customer_location = customer_location;
		this.customerPhone = customerPhone;
	}

	public String getCustomer_location() {
		return customer_location;
	}

	public void setCustomer_location(String customer_location) {
		this.customer_location = customer_location;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public List<Items> selectOrder( Resturant resturant) {
		Scanner in = new Scanner(System.in);

		System.out.println("Thank You , Please Type Your Choises From Menu Below As Shown or Press 0 to Exit: ");
		resturant.viewMenue();
		String choise = in.nextLine();
		if (choise == "0") {
			System.out.println("Thank You For Visiting :)");
			System.exit(0);
		}
		while (!choise.equals("0")) {
		for (int i = 0; i < resturant.getMenue().size(); i++) {
			if (resturant.getMenue().get(i).getName().equals(choise)) {
				order.add(resturant.getMenue().get(i));
			} 
			
			
		}
		
		System.out.println("Please Enter another Choise or 0 to Exit ");
		choise = in.nextLine();
		
	}
		return order;
}
}