package datastructures.hashtable.leetcode.set;

import java.util.*;

public class Main2 {

    /**
     It provides an early exit when duplicates are found, making it more efficient in cases where duplicates occur early in the input string.
     It maintains the same overall complexity while potentially reducing the number of operations in many practical scenarios.
     */
    private static boolean hasUniqueChars(String string) {
        Set<Character> set = new HashSet<>();
        for(char c : string.toCharArray()){
            if(set.contains(c))
                return false;
            set.add(c);
        }
        return true;
    }

    public static boolean hasUniqueChars2(String string) {
        Set<Character> set = new HashSet<>();
        for(char c : string.toCharArray()){
            set.add(c);
        }
        return set.size() == string.length();
    }


    public static void main(String[] args) {
        System.out.println(hasUniqueChars("abcdefg")); // should return true
        System.out.println(hasUniqueChars("hello")); // should return false
        System.out.println(hasUniqueChars("")); // should return true
        System.out.println(hasUniqueChars("0123456789")); // should return true
        System.out.println(hasUniqueChars("abacadaeaf")); // should return false

        /*
            EXPECTED OUTPUT:
            ----------------
            true
            false
            true
            true
            false

        */

    }


}
