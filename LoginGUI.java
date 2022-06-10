import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI implements ActionListener
{
	private static JLabel UserLabel;
	private static JTextField Username;
	
	private static JLabel PassLabel;
	private static JPasswordField Password;
	
	private static JButton Button;
	private static JLabel success;
	
	public static void main(String[] args)
	{
		JPanel Panel = new JPanel();
		JFrame Frame = new JFrame();
		Frame.setSize(300, 300);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setTitle("Login Page");
		Frame.add(Panel);
		
		Panel.setLayout(null);
		
		//Username
		UserLabel = new JLabel("Username");
		UserLabel.setBounds(10, 20, 80, 25);
		Panel.add(UserLabel);
		
		Username = new JTextField(20);
		Username.setBounds(100, 20, 165, 25);
		Panel.add(Username);
		
		//Password
		PassLabel = new JLabel("Password");
		PassLabel.setBounds(10, 50, 80, 25);
		Panel.add(PassLabel);
		
		Password = new JPasswordField();
		Password.setBounds(100, 50, 165, 25);
		Panel.add(Password);
		
		//Button
		Button = new JButton("Login");
		Button.setBounds(10, 80, 80, 25);
		Button.addActionListener(new LoginGUI());
		Panel.add(Button);
		
		//Success Login
		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		Panel.add(success);
		
		Frame.setVisible(true);
		}
		
		@Override
		public void actionPerformed(ActionEvent e){
			String user = Username.getText();
			String password = Password.getText();
			
			if(user.equals("narit") && password.equals("tekno")){
			success.setText("Login successful!");
		}
		
		else{
			success.setText("Login Invalid");
		}
	}
}