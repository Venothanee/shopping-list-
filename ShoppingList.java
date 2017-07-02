import java.util.*;
import javax.swing.event.*;

public class ShoppingList{
	private ArrayList<PatternSaleSystem> items;
	private ArrayList<ChangeListener> listeners;

	public ShoppingList()	{
		items = new ArrayList<PatternSaleSystem>();
		listeners = new ArrayList<ChangeListener>();
	}

	public void addItem(PatternSaleSystem item){
		items.add(item);
		// Notify all observers of the change to the invoice
		ChangeEvent event = new ChangeEvent(this);
		for (ChangeListener listener:listeners)
			listener.stateChanged(event);
	}
	
	
	public void addChangeListener(ChangeListener listener){
		listeners.add(listener);
	}
	//get items from patternsalesystem
	public Iterator<PatternSaleSystem> getItems(){
		return new Iterator<PatternSaleSystem>(){
			private int current = 0;
			public boolean hasNext(){
				return current < items.size();
			}
			public PatternSaleSystem next(){
				return items.get(current++);
			}
			public void remove(){
				throw new UnsupportedOperationException();
			}
		};
	}
	
	
	//get string and displays it in shopping list formatter
	
	public String format(ShoppingListFormatter formatter){
		String r = formatter.formatHeader();
		Iterator<PatternSaleSystem>iter = getItems();
		while (iter.hasNext())
		r+= formatter.formatLineItem(iter.next()); 
		return r + formatter.formatFooter();
	}
}

//veno
//