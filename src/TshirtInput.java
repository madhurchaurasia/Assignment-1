import java.util.Scanner;

public class TshirtInput {

	Customer c=new Customer();
	Scanner input=new Scanner(System.in);		 // define scanner class

	
	public void readTshirtOrder(TshirtOrder t)
	{
		
		System.out.print("Enter the number of Seahawks T-Shirts to purchase:");
		int shirttype1=input.nextInt();//enter first shirt type
		t.setQ_seahawk(shirttype1);
		
		System.out.print("Enter the number of Broncos T-Shirts to purchase:");
		int shirttype2=input.nextInt(); // enter second shirt type
		t.setQ_brocos(shirttype2);
		
		

		System.out.print("Enter the number of Seahawks T-Shirts to purchase:");
		int  shirttype3=input.nextInt();	// enter second shirt type
		t.setQ_super(shirttype3);
	}

	public void readcustomer()
	{
		String firstname=input.toString();	//enter first name
		System.out.println("Enter first Name ");
		c.setFirst_name(firstname);
		
		String lastname=input.toString();	//enter last name
		System.out.println("Enter last Name ");
		c.setLast_name(lastname);
		
		String streetaddress=input.toString();	//enter street address
		System.out.println("Enter streetaddress Name ");
		c.setStreet_address(streetaddress);
		
		String city=input.toString();			// enter city
		System.out.println("Enter city Name ");
		c.setCity(city);
		
		String state=input.toString();			// enter city
		System.out.println("Enter state Name ");
		c.setState(state);
		
		
		
		}
}
