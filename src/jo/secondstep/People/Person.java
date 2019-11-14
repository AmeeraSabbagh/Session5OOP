package jo.secondstep.People;

import java.util.Date;;

public class Person {
	String name;
	public Person(String name, Date  birth) {
		super();
		this.name = name;
		this.birthDate = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date  birthDate) {
		this.birthDate = birthDate;
	}
	Date birthDate;
	
}
