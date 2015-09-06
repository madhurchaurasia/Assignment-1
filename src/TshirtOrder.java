
public class TshirtOrder {
	
	private int q_seahawk;
	private int q_brocos;
	private int q_super;
	final double TAX=9.25;
	final double SHIPPING_COST=10.99;
	final double PRICE=40;
	
	
	

	public int getQ_seahawk() {
		return q_seahawk;
	}

	public void setQ_seahawk(int q_seahawk) {
		this.q_seahawk = q_seahawk;
	}

	public int getQ_brocos() {
		return q_brocos;
	}

	public void setQ_brocos(int q_brocos) {
		this.q_brocos = q_brocos;
	}

	public int getQ_super() {
		return q_super;
	}

	public void setQ_super(int q_super) {
		this.q_super = q_super;
	}

	public double caltshirtcost( )
    {
		//for quatity , from value will come
		
		
		double cost=PRICE*(getQ_seahawk()+getQ_brocos()+getQ_super());
			return cost;
	}
	
	public double caltax()
	{
		double subtotal =caltshirtcost()*TAX/100;
		return subtotal;
	}
	public double caltotalcost()
	{
		double totalcost=caltax() + SHIPPING_COST +  caltshirtcost();
		return totalcost;
	}
}
