
public class Driver {

	public static void main(String[] args) {
		TshirtOrder t=new TshirtOrder();
		Customer c=new Customer();
		TshirtInput in=new TshirtInput();
		TshirtOutput op=new TshirtOutput();
		
		op.displaymenu();
		in.readTshirtOrder(t);
		in.readcustomer();
		op.printOrderSummery(t);
		
		
		
	}

}
