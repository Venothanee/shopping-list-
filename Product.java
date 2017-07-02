import java.util.*;
import java.util.ArrayList;

public class Product implements PatternSaleSystem{
	private ArrayList<PatternSaleSystem> items;
	public Product(){
		items = new ArrayList<PatternSaleSystem>();
	}
	public void add(PatternSaleSystem item){
		items.add(item);
	}
		
	public double getPrice(){
		double price = 0;
		for (PatternSaleSystem item : items)
		price += item.getPrice();
		return price;
	}
	public String toString(){
		String description = "Add On: ";
		for (int i = 0; i < items.size(); i++){
			if (i > 0) description += ", ";
			description += items.get(i).toString();
		}
		return description;
	}
	
	public double getMats(){
		double material = 0;
		for (PatternSaleSystem item : items)
		material += item.getMats();
		return material;
	}
	
	public String getSize(){
		String size = " ";
		for (int i = 0; i < items.size(); i++){
			if (i > 0) size += ", ";
			size += items.get(i).toString();
		}
		return size;
	}
	
	
}

//adila
//gets data from Shopping List Tester