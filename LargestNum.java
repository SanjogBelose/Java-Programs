import java.util.Scanner;
public class LargestNum {
	public static void main(String args[]) {
		System.out.println("Enter 3 numbers");
		Scanner obj = new Scanner(System.in);
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		int num3 = obj.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is the largest number");
		} else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println(num3 + " is the largest number");
		}

	}
}