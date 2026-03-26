import java.util.Scanner;

// Custom Exception Class
class InvalidLoginException extends Exception {
    public InvalidLoginException(String message) {
        super(message);
    }
}

public class UserAuth {

    // Method to validate login
    static void authenticate(String username, String password) 
            throws InvalidLoginException {

        String validUser = "admin";
        String validPass = "1234";

        if (!username.equals(validUser) || !password.equals(validPass)) {
            throw new InvalidLoginException("Invalid Username or Password!");
        } else {
            System.out.println("Login Successful!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.nextLine();

        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        try {
            authenticate(user, pass);
        } catch (InvalidLoginException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}