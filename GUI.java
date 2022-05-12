import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI implements ActionListener{
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;

	public GUI(){
		frame = new JFrame();
		
		JButton button = new JButton("Clickity click click");
		button.addActionListener(this);
		
		label = new JLabel("Number Of Clicks: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 30, 50));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Clicker");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args){
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e){
		count++;
		label.setText("Number Of Clicks: " +count);
	}
}