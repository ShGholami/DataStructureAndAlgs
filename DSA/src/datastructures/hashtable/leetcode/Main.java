package datastructures.hashtable.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    //Solution provided by the course --> count-based
    //O(n)
    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int num : nums) {
            //first time when a key is added its value will be 1, every other time the existing count will be fetched and added by one
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    //Solution provided by me --> Uses a Boolean value to track duplicates
    //O(n)
    private static List<Integer> findDuplicates2(int[] nums) {
        HashMap<Integer, Boolean> numMap = new HashMap<>();
        List<Integer> duplicateList = new ArrayList<>();
        for (int i : nums) {
            if (numMap.get(i) == null)
                numMap.put(i, true);
            else {
                if (numMap.get(i))
                    duplicateList.add(i);
                numMap.put(i, false);
            }
        }

        return duplicateList;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 1, 4, 5, 4};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);

        int[] nums2 = {1, 2, 3, 4, 5};
        List<Integer> duplicates2 = findDuplicates(nums2);
        System.out.println(duplicates2);

        int[] nums3 = {3, 3, 3, 3, 3};
        List<Integer> duplicates3 = findDuplicates(nums3);
        System.out.println(duplicates3);

        int[] nums4 = {-1, 0, 1, 0, -1, -1, 2, 2};
        List<Integer> duplicates4 = findDuplicates(nums4);
        System.out.println(duplicates4);

        int[] nums5 = {};
        List<Integer> duplicates5 = findDuplicates(nums5);
        System.out.println(duplicates5);

        /*
            EXPECTED OUTPUT:
            ----------------
			[1, 2, 4]

        */

    }
}
