package jo.secondstep.Food;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Date;
import jo.secondstep.People.Customer;
import jo.secondstep.People.Employee;
import java.util.*;
public class Session5_OOP {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int count = (int) ((Math.random() * ((100 - 1) + 1)) + 1);
		Path MenuPath = Paths.get("Menu.txt");
		File MenuFile = MenuPath.toFile();
		Path EmployeePath = Paths.get("Employee.txt");
		File EmployeeFile = EmployeePath.toFile();
		// SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		final String FIELD_SEP = " ";
		String resturant_name = "Seond Step";
		String resturant_address = "Irbid";
		long resturant_phone = 788888887;
		List<Items> items = new ArrayList<Items>();
		Items item = new Items();

		if (Files.exists(MenuPath)) {
			try {
				try (BufferedReader in = new BufferedReader(new FileReader(MenuFile))) {
					String line = in.readLine();

					while (line != null) {
						String[] columns = line.split(FIELD_SEP);
						item.setName(columns[0]);
						item.setPrice(Double.parseDouble(columns[1]));

						items.add(item);
						item = new Items();

						line = in.readLine();

					}
				}
			}

			catch (IOException e) {
				System.out.println(e);

			}
		}

		List<Employee> employees = new ArrayList<Employee>();
		String name, employeeRole;
		Date birthDate=new Date();
		int employeeId;

		if (Files.exists(EmployeePath)) {
			try {
				try (BufferedReader in = new BufferedReader(new FileReader(EmployeeFile))) {
					String line = in.readLine();

					while (line != null) {
						String[] columns = line.split(FIELD_SEP);
						name = columns[0];
						 try {
						birthDate =  dateFormat.parse(columns[1]);
						 }
						 catch (ParseException e) { 
					         System.out.println("Parse Exception");
					      }
						employeeId = Integer.parseInt(columns[2]);
						employeeRole = columns[3];

						Employee employee = new Employee(name, birthDate, employeeId, employeeRole);

						employees.add(employee);

						line = in.readLine();

					}
				}
			}

			catch (IOException e) {
				System.out.println(e);

			}
		}
		Resturant resturant = new Resturant(resturant_name, resturant_address, resturant_phone, items, employees);
		String customer_name;
		String customer_BDate;
		String customerLocation;
		long customerPhone;
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to " + resturant_name);
		System.out.println("Please Insert the Following Information");
		System.out.println("Name : ");
		customer_name = in.nextLine();
		System.out.println("Birth Date: ");
		customer_BDate = in.nextLine();
		System.out.println("Location: ");
		customerLocation = in.nextLine();
		System.out.println("Your Phone Number: ");
		customerPhone = in.nextLong();
		Date birth=new Date();
		try {
		 birth = (Date) dateFormat.parse(customer_BDate);
		}
		 catch (ParseException e) { 
	         System.out.println("Parse Exception");
	      }
		Customer customer = new Customer(customer_name, birth, customerLocation, customerPhone);

		List<Items> menu = new ArrayList<Items>();
		menu = customer.selectOrder(resturant);
		Order order = new Order(customer, count, menu);

		resturant.setCustomer_order(order);

		System.out.println(resturant.calculateBill()+"");

	}
}