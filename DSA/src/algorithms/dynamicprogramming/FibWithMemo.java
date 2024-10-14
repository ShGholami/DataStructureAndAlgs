package algorithms.dynamicprogramming;

public class FibWithMemo {
    private static Integer[] memo = new Integer[100];
    private static int counter = 0;

    public static int fib(int n) {
        counter++;
        if(memo[n] != null){
            return memo[n];
        }
        if (n == 0 || n == 1) {
            return n;
        }
        memo[n] = fib(n-1) + fib(n-2);
        return memo[n];
    }

    public static void main(String[] args) {
        //Note! run 0ne by one to get correct result

        /*
        System.out.println("fib 7: " + fib(7));
        System.out.println("Number of method calls: " + counter);
        System.out.println("*".repeat(40));
         */

         /*
        System.out.println("fib 20: " + fib(20));
        System.out.println("Number of method calls: " + counter);
          */


        System.out.println("*".repeat(40));
        System.out.println("fib 40: " + fib(40));
        System.out.println("Number of method calls: " + counter);

    }
}
