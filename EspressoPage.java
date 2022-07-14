import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EspressoPage {

	public static void main(String[] args) {
		showWindow();

	}
	
	public static void showWindow() {
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Espresso");
				
		//setting the bounds 
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Types of Espresso Drink");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(128, 6, 300, 57);
		frame.getContentPane().add(lblNewLabel);

//-----------------------------------------------------------------------------------------------------------
		JButton btnAmericano = new JButton("Americano");
		btnAmericano.setBounds(10, 75, 120, 80);
		frame.getContentPane().add(btnAmericano);
		
		btnAmericano.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				AmericanoPage americano = new AmericanoPage();
				
				//call the method that shows the window
				americano.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnVFW = new JButton("Vanilla Flat White");
		btnVFW.setBounds(135, 75, 120, 80);
		frame.getContentPane().add(btnVFW);
		
		btnVFW.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				VanillaFlatWhitePage vfw = new VanillaFlatWhitePage();
				
				//call the method that shows the window
				vfw.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnMocha = new JButton("Caffe Mocha");
		btnMocha.setBounds(260, 75, 120, 80);
		frame.getContentPane().add(btnMocha);
		
		btnMocha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CaffeMochaPage mocha = new CaffeMochaPage();
				
				//call the method that shows the window
				mocha.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		
		JButton btnLatte = new JButton("Caffe Latte");
		btnLatte.setBounds(385, 75, 120, 80);
		frame.getContentPane().add(btnLatte);
		
		btnLatte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CaffeLattePage latte = new CaffeLattePage();
				
				//call the method that shows the window
				latte.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		JButton btnCappuccino = new JButton("Cappuccino");
		btnCappuccino.setBounds(10, 170, 120, 80);
		frame.getContentPane().add(btnCappuccino);
		
		btnCappuccino.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CappuccinoPage cappuccino = new CappuccinoPage();
				
				//call the method that shows the window
				cappuccino.showWindow();
			}
		});
//-----------------------------------------------------------------------------------------------------------
		JButton btnWhiteChocolateMocha = new JButton("White Chocolate Mocha");
		btnWhiteChocolateMocha.setBounds(135, 170, 200, 80);
		frame.getContentPane().add(btnWhiteChocolateMocha);
		
		btnWhiteChocolateMocha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				WhiteChocolateMochaPage wcm = new WhiteChocolateMochaPage();
				
				//call the method that shows the window
				wcm.showWindow();
			}
		});
//-----------------------------------------------------------------------------------------------------------
		JButton btnCaramelMacchiato = new JButton("Caramel Macchiato");
		btnCaramelMacchiato.setBounds(340, 170, 170, 80);
		frame.getContentPane().add(btnCaramelMacchiato);
		
		btnCaramelMacchiato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				CaramelMacchiatoPage macchiato = new CaramelMacchiatoPage();
				
				//call the method that shows the window
				macchiato.showWindow();
			}
		});
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
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
