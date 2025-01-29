public class MathUtils {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double ratio(int a, int b) {
        if (a + b == 0) return 0;
        return (double) a / (a + b) * 100;
    }
}
