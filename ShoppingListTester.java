import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class ShoppingListTester{
	public static void main(String[] args){
		final ShoppingList invoice = new ShoppingList();
		final ShoppingListFormatter formatter = new SimpleFormatter();
		
		final JTextArea textArea = new JTextArea(20, 40);
		invoice.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent event){
				textArea.setText(invoice.format(formatter));
			}
		});
		
		// combobox
		JComboBox comboSize = new JComboBox();
		JComboBox combo = new JComboBox();
		comboSize.setModel(new DefaultComboBoxModel(Size.values()));
		Size sel = (Size)comboSize.getSelectedItem();
		
		switch(sel){
					 
				 case First:
				 	Product bundle1 = new Product();
					Product bundle2 = new Product();
					Clothing Shirt = new Clothing("Shirt", 30.00, 3.76, "Large");
					Clothing Jacket = new Clothing("Jacket", 50.00, 4.25,"Large" );
					Clothing Lining = new Clothing("Lining", 5.00, 1.00,"Large");
					Clothing Skirt = new Clothing("Skirt", 35.00, 3.00,"Large");
					Clothing Pants = new Clothing("Pants", 45.00, 2.00,"Large");
					combo.addItem(Shirt);
					combo.addItem(Jacket);
					combo.addItem(Skirt);
					combo.addItem(Pants);
					
					//add both into product class
					bundle1.add(Jacket);
					bundle1.add(Lining);
					bundle2.add(Skirt);
					bundle2.add(Lining);
					
					//add bundle into combo box
					combo.addItem(new AddOn(bundle1, 5));
					combo.addItem(new AddOn(bundle2, 5));
					
										
					break;
					
				case Second:
					Product bundle5 = new Product();
					Product bundle6 = new Product();
					
					Clothing Shirt2 = new Clothing("Shirt", 25.00, 3.00, "Medium");
					Clothing Jacket2 = new Clothing("Jacket", 45.00, 4.00,"Medium" );
					Clothing Lining2 = new Clothing("Lining", 5.00, 2.00,"Medium");
					Clothing Skirt2 = new Clothing("Skirt", 30.00, 3.70,"Medium");
					Clothing Pants2 = new Clothing("Pants", 45.00, 1.90,"Medium");
					combo.addItem(Shirt2);
					combo.addItem(Jacket2);
					combo.addItem(Skirt2);
					combo.addItem(Pants2);
					
					bundle5.add(Jacket2);
					bundle5.add(Lining2);
					bundle6.add(Skirt2);
					bundle6.add(Lining2);
					
					combo.addItem(new AddOn(bundle5, 5));
					combo.addItem(new AddOn(bundle6, 5));
					
					break;
					
				case Third:
					Product bundle7 = new Product();
					Product bundle8 = new Product();
					
					Clothing Shirt3 = new Clothing("Shirt", 20.00, 2.80, "Small");
					Clothing Jacket3 = new Clothing("Jacket", 40.00, 3.50,"Small" );
					Clothing Lining3 = new Clothing("Lining", 5.00, 2.00,"Small");
					Clothing Skirt3 = new Clothing("Skirt", 25.00, 3.55,"Small");
					Clothing Pants3 = new Clothing("Pants", 38.50, 1.75,"Small");
					
					combo.addItem(Shirt3);
					combo.addItem(Jacket3);
					combo.addItem(Skirt3);
					combo.addItem(Pants3);
					
						bundle7.add(Jacket3);
						bundle7.add(Lining3);
						bundle8.add(Skirt3);
						bundle8.add(Lining3);
					
						combo.addItem(new AddOn(bundle7, 5));
						combo.addItem(new AddOn(bundle8, 5));
						break;
				default:
					break;
				 }

				 
		
		//set up combobox for non clothing
				
		JComboBox combo2 = new JComboBox();
		NonClothing Bag = new NonClothing("Bag", 40.00, 3.00, "NO SIZE");
		NonClothing PlushToy = new NonClothing("Plush Toy", 25.00, 1.30, "NO SIZE");
		NonClothing Curtain = new NonClothing("Curtain", 100.00, 10.00, "NO SIZE");
		NonClothing Zipper = new NonClothing("Zipper", 5.00, 0.0, "NO SIZE");
		NonClothing PlasticEyes = new NonClothing("Plastic Eyes", 7.50, 0.0, "NO SIZE");
		
		combo2.addItem(Bag);
		combo2.addItem(PlushToy);
		combo2.addItem(Curtain);
		
		Product bundle3 = new Product();
		bundle3.add(Bag);
		bundle3.add(Zipper);
		
		Product bundle4 = new Product();
		bundle4.add(PlushToy);
		bundle4.add(PlasticEyes);

		combo2.addItem(new AddOn(bundle3, 0));
		combo2.addItem(new AddOn(bundle4, 0));

		JTextField textfield = new JTextField("1", 5);		
		JButton addButton = new JButton("Add");
		JTextField textfield2 = new JTextField("1", 5);	
			
		
		//button1
		addButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				int quantity = Integer.parseInt(textfield.getText());
				PatternSaleSystem item = (PatternSaleSystem)combo.getSelectedItem();
				for(int i = 0; i < quantity; i++)
					invoice.addItem(item);	
					}
		});
	
		//button 2
		JButton addButton2 = new JButton("Add");
		
		addButton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				int quantity = Integer.parseInt(textfield2.getText());
				PatternSaleSystem item = (PatternSaleSystem) combo2.getSelectedItem();
				for(int i = 0; i < quantity; i++)
					invoice.addItem(item);
					
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(comboSize);
		panel.add(combo);
		panel.add(textfield);
		panel.add(addButton);
				
		JPanel panel2 = new JPanel();
		panel2.add(combo2);
		panel2.add(textfield2);
		panel2.add(addButton2);
		
				
		JFrame frame = new JFrame();
		frame.add(new JScrollPane(textArea), BorderLayout.NORTH);
		frame.add(panel, BorderLayout.WEST);
		frame.add(panel2, BorderLayout.EAST);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

//veno
//implement shopping list