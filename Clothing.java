public class Clothing implements PatternSaleSystem{
	private String description;
	private double price;
	private double mats;
	private String size;

	public Clothing(String description, double price, double mats, String size){
		this.description = description;
		this.price = price;
		this.mats = mats;
		this.size = size;
	}
	
	public double getPrice() { return price; }
	public String toString() { return description; }
	public double getMats() { return mats; }
	public String getSize() { return size; }
}
//adila
//set up the clothing