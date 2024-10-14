package algorithms.dynamicprogramming;

public class FibNoMemo {
    public static int counter = 0;

    public static int fib(int n) {
        counter++;
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("fib 7: " + fib(7));
        System.out.println("Number of method calls: " + counter);

        counter = 0;
        System.out.println("*".repeat(40));

        System.out.println("fib 20: " + fib(20));
        System.out.println("Number of method calls: " + counter);

        counter = 0;
        System.out.println("*".repeat(40));

        System.out.println("fib 40: " + fib(40));
        System.out.println("Number of method calls: " + counter);
    }
}
