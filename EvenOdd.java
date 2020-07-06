import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number");
		int userVal = obj.nextInt();

		if(userVal % 2 == 0) {
			System.out.println(userVal + " is an even number");
		}
		else {
			System.out.println(userVal + " is an odd number");
		}
	}
}