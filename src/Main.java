//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Primitive Data Types
        int number = 18;
        double price = 9.99;
        char grade = 'A';
        boolean isPrime = true;

        // Non-Primitive Data Types
        String greeting = "Hello World!";
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int greetLength = greeting.length();
        int total = add(greetLength, number);
        double ratio = ratio(greetLength, number);

        System.out.println(total);
        System.out.println(ratio);

    }
    public static int add(int a, int b) {
        return a + b;
    }

    public static double ratio(int a, int b) {
        if (a + b == 0) return 0;
        return (double) a / (a + b) * 100;
    }
}