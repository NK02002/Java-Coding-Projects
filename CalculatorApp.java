import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorApp implements ActionListener{
	//Adds all the J functions
	JFrame Frame;
	JPanel Panel;
	JTextField TextField;
	JButton[] NumberButtons = new JButton[10];
	JButton[] FunctionButtons = new JButton[10];
	JButton AddButton, SubButton, MultButton, DivButton;
	JButton DecButton, EquButton, DelButton, ClrButton, NegButton, ExitButton;
	
	//Sets calculator font
	Font CalcFont = new Font("Times New Roman",Font.BOLD,30);
	
	double Num1=0, Num2=0, Result=0;
	char Operator;
	
	//Method of Calculator
	CalculatorApp(){
		//Frame configurations
		Frame = new JFrame("Narit's Calculator");
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.setSize(520, 550);
		Frame.setLayout(null);
		
		//TextField Configurations
		TextField = new JTextField();
		TextField.setBounds(50, 25, 300, 50);
		TextField.setFont(CalcFont);
		TextField.setEditable(false);
		
		//Button configurations
		AddButton = new JButton("+");
		SubButton = new JButton("-");
		MultButton = new JButton("*");
		DivButton = new JButton("/");
		DecButton = new JButton(".");
		EquButton = new JButton("=");
		DelButton = new JButton("Delete");
		ClrButton = new JButton("Clear");
		NegButton = new JButton("(-)");
		ExitButton = new JButton("X");
		
		FunctionButtons[0] = AddButton;
		FunctionButtons[1] = SubButton;
		FunctionButtons[2] = MultButton;
		FunctionButtons[3] = DivButton;
		FunctionButtons[4] = DecButton;
		FunctionButtons[5] = EquButton;
		FunctionButtons[6] = DelButton;
		FunctionButtons[7] = ClrButton;
		FunctionButtons[8] = NegButton;
		FunctionButtons[9] = ExitButton;
		
		//For loop for function buttons
		for(int i=0;i<10;i++){
			FunctionButtons[i].addActionListener(this);
			FunctionButtons[i].setFont(CalcFont);
			FunctionButtons[i].setFocusable(false);
		}
		
		//For loop for number buttons
		for(int i=0;i<10;i++){
			NumberButtons[i] = new JButton(String.valueOf(i));
			NumberButtons[i].addActionListener(this);
			NumberButtons[i].setFont(CalcFont);
			NumberButtons[i].setFocusable(false);
		}
		
		//Sets dimensions for buttons
		ExitButton.setBounds(400,275,100,50);
		NegButton.setBounds(30,430,100,50);
		DelButton.setBounds(150,430,100,50);
		ClrButton.setBounds(250,430,100,50);
		
		//Panel Configurations
		Panel = new JPanel();
		Panel.setBounds(50, 100, 300, 300);
		Panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		//Adding to the Panel
		Panel.add(NumberButtons[1]);
		Panel.add(NumberButtons[2]);
		Panel.add(NumberButtons[3]);
		Panel.add(AddButton);
		Panel.add(NumberButtons[4]);
		Panel.add(NumberButtons[5]);
		Panel.add(NumberButtons[6]);
		Panel.add(SubButton);
		Panel.add(NumberButtons[7]);
		Panel.add(NumberButtons[8]);
		Panel.add(NumberButtons[9]);
		Panel.add(MultButton);
		Panel.add(DecButton);
		Panel.add(NumberButtons[0]);
		Panel.add(EquButton);
		Panel.add(DivButton);
		
		//Adding to the Frame
		Frame.setVisible(true);
		Frame.add(TextField);
		Frame.add(DelButton);
		Frame.add(ClrButton);
		Frame.add(NegButton);
		Frame.add(ExitButton);
		Frame.add(Panel);
	}
		
	//Main method of calculator	
	public static void main(String[] args){
		CalculatorApp Calc = new CalculatorApp();
	}
	
	//ActionEvents
	@Override
	public void actionPerformed(ActionEvent e){
		for(int i=0;i<10;i++){
			if(e.getSource() == NumberButtons[i]){
				TextField.setText(TextField.getText().concat(String.valueOf(i)));
			}
		}
		if(e.getSource() == DecButton){
			TextField.setText(TextField.getText().concat("."));
		}
		if(e.getSource() == AddButton){
			Num1 = Double.parseDouble(TextField.getText());
			Operator = '+';
			TextField.setText("");
		}
		if(e.getSource() == SubButton){
			Num1 = Double.parseDouble(TextField.getText());
			Operator = '-';
			TextField.setText("");
		}
		if(e.getSource() == MultButton){
			Num1 = Double.parseDouble(TextField.getText());
			Operator = '*';
			TextField.setText("");
		}
		if(e.getSource() == DivButton){
			Num1 = Double.parseDouble(TextField.getText());
			Operator = '/';
			TextField.setText("");
		}
		if(e.getSource() == EquButton){
			Num2 = Double.parseDouble(TextField.getText());
			
			switch(Operator){
				case'+':
					Result = Num1+Num2;
					break;
				case'-':
					Result = Num1-Num2;
					break;
				case'*':
					Result = Num1*Num2;
					break;
				case'/':
					Result = Num1/Num2;
					break;
			}
			TextField.setText(String.valueOf(Result));
			Num1 = Result;
		}
		if(e.getSource() == ClrButton){
			TextField.setText("");
		}
		if(e.getSource() == DelButton){
			String string = TextField.getText();
			TextField.setText("");
			for(int i=0;i<string.length()-1;i++){
				TextField.setText(TextField.getText()+string.charAt(i));
			}
		if(e.getSource() == NegButton){
			double Temp = Double.parseDouble(TextField.getText());
			Temp*=-1;
			TextField.setText(String.valueOf(Temp));
			}
		if(e.getSource() == ExitButton){
			System.exit(0);
			}
		}
	}
}