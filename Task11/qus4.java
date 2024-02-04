package Task11;

import java.util.Scanner;

public class qus4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the numerator (an integer): ");
            int n1 = scanner.nextInt();
    
            System.out.print("Enter the denominator (an integer): ");
            int n2 = scanner.nextInt();

            
            double result = divide(n1, n2);

      
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException | java.util.InputMismatchException ex) {
            
            System.out.println("Error: " + ex.getMessage());
        } finally {
            
            scanner.close();
        }
    }

    
    private static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) numerator / denominator;
    }
}