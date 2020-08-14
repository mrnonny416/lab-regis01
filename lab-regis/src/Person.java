import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	String firstName;
	String lastName;
	Address address;
	Date dateOfBirth;
	SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void setAddress(Address address) {
		this.address = address;
	}

	void setDateOfBirth(String date) {
		try {
			this.dateOfBirth = ft.parse(date);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
		}
	}

	int getAge() {
		String birthStr = ft.format(this.dateOfBirth);
		String nowStr = ft.format(new Date());
		String[] splitDateOfBirth = birthStr.split("-");
		String[] splitDateNow = nowStr.split("-");
		int intYearBirth = Integer.parseInt(splitDateOfBirth[2]);
		int intYearNow = Integer.parseInt(splitDateNow[2]);
		int Age = intYearNow - intYearBirth;
		return Age;
	}

	void printInfo() {
		System.out.println("\nPerson : " + firstName + " " + lastName);
		System.out.println("Birth Day : " + ft.format(this.dateOfBirth));
	}
}
