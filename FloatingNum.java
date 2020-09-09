/*
Bob has a floating point number N.
He wants to set the precision for 2 digits after decimal point for the number.
INPUT:
the first line contains T, the number of test cases.
Next T line contains floating point number N.
1
713.166
OUTPUT:
Print N in a separate line after setting precision for 2 digits after the decimal point for the number.
713.17
*/
import java.util.Scanner;

public class FloatingNum {
    public static void main(String[] args) {
        int testCases = 0;
        double num = 0;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        for(int i=0; i < testCases; i++) {
            num = sc.nextDouble();
            System.out.println(String.format("%.2f", num));
        }
        sc.close();

    }
}