package Task11;

public class arrayindex {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int element = numbers[0];
            System.out.println("Element: " + element);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
