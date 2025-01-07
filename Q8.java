public class Q8 {
    public static void main(String[] args) {
        callAllLoopMethods();
    }

    // Method to call all loop methods
    static void callAllLoopMethods() {
        printWithForLoop();
        printWithWhileLoop();
        printWithDoWhileLoop();
    }

    // Method to print numbers 1 to 10 using a for loop
    static void printWithForLoop() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Method to print numbers 1 to 10 using a while loop
    static void printWithWhileLoop() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    // Method to print numbers 1 to 10 using a do-while loop
    static void printWithDoWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

