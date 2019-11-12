package jo.secondstep.Food;

import java.util.ArrayList;
import java.util.List;

import jo.secondstep.People.Customer;

public class Order {
	Customer customer;
	int orderNum;
	private List<Items> CustomerOrder = new ArrayList<Items>();
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public List<Items> getCustomerOrder() {
		return CustomerOrder;
	}
	public void setCustomerOrder(List<Items> customerOrder) {
		CustomerOrder = customerOrder;
	}
	public Order(Customer customer, int orderNum, List<Items> customerOrder) {
		super();
		this.customer = customer;
		this.orderNum = orderNum;
		CustomerOrder = customerOrder;
	}
	
	
}
