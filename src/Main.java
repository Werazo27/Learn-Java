//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Primitive Data Type examples
        int number = 18;
        double price = 9.99;
        char grade = 'A';
        boolean isPrime = true;

        // Non-Primitive Data Type examples
        String greeting = "Hello World!";
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int greetLength = greeting.length();
        int total = MathUtils.add(greetLength, number);
        double ratio = MathUtils.ratio(greetLength, number);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(greeting.charAt(i));
        }

        System.out.println(total);
        System.out.println(ratio);
    }
}