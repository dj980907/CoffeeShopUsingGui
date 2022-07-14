import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DessertPage {

	public static void main(String[] args) {
		showWindow();

	}
	
	public static void showWindow() {
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Desserts");
				
		//setting the bounds 
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Types of Desserts");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(182, 6, 170, 57);
		frame.getContentPane().add(lblNewLabel);

//-----------------------------------------------------------------------------------------------------------
		JButton btnCheeseCake = new JButton("Cheese Cake");
		btnCheeseCake.setBounds(50, 75, 170, 80);
		frame.getContentPane().add(btnCheeseCake);
		
		btnCheeseCake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CheeseCakePage cheese = new CheeseCakePage();
				
				//call the method that shows the window
				cheese.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnCarrotCake = new JButton("Carrot Cake");
		btnCarrotCake.setBounds(286, 75, 170, 80);
		frame.getContentPane().add(btnCarrotCake);
		
		btnCarrotCake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CarrotCakePage carrot = new CarrotCakePage();
				
				//call the method that shows the window
				carrot.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnStrawberryCake = new JButton("Strawberry Cake");
		btnStrawberryCake.setBounds(50, 176, 170, 80);
		frame.getContentPane().add(btnStrawberryCake);
		
		btnStrawberryCake.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				StrawberryCakePage strawberry = new StrawberryCakePage();
				
				//call the method that shows the window
				strawberry.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnBrownie = new JButton("Brownie");
		btnBrownie.setBounds(286, 176, 170, 80);
		frame.getContentPane().add(btnBrownie);
		
		btnBrownie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				BrowniePage brownie = new BrowniePage();
				
				//call the method that shows the window
				brownie.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnBack = new JButton("go back");
		btnBack.setBounds(392, 265, 117, 29);
		frame.getContentPane().add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
//				OptionPage option = new OptionPage();
				
				//call the method that shows the window
				OptionPage.showWindow();
			}
		});

		frame.setVisible(true);
	}
	
}
