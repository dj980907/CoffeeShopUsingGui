import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class StartPage {

	public static void main(String[] args) {
		
		showWindow();
		
	}
	
	public static void showWindow() {
		
		//this is the title of the window 
		JFrame frame =  new JFrame("start page");
		
		//setting the bounds
		frame.setBounds(100, 100, 515, 342);
		
		//this allows the program to finish when the close button is pressed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//idk why this is needed... but include it
		frame.getContentPane().setLayout(null);
		
//-----------------------------------------------------------------------------------------------------------
		
		//setting the title of the start page
		JLabel lblTitle = new JLabel("Welcome to Sun's Coffee");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		
		//setting the size of the label
		lblTitle.setBounds(73, 33, 369, 64);
		
		//idk
		frame.getContentPane().add(lblTitle);
		
//-----------------------------------------------------------------------------------------------------------
		
		
		//this is for the button
		JButton btnNewButton = new JButton("Get Started");
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		
		//setting the size of the button
		btnNewButton.setBounds(87, 109, 349, 152);
		
		//idk what this is lol
		frame.getContentPane().add(btnNewButton);
		
		//button has a action listener that does certain things
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//this will allow the start page to disappear once the next page is opened
				frame.setVisible(false);
				
				//making the Option Page object and call it option
				OptionPage option = new OptionPage();
				
				//call the method that shows the window
				OptionPage.showWindow();
			}
		});
		
		//this will make the page visible
		frame.setVisible(true);
	}
}
