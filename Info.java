import java.util.*;
import javax.swing.JOptionPane;

public class Info
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		int age = Integer.parseInt(JOptionPane.showInputDialog("What is your age?"));
		
		JOptionPane.showMessageDialog(null, "Your name is "+name+" and you are "+age+" years old.");
		
	}
}