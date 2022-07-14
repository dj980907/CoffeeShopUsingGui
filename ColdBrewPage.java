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

public class ColdBrewPage {
	private static JTextField textField;
	private static String [] OrderNameArray = new String[6];
	private static String OrderName = "Cold Brew";
	public static double price = 3.75;

	public static void main(String[] args) {
		
		showWindow();
	
	}
	
	public static void showWindow() {
		
		for(int i = 0; i < OrderNameArray.length; i++) {
			OrderNameArray[i] = "";
		}
		
		//this is the title of the window 
		JFrame frame =  new JFrame("Cold Brew");
				
		//setting the bounds 
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		//idk why this is needed... but include it for safety
		frame.getContentPane().setLayout(null);

//-----------------------------------------------------------------------------------------------------------
		
		JLabel lblNewLabel = new JLabel("Cold Brew");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(212, 6, 105, 32);
		frame.getContentPane().add(lblNewLabel);
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblSize = new JLabel("Size:");
		lblSize.setBounds(5, 53, 35, 15);
		frame.getContentPane().add(lblSize);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		rdbtnSmall.setBounds(35, 50, 70, 20);
		frame.getContentPane().add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setBounds(105, 50, 87, 20);
		frame.getContentPane().add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		rdbtnLarge.setBounds(195, 50, 70, 20);
		frame.getContentPane().add(rdbtnLarge);
		
		JRadioButton rdbtnExtraLarge = new JRadioButton("Extra Large");
		rdbtnExtraLarge.setBounds(265, 50, 120, 20);
		frame.getContentPane().add(rdbtnExtraLarge);
		
		rdbtnSmall.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnSmall.isSelected()) {
					
					rdbtnMedium.setSelected(false);
					rdbtnLarge.setSelected(false);
					rdbtnExtraLarge.setSelected(false);
					
					OrderNameArray[1] = "Small";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);


				}
			}
		});		
		
		rdbtnMedium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnMedium.isSelected()) {
					rdbtnSmall.setSelected(false);
					rdbtnLarge.setSelected(false);
					rdbtnExtraLarge.setSelected(false);
					
					OrderNameArray[1] = "Medium";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnLarge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnLarge.isSelected()) {
					rdbtnSmall.setSelected(false);
					rdbtnMedium.setSelected(false);
					rdbtnExtraLarge.setSelected(false);
					
					OrderNameArray[1] = "Large";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnExtraLarge.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnExtraLarge.isSelected()) {
					rdbtnSmall.setSelected(false);
					rdbtnMedium.setSelected(false);
					rdbtnLarge.setSelected(false);
					
					OrderNameArray[1] = "Extra Large";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
					
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblBean = new JLabel("Bean:");
		lblBean.setBounds(5, 85, 35, 15);
		frame.getContentPane().add(lblBean);
		
		JRadioButton rdbtnNicaragua = new JRadioButton("Nicaragua");
		rdbtnNicaragua.setBounds(35, 83, 95, 20);
		frame.getContentPane().add(rdbtnNicaragua);
		
		JRadioButton rdbtnEthiopia = new JRadioButton("Ethiopia");
		rdbtnEthiopia.setBounds(128, 83, 87, 20);
		frame.getContentPane().add(rdbtnEthiopia);
		
		JRadioButton rdbtnGuatemala = new JRadioButton("Guatemala");
		rdbtnGuatemala.setBounds(212, 83, 105, 20);
		frame.getContentPane().add(rdbtnGuatemala);
		
		JRadioButton rdbtnIndonesia = new JRadioButton("Indonesia");
		rdbtnIndonesia.setBounds(319, 83, 95, 20);
		frame.getContentPane().add(rdbtnIndonesia);
		
		JRadioButton rdbtnColumbia = new JRadioButton("Columbia");
		rdbtnColumbia.setBounds(414, 83, 95, 20);
		frame.getContentPane().add(rdbtnColumbia);
		
		rdbtnNicaragua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNicaragua.isSelected()) {
					rdbtnEthiopia.setSelected(false);
					rdbtnGuatemala.setSelected(false);
					rdbtnIndonesia.setSelected(false);
					rdbtnColumbia.setSelected(false);
					
					OrderNameArray[0] = "Nicaragua Bean";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});		
		
		rdbtnEthiopia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnEthiopia.isSelected()) {
					rdbtnNicaragua.setSelected(false);
					rdbtnGuatemala.setSelected(false);
					rdbtnIndonesia.setSelected(false);
					rdbtnColumbia.setSelected(false);
					
					OrderNameArray[0] = "Ethiopia Bean";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnGuatemala.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnGuatemala.isSelected()) {
					rdbtnNicaragua.setSelected(false);
					rdbtnEthiopia.setSelected(false);
					rdbtnIndonesia.setSelected(false);
					rdbtnColumbia.setSelected(false);
					
					OrderNameArray[0] = "Guatemala Bean";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnIndonesia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnIndonesia.isSelected()) {
					rdbtnNicaragua.setSelected(false);
					rdbtnEthiopia.setSelected(false);
					rdbtnGuatemala.setSelected(false);
					rdbtnColumbia.setSelected(false);
					
					OrderNameArray[0] = "Indonesia Bean";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnColumbia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnColumbia.isSelected()) {
					rdbtnNicaragua.setSelected(false);
					rdbtnEthiopia.setSelected(false);
					rdbtnGuatemala.setSelected(false);
					rdbtnIndonesia.setSelected(false);
					
					OrderNameArray[0] = "Columbia Bean";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblType = new JLabel("Type: Iced Only");
		lblType.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblType.setBounds(5, 118, 159, 15);
		frame.getContentPane().add(lblType);
				
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblMilk = new JLabel("Milk:");
		lblMilk.setBounds(5, 151, 35, 15);
		frame.getContentPane().add(lblMilk);
		
		JRadioButton rdbtnNone = new JRadioButton("None");
		rdbtnNone.setBounds(35, 149, 65, 20);
		frame.getContentPane().add(rdbtnNone);
		
		JRadioButton rdbtnOatMilk = new JRadioButton("Oat Milk");
		rdbtnOatMilk.setBounds(105, 149, 90, 20);
		frame.getContentPane().add(rdbtnOatMilk);
		
		JRadioButton rdbtnCondensed = new JRadioButton("Condensed");
		rdbtnCondensed.setBounds(195, 149, 105, 20);
		frame.getContentPane().add(rdbtnCondensed);

		rdbtnNone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNone.isSelected()) {
					rdbtnOatMilk.setSelected(false);
					rdbtnCondensed.setSelected(false);
					
					OrderNameArray[4] = "with No Milk,";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});

		rdbtnOatMilk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnOatMilk.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnCondensed.setSelected(false);
					
					OrderNameArray[4] = "with Oat Milk,";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnCondensed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnCondensed.isSelected()) {
					rdbtnNone.setSelected(false);
					rdbtnOatMilk.setSelected(false);
					
					OrderNameArray[4] = "with Condensed Milk,";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
//-----------------------------------------------------------------------------------------------------------
		//setBounds(x-coordinate, y-coordinate, length, height)
		
		JLabel lblSyrup = new JLabel("Syrup:");
		lblSyrup.setBounds(5, 184, 44, 15);
		frame.getContentPane().add(lblSyrup);
		
		JRadioButton rdbtnNone2 = new JRadioButton("None");
		rdbtnNone2.setBounds(45, 182, 85, 20);
		frame.getContentPane().add(rdbtnNone2);
		
		JRadioButton rdbtnSugar = new JRadioButton("Sugar");
		rdbtnSugar.setBounds(115, 182, 70, 20);
		frame.getContentPane().add(rdbtnSugar);
		
		JRadioButton rdbtnVanilla = new JRadioButton("Vanilla");
		rdbtnVanilla.setBounds(182, 182, 80, 20);
		frame.getContentPane().add(rdbtnVanilla);
		
		JRadioButton rdbtnMocha = new JRadioButton("Mocha");
		rdbtnMocha.setBounds(255, 182, 75, 20);
		frame.getContentPane().add(rdbtnMocha);
		
		JRadioButton rdbtnWhiteChocolateMocha = new JRadioButton("White Chocolate Mocha");
		rdbtnWhiteChocolateMocha.setBounds(325, 182, 185, 20);
		frame.getContentPane().add(rdbtnWhiteChocolateMocha);
		
		rdbtnNone2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnNone2.isSelected()) {
					rdbtnSugar.setSelected(false);
					rdbtnVanilla.setSelected(false);
					rdbtnMocha.setSelected(false);
					rdbtnWhiteChocolateMocha.setSelected(false);
					
					OrderNameArray[5] = "with No Syrup";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});

		rdbtnSugar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnSugar.isSelected()) {
					rdbtnNone2.setSelected(false);
					rdbtnVanilla.setSelected(false);
					rdbtnMocha.setSelected(false);
					rdbtnWhiteChocolateMocha.setSelected(false);
					
					OrderNameArray[5] = "with Sugar";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnVanilla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnVanilla.isSelected()) {
					rdbtnNone2.setSelected(false);
					rdbtnSugar.setSelected(false);
					rdbtnMocha.setSelected(false);
					rdbtnWhiteChocolateMocha.setSelected(false);
					
					OrderNameArray[5] = "with Vanilla";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});
		
		rdbtnMocha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnMocha.isSelected()) {
					rdbtnNone2.setSelected(false);
					rdbtnSugar.setSelected(false);
					rdbtnVanilla.setSelected(false);
					rdbtnWhiteChocolateMocha.setSelected(false);
					
					OrderNameArray[5] = "with Mocha";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
				}
			}
		});

		rdbtnWhiteChocolateMocha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnWhiteChocolateMocha.isSelected()) {
					rdbtnNone2.setSelected(false);
					rdbtnSugar.setSelected(false);
					rdbtnVanilla.setSelected(false);
					rdbtnMocha.setSelected(false);
					
					OrderNameArray[5] = "with White Chocolate Mocha";
					textField.setText(OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5]);
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
				
				rdbtnSmall.setSelected(false);
				rdbtnMedium.setSelected(false);
				rdbtnLarge.setSelected(false);
				rdbtnExtraLarge.setSelected(false);
				
				rdbtnNicaragua.setSelected(false);
				rdbtnEthiopia.setSelected(false);
				rdbtnGuatemala.setSelected(false);
				rdbtnIndonesia.setSelected(false);
				rdbtnColumbia.setSelected(false);
				
				rdbtnNone.setSelected(false);
				rdbtnOatMilk.setSelected(false);
				rdbtnCondensed.setSelected(false);
				
				rdbtnNone2.setSelected(false);
				rdbtnSugar.setSelected(false);
				rdbtnVanilla.setSelected(false);
				rdbtnMocha.setSelected(false);
				rdbtnWhiteChocolateMocha.setSelected(false);
				
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
//				DripPage drip = new DripPage();
				
				//call the method that shows the window
				DripPage.showWindow();
			}
		});
		
		JButton btnAdd = new JButton("Add to Cart");
		btnAdd.setBounds(342, 251, 159, 57);
		frame.getContentPane().add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Order order = new Order(OrderNameArray[0] + " " + OrderNameArray[1] +  " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5], price);
				OptionPage.AddToCart(order);
				
				JOptionPane.showMessageDialog(null, OrderNameArray[0] + " " + OrderNameArray[1] + " " + OrderName + " " + OrderNameArray[4] + " " + OrderNameArray[5] + " is added to the Cart!" );
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
