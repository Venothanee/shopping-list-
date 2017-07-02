public class AddOn implements PatternSaleSystem{
	private PatternSaleSystem item;
	private double extra;

	public AddOn(PatternSaleSystem item, double extra)	{
		this.item = item;
		this.extra = extra;
	}
	public double getPrice(){
		return item.getPrice() + extra;
	}
	
	public double getMats(){
		return item.getMats();
	}
	
	public String getSize(){
		return " ";
	}
	
	public String toString(){
		return item.toString() + "(Addons: " + extra +  "m)";
	}
	
	
}

//adila
//to show the addons for the products