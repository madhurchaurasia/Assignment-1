
public class Customer {
private String first_name;
private String last_name;
private String street_address;
private String city;
private String state;
private String zipcode;

public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getStreet_address() {
	return street_address;
}
public void setStreet_address(String street_address) {
	this.street_address = street_address;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getZipcode() {
	return zipcode;
}
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

public String mailingAddress()
{
	String address=first_name+ " " + last_name +"\n"+ street_address + "\n" + city +state +zipcode;
	return address;
	
}

}
