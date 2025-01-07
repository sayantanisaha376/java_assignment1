//@Author: Sayantani
public class Q10 {
    public static void main(String[] args) {
        handleCommandLineInput(args);
    }
                                         // Method to handle command line input
    
    static void handleCommandLineInput(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
                                        // Parse the input number
        int num = Integer.parseInt(args[0]);
                                       // Call to check if the number is prime and print results
        printPrimeCheckResult(num);
    }
                                      // Method to print if the number is prime and other details
    static void printPrimeCheckResult(int num) {
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
            if (num % 2 != 0) {
                System.out.println(num + " is also an odd number.");
            } else {
                System.out.println(num + " is not an odd number.");
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
                                     // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
