//Abdulelah Ahmed
package Assignment6;

public class OneA {

    public static void main(String[] args) {
        System.out.println("Prime Numbers:");
        for (int i = 0; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNon-Prime Numbers:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
