package jo.secondstep.Food;

import java.util.ArrayList;
import java.util.List;

import jo.secondstep.People.Employee;

public class Resturant implements FoodProvider {
	private String resturant_name;
	private String resturant_address;
	private long resturant_phone;
	Bill bill;
	private List<Employee> employees = new ArrayList<Employee>();
	private List<Items> menue = new ArrayList<Items>();
	Order customer_order;
	
	public Order getCustomer_order() {
		return customer_order;
	}

	public void setCustomer_order(Order customer_order) {
		this.customer_order = customer_order;
	}

	public List<Items> getMenue() {
		return menue;
	}

	public void setMenue(List<Items> menue) {
		this.menue = menue;
	}

	public Resturant(String resturant_name, String resturant_address, long resturant_phone, List<Items> menue,
			List<Employee> employees) {
		super();
		this.resturant_name = resturant_name;
		this.resturant_address = resturant_address;
		this.resturant_phone = resturant_phone;
		this.menue = menue;
		this.employees = employees;
	}

	public List<Employee> getEmployee() {
		return getEmployee();
	}

	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}

	public void requestOrder(List<Items> items) {
	}

	private String getResturant_name() {
		return resturant_name;
	}

	private void setResturant_name(String resturant_name) {
		this.resturant_name = resturant_name;
	}

	private String getResturant_address() {
		return resturant_address;
	}

	private void setResturant_address(String resturant_address) {
		this.resturant_address = resturant_address;
	}

	private long getResturant_phone() {
		return resturant_phone;
	}

	private void setResturant_phone(long resturant_phone) {
		this.resturant_phone = resturant_phone;
	}

	@Override
	public double calculateBill() {
		// TODO Auto-generated method stub
		bill = new Bill();
		System.out.println("You are Welcomed :) ");
		return bill.calculate(customer_order);

	}

	@Override
	public void viewMenue() {
		// TODO Auto-generated method stub
		for (Items item : menue) {
			System.out.println("**" + item.getName() + "\t" + item.getPrice());
		}

	}

}
