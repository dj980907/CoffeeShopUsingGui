import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class OptionPage {

	public static ArrayList<Order> ListOfOrder = new ArrayList<Order>();
	
	public static void main(String[] args) {
		
		showWindow();
		

	}

	public static void showWindow() {
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Types Page");
				
		//setting the bounds to 100 pixels each
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("What would you like today?");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 6, 266, 57);
		frame.getContentPane().add(lblNewLabel);

//-----------------------------------------------------------------------------------------------------------

		JButton btnDrip = new JButton("Special Drip");
		btnDrip.setBounds(50, 75, 170, 80);
		frame.getContentPane().add(btnDrip);
		
		btnDrip.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
//				DripPage drip = new DripPage();
				
				//call the method that shows the window
				DripPage.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnEspresso = new JButton("Espresso");
		btnEspresso.setSize(170, 80);
		btnEspresso.setLocation(286, 75);
		//btnEspresso.setBounds(186, 75, 170, 80);
		frame.getContentPane().add(btnEspresso);
		
		btnEspresso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
//				//making the Start Page object and call it start
//				EspressoPage espresso = new EspressoPage();
				
				//call the method that shows the window
				EspressoPage.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnDessert = new JButton("Dessert");
		btnDessert.setSize(170, 80);
		btnDessert.setLocation(50, 176);
		//btnDessert.setBounds(50, 176, 170, 80);
		frame.getContentPane().add(btnDessert);
		
		btnDessert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
//				//making the Start Page object and call it start
//				DessertPage dessert = new DessertPage();
				
				//call the method that shows the window
				DessertPage.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnCart = new JButton("Cart");
//		btnCart.setSize(170, 80);
//		btnCart.setLocation(286, 176);
		btnCart.setBounds(286, 176, 170, 80);
		frame.getContentPane().add(btnCart);
		
		btnCart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
//				//making the Start Page object and call it start
				CartPage cart = new CartPage();
				
				//call the method that shows the window
				cart.showWindow();
			
			}
		});
		
		frame.setVisible(true);
	}
	
	public static void AddToCart(Order order) {
		
		ListOfOrder.add(order);
		
	}
}
