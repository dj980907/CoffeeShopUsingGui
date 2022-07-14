import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class BrowniePage {
	private static JTextField textField;
	private static String [] OrderNameArray = new String[3];
	private static String OrderName = "Brownie";
	public static double price = 3.75;
	
	public static void main(String[] args) {
		
		showWindow();

	}
	
	public static void showWindow() {
		
		for(int i = 0; i < OrderNameArray.length; i++) {
			OrderNameArray[i] = "";
		}
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Brownie");
				
		//setting the bounds 
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Brownie");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(200, 6, 130, 32);
		frame.getContentPane().add(lblNewLabel);
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblSlice = new JLabel("Slice:");
		lblSlice.setBounds(5, 53, 35, 15);
		frame.getContentPane().add(lblSlice);
		
		JRadioButton rdbtn1 = new JRadioButton("1");
		rdbtn1.setBounds(49, 50, 44, 20);
		frame.getContentPane().add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("2");
		rdbtn2.setBounds(105, 50, 44, 20);
		frame.getContentPane().add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("3");
		rdbtn3.setBounds(166, 50, 44, 20);
		frame.getContentPane().add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("4");
		rdbtn4.setBounds(222, 50, 44, 20);
		frame.getContentPane().add(rdbtn4);
		
		rdbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn1.isSelected()) {
					
					rdbtn2.setSelected(false);
					rdbtn3.setSelected(false);
					rdbtn4.setSelected(false);
					
					OrderNameArray[0] = "1 Slice of";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);


				}
			}
		});		
		
		rdbtn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn2.isSelected()) {
					rdbtn1.setSelected(false);
					rdbtn3.setSelected(false);
					rdbtn4.setSelected(false);
					
					OrderNameArray[0] = "2 Slices of";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
		
		rdbtn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn3.isSelected()) {
					rdbtn1.setSelected(false);
					rdbtn2.setSelected(false);
					rdbtn4.setSelected(false);
					
					OrderNameArray[0] = "3 Slices of";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
		
		rdbtn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtn4.isSelected()) {
					rdbtn1.setSelected(false);
					rdbtn2.setSelected(false);
					rdbtn3.setSelected(false);
					
					OrderNameArray[0] = "4 Slices of";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
					
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblTopping = new JLabel("Topping:");
		lblTopping.setBounds(5, 85, 63, 15);
		frame.getContentPane().add(lblTopping);
		
		JRadioButton rdbtnNone = new JRadioButton("None");
		rdbtnNone.setBounds(69, 82, 70, 20);
		frame.getContentPane().add(rdbtnNone);
		
		JRadioButton rdbtnWhippedCream = new JRadioButton("Whipped Cream");
		rdbtnWhippedCream.setBounds(140, 82, 130, 20);
		frame.getContentPane().add(rdbtnWhippedCream);
		
		JRadioButton rdbtnCaramel = new JRadioButton("Caramel");
		rdbtnCaramel.setBounds(275, 82, 91, 20);
		frame.getContentPane().add(rdbtnCaramel);
		
		JRadioButton rdbtnIceCream = new JRadioButton("Ice Cream");
		rdbtnIceCream.setBounds(363, 82, 100, 20);
		frame.getContentPane().add(rdbtnIceCream);
		
		JRadioButton rdbtnChocolateSyrup = new JRadioButton("Chocolate Syrup");
		rdbtnChocolateSyrup.setBounds(69, 112, 134, 20);
		frame.getContentPane().add(rdbtnChocolateSyrup);
		
		rdbtnNone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNone.isSelected()) {
					rdbtnWhippedCream.setSelected(false);
					rdbtnCaramel.setSelected(false);
					rdbtnIceCream.setSelected(false);
					rdbtnChocolateSyrup.setSelected(false);
					
					OrderNameArray[1] = "with No Toppings";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});

		rdbtnWhippedCream.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnWhippedCream.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnCaramel.setSelected(false);
					rdbtnIceCream.setSelected(false);
					rdbtnChocolateSyrup.setSelected(false);
					
					OrderNameArray[1] = "with Whipped Cream";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
		
		rdbtnCaramel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnCaramel.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnWhippedCream.setSelected(false);
					rdbtnIceCream.setSelected(false);
					rdbtnChocolateSyrup.setSelected(false);
					
					OrderNameArray[1] = "with Caramel";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
		
		rdbtnIceCream.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnIceCream.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnWhippedCream.setSelected(false);
					rdbtnCaramel.setSelected(false);
					rdbtnChocolateSyrup.setSelected(false);
					
					OrderNameArray[1] = "with Ice cream";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});

		rdbtnChocolateSyrup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnChocolateSyrup.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnWhippedCream.setSelected(false);
					rdbtnCaramel.setSelected(false);
					rdbtnIceCream.setSelected(false);
					
					OrderNameArray[1] = "with Chocolate Syrup";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
				
		JLabel lblFork = new JLabel("Fork:");
		lblFork.setBounds(5, 152, 35, 15);
		frame.getContentPane().add(lblFork);
				
		JRadioButton rdbtnOne = new JRadioButton("1");
		rdbtnOne.setBounds(49, 150, 44, 20);
		frame.getContentPane().add(rdbtnOne);
				
		JRadioButton rdbtnTwo = new JRadioButton("2");
		rdbtnTwo.setBounds(105, 150, 44, 20);
		frame.getContentPane().add(rdbtnTwo);
				
		JRadioButton rdbtnThree = new JRadioButton("3");
		rdbtnThree.setBounds(166, 150, 44, 20);
		frame.getContentPane().add(rdbtnThree);
				
		JRadioButton rdbtnFour = new JRadioButton("4");
		rdbtnFour.setBounds(222, 150, 44, 20);
		frame.getContentPane().add(rdbtnFour);
				
		rdbtnOne.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(rdbtnOne.isSelected()) {
							
					rdbtnTwo.setSelected(false);
					rdbtnThree.setSelected(false);
					rdbtnFour.setSelected(false);
							
					OrderNameArray[2] = ", with 1 fork";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);


				}
			}
		});		
				
		rdbtnTwo.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(rdbtnTwo.isSelected()) {
					rdbtnOne.setSelected(false);
					rdbtnThree.setSelected(false);
					rdbtnFour.setSelected(false);
							
					OrderNameArray[2] = ", with 2 forks";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
				
		rdbtnThree.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(rdbtnThree.isSelected()) {
					rdbtnOne.setSelected(false);
					rdbtnTwo.setSelected(false);
					rdbtnFour.setSelected(false);
							
					OrderNameArray[2] = ", with 3 forks";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
				}
			}
		});
				
		rdbtnFour.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
						
				if(rdbtnFour.isSelected()) {
					rdbtnOne.setSelected(false);
					rdbtnTwo.setSelected(false);
					rdbtnThree.setSelected(false);
							
					OrderNameArray[2] = ", with 4 forks";
					textField.setText(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] + OrderNameArray[2]);
							
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------

		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		textField.setBounds(5, 211, 496, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
//-----------------------------------------------------------------------------------------------------------

		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(5, 251, 159, 57);
		frame.getContentPane().add(btnClear);
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				
				rdbtnNone.setSelected(false);
				rdbtnWhippedCream.setSelected(false);
				rdbtnCaramel.setSelected(false);
				rdbtnIceCream.setSelected(false);
				rdbtnChocolateSyrup.setSelected(false);
				
				rdbtnOne.setSelected(false);
				rdbtnTwo.setSelected(false);
				rdbtnThree.setSelected(false);
				rdbtnFour.setSelected(false);
				
				textField.setText("");
				for(int j = 0; j < OrderNameArray.length; j++) {
					OrderNameArray[j] = "";
				}
				
			}
		});
		
		JButton btnBack = new JButton("Go Back");
		btnBack.setBounds(176, 251, 154, 57);
		frame.getContentPane().add(btnBack);
		
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Start Page object and call it start
//				DessertPage dessert = new DessertPage();
				
				//call the method that shows the window
				DessertPage.showWindow();
			}
		});
		
		JButton btnAdd = new JButton("Add to Cart");
		btnAdd.setBounds(342, 251, 159, 57);
		frame.getContentPane().add(btnAdd);
		
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Order order = new Order(OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] +  OrderNameArray[2], price);
				OptionPage.AddToCart(order);
				
				JOptionPane.showMessageDialog(null, OrderNameArray[0] + " " + OrderName + " " + OrderNameArray[1] +  OrderNameArray[2] + " is added to the Cart!" );
				frame.setVisible(false);
//				OptionPage option = new OptionPage();
				OptionPage.showWindow();
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
//-----------------------------------------------------------------------------------------------------------
		frame.setVisible(true);
	}
}