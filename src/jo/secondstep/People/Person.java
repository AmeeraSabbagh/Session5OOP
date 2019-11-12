package jo.secondstep.People;

import java.sql.Date;

public class Person {
	String name;
	public Person(String name, String  birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String  getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String  birthDate) {
		this.birthDate = birthDate;
	}
	String birthDate;
	
}
