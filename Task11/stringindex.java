package Task11;

public class stringindex {
    public static void main(String[] args) {
        String text = "Hello";

        try {
            char character = text.charAt(10);
            System.out.println("Character: " + character);
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}