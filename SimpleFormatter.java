public class SimpleFormatter implements ShoppingListFormatter{
	private double total;
	public String formatHeader(){
		total = 0;
		return " S H O P P I N G L I S T\n\n\n";
	}
	public String formatLineItem(PatternSaleSystem item){
		total += item.getPrice();
		return (String.format("%s:$%.2f:%.2f m %s\n",item.toString(),item.getPrice(),item.getMats(), item.getSize()));
	}
	
	public String formatFooter(){
		return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
	}
}

//veno
//displays the format of shopping list