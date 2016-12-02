import java.util.Scanner;

public class Session2Assignment1 {
	/*
	 * Write a Java program to allow the user to input his/her age. Then the
	 * program has to show whether the person is eligible to vote or not.
	 *
	 * 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age: ");
		age = scan.nextInt();
		
		if (age > 17)
			System.out.println("You are eligible to vote.");
		else
			System.out.println("You are not eligible to vote");
		
	}

}
