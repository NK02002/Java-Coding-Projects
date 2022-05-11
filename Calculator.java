import java.util.*;
import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nEnter your order of operations: ");
		System.out.println("+. Addition");
		System.out.println("-. Substraction");
		System.out.println("*. Multiplication");
		System.out.println("/. Division");
		char operation = input.next().charAt(0);
		System.out.println("\n");
		
		System.out.println("Enter your first number: ");
		double ans1 = input.nextInt();
		
		System.out.println("\nEnter your second number: ");
		double ans2 = input.nextInt();
		
		double addition = ans1 + ans2;
		double subtraction = ans1 - ans2;
		double multiplication = ans1 * ans2;
		double division = ans1/ans2;
	
	switch(operation){
		case '+':
			System.out.println("\n");
			System.out.println(addition);
			break;
		case '-':
			System.out.println("\n");
			System.out.println(subtraction);
			break;
		case '*':
			System.out.println("\n");
			System.out.println(multiplication);
			break;
		case '/':
			System.out.println("\n");
			System.out.println(division);
			break;
		}
	}
}