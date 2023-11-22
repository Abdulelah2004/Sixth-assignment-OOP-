//Abdulelah Ahmed

package Assignment6;

import java.util.Scanner;

public class Two {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n (>=10): ");
        int n = scanner.nextInt();

        if (n <= 10) {
            
            System.out.println("Multiplication Table " + n + " x " + n + ":");

            
            System.out.print("    ");
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
            }
            System.out.println();

            
            for (int i = 1; i <= n; i++) {
                System.out.printf("%-4d", i);
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%-4d", i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Enter a value of n less than or equal to 10.");
        }
    }
}
