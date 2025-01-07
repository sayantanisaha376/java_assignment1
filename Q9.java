public class Q9 {
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
                                       // Call to calculate and print factorial
        printFactorial(num);
    }

                                      // Method to print the factorial of a number
static void printFactorial(int num) {
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

                                    // Method to calculate the factorial of a number
   static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

