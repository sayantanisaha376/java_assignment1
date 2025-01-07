public class Q6 {
    public static void main(String[] args) {
        handleCommandLineInput(args);
    }

    // Method to handle command line input
	
    static void handleCommandLineInput(String[] args) {
        if (args.length < 2) {
            System.out.println("Provide both username and password as command-line arguments.");
            return;
        }

        // Parse the input username and password
        String username = args[0];
        String password = args[1];

        // Call to check login credentials and print results
        printLoginResult(username, password);
    }

    // Method to print login result
    static void printLoginResult(String username, String password) {
        if (login(username, password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed.");
        }
    }

    // Method to check login credentials
    public static boolean login(String username, String password) {
        switch (username) {
            case "ankan":
            case "souparna":
                switch (password) {
                    case "Madhu":
                    case "trisha":
                        return true;
                    default:
                        return false;
                }
            default:
                return false;
        }
    }
}
