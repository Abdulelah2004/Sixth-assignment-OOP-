//Abdulelah Ahmed
package Assignment6;

import java.util.Scanner;

public class OneD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of chicks: ");
        int numOfChicks = scanner.nextInt();

        int iteration = 0;

        while (iteration < numOfChicks) {
            System.out.println("Chick " + (numOfChicks - iteration) + " falls down");
            if (iteration < numOfChicks - 1) {
                System.out.println("One goes away, " + (numOfChicks - iteration - 1) + " remains");
            } else {
                System.out.println("No more chicks left");
            }
            iteration++;
        }

    }
}
