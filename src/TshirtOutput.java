import java.util.Scanner;

public class TshirtOutput {

	Customer c=new Customer();
	Scanner input=new Scanner(System.in);
	
	public void displaymenu()
	{
		System.out.println("Display ");
	//System.out.println("Seahawks T-shirts" + t.PRICE);
   
	}
public void printOrderSummery(TshirtOrder t)
	{
	
	System.out.println("order summery  ");
	System.out.println("Seahawks T-Shirts  " +t.getQ_seahawk() );
	System.out.println("second Broncos T-Shirts  " +t.getQ_brocos() );
	System.out.println("third  Super Bowl T-shirts " +t.getQ_super());
	System.out.println("T shirt total cost " + t.caltshirtcost());
	System.out.println("Tax " + t.caltax());

	System.out.println("total " + t.caltotalcost() );
	
	
	}
}
