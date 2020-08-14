
public class Address {
	String streetAddress;
	String district;
	String city;
	String zipCode;

	public Address(String streetAddress, String district, String city, String zipCode) {
		this.streetAddress = streetAddress;
		this.district = district;
		this.city = city;
		this.zipCode = zipCode;
	}

	void printAddress() {
		System.out.println("Address: ");
		System.out.println(streetAddress);
		System.out.println(district + " " + city);
		System.out.println(zipCode);
	}
}
