package datastructures.binarysearchtree.leetcode;

public class Main {

    public static void main(String[] args) {
        //Integer Division
        int x = 5/2;
        System.out.println(x);

        System.out.println(calculateMid1(4, 9));
        System.out.println(calculateMid2(4, 9));
        System.out.println(calculateMid3(4, 9));
    }

    private static int calculateMid1(int left, int right){
        //NOT CORRECT
        return (right - left)/2;
    }

    private static int calculateMid2(int left, int right){
        return (left + right)/2;
    }

    private static int calculateMid3(int left, int right){
        return left + (right - left)/2;
    }
}
