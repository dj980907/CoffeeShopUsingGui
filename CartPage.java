import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.TextArea;
import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.Color;

public class CartPage {
	
	private static TextArea OrderNameArea;
	private static TextArea OrderPriceArea;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static double TaxRate = 0.1;
	private static double Tax;
	private static double GrandTotal;

	public static void main(String[] args) {
		
		showWindow();
		
	}
	
	public static void showWindow() {
		
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Cart");
				
		//setting the bounds 
		frame.setBounds(100, 100, 774, 566);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Cart");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(365, 6, 44, 32);
		frame.getContentPane().add(lblNewLabel);
	
//-----------------------------------------------------------------------------------------------------------
		
		OrderNameArea = new TextArea("Order Name: \n");
		OrderNameArea.setBackground(Color.WHITE);
		OrderNameArea.setBounds(6, 44, 679, 306);
		frame.getContentPane().add(OrderNameArea);
		OrderNameArea.setColumns(10);
		
		
		for (int i = 0; i < OptionPage.ListOfOrder.size(); i++) {
			OrderNameArea.append("- " + OptionPage.ListOfOrder.get(i).getName() + "\n");
		}
		
		TextArea OrderPriceArea = new TextArea("Price: \n");
		OrderPriceArea.setBounds(691, 44, 77, 306);
		frame.getContentPane().add(OrderPriceArea);
		
		for (int i = 0; i < OptionPage.ListOfOrder.size(); i++) {
			OrderPriceArea.append("$" + OptionPage.ListOfOrder.get(i).getPrice() + "\n");
		}
		
		JLabel lblSubTotal = new JLabel("Subtotal:");
		lblSubTotal.setBounds(526, 368, 66, 32);
		frame.getContentPane().add(lblSubTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(604, 371, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTax = new JLabel("Tax:");
		lblTax.setBounds(555, 400, 34, 32);
		frame.getContentPane().add(lblTax);
		
		textField_2 = new JTextField();
		textField_2.setBounds(604, 405, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		
		JLabel lblGrandTotal = new JLabel("GrandTotal:");
		lblGrandTotal.setBounds(510, 430, 83, 32);
		frame.getContentPane().add(lblGrandTotal);
		
		textField_3 = new JTextField();
		textField_3.setBounds(604, 443, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		double SubTotal = 0.0;
		
		for (int j = 0; j < OptionPage.ListOfOrder.size(); j++) {
			
			SubTotal += OptionPage.ListOfOrder.get(j).getPrice();
			
		}
		
		Tax = SubTotal * TaxRate;
		GrandTotal = SubTotal + Tax;
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		textField_1.setText("$ " + df.format(SubTotal));
		textField_2.setText("$ " + df.format(Tax));
		textField_3.setText("$ " + df.format(GrandTotal));

//-----------------------------------------------------------------------------------------------------------
		
		JButton btnBack = new JButton("Go Back");
		btnBack.setBounds(614, 475, 154, 57);
		frame.getContentPane().add(btnBack);
		
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
				OptionPage option = new OptionPage();
				
				//call the method that shows the window
				option.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
		frame.setVisible(true);
	}
}
