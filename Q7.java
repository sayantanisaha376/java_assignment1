
public class GreetUser {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide at least three usernames as command-line arguments.");
            return;
        }

        Usernames(args);
    }

    // Method to calculate the length of a string
    static int getLength(String str) {
        return str.length();
    }

    // Method to process usernames and greet the user if length > 3
    static void Usernames(String[] args) {
        for (String username : args) {
            int length = getLength(username);
            greetUser(username, length);
        }
    }

    // Method to greet the user based on username length using switch case
    static void greetUser(String username, int length) {
        switch (length) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Hello " + username + ", Username length is: " + length);
                break;
            default:
               else {
                    System.out.println("Enter valid username..........");
                }
                break;
        }
    }
}
