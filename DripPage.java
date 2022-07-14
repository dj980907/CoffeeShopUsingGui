import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DripPage {

	public static void main(String[] args) {
		showWindow();

	}
	
	public static void showWindow() {
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Drip Coffee");
				
		//setting the bounds 
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Types of Special Drip Coffee");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 6, 300, 57);
		frame.getContentPane().add(lblNewLabel);

//-----------------------------------------------------------------------------------------------------------
		JButton btnDrip = new JButton("Pour-Over Hand Drip");
		btnDrip.setBounds(50, 75, 170, 80);
		frame.getContentPane().add(btnDrip);
		
		btnDrip.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				PourOverHandDrip pohd = new PourOverHandDrip();
				
				//call the method that shows the window
				pohd.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnEspresso = new JButton("Chemex");
		btnEspresso.setBounds(286, 75, 170, 80);
		frame.getContentPane().add(btnEspresso);
		
		btnEspresso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				ChemexPage chemex = new ChemexPage();
				
				//call the method that shows the window
				chemex.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnDessert = new JButton("Cold Brew");
		btnDessert.setBounds(50, 176, 170, 80);
		frame.getContentPane().add(btnDessert);
		
		btnDessert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				ColdBrewPage cold = new ColdBrewPage();
				
				//call the method that shows the window
				cold.showWindow();
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
