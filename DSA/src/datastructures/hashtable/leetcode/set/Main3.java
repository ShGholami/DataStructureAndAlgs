package datastructures.hashtable.leetcode.set;

import java.util.*;

public class Main3 {
    public static List<int[]> findPairs(int[] arr1, int[] arr2, int target) {
        if(arr1 == null || arr2 == null)
            return null;
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1)
            set1.add(i);

        List<int[]> pairs = new ArrayList<>();
        for (int i : arr2) {
            int complement = target - i;
            if(set1.contains(complement)){
                pairs.add(new int[]{complement, i});
                //It seems that the question wants the duplicates to be considered
                //set1.remove(complement);
            }
        }

        return pairs;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        int target = 7;

        List<int[]> pairs = findPairs(arr1, arr2, target);
        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }

        /*
            EXPECTED OUTPUT:
            ----------------
            [5, 2]
            [3, 4]
            [1, 6]

        */

    }


}
