package datastructures.hashtable.leetcode;

import java.util.HashMap;

public class Main2 {

    private static Character firstNonRepeatingChar(String inputStr) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        char[] inputStrArr = inputStr.toCharArray();
        for (char c : inputStrArr)
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

        for (char c : inputStrArr) {
            if (charCountMap.get(c) == 1)
                return c;
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("leetcode"));
        System.out.println(firstNonRepeatingChar("hello"));
        System.out.println(firstNonRepeatingChar("aabbcc"));

        /*
            EXPECTED OUTPUT:
            ----------------
            l
            h
            null

        */

    }


}
