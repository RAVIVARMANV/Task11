package Task11;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
            
            if (!isValidPassword(enteredPassword)) {
                throw new IncorrectPasswordException("Incorrect password");
            }

            System.out.println("Login successful for user: " + username);

        } catch (IncorrectPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static boolean isValidPassword(String enteredPassword) {
    	
        return "correctPassword".equals(enteredPassword);
    }

    static class IncorrectPasswordException extends Exception {
        public IncorrectPasswordException(String message) {
            super(message);
        }
    }
}
