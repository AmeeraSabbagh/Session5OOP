package jo.secondstep.People;

import java.util.Date;

public class Employee extends Person{
 int employee_id;
 String employeeRole;
public Employee(String name,Date birthDate,int employee_id, String employeeRole) {
	super(name,birthDate);
	this.employee_id = employee_id;
	this.employeeRole = employeeRole;
}
 
 
}
