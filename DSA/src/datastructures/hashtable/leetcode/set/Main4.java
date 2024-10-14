package datastructures.hashtable.leetcode.set;

import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static int longestConsecutiveSequence(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;
        for (int num : nums) {
            //The following line is crucial for optimizing the search for the longest consecutive sequence
            //If num - 1 exists in the set, it means num is not the start of a sequence but rather part of an existing sequence.
            //As a result, there's no need to start calculating a new sequence from num.
            //Without this line (if (!numSet.contains(num - 1))), the algorithm would end up iterating over each number in the set to find all possible consecutive numbers, even if they are already part of a sequence that has been evaluated
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentStreak++;
                    currentNum++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }


    public static void main(String[] args) {
        testLongestConsecutiveSequence("Consecutive Integers", new int[]{1, 2, 3, 4, 5}, 5);
        testLongestConsecutiveSequence("No Sequence", new int[]{1, 3, 5, 7, 9}, 1);
        testLongestConsecutiveSequence("Duplicates", new int[]{1, 2, 2, 3, 4}, 4);
        testLongestConsecutiveSequence("Negative Numbers", new int[]{1, 0, -1, -2, -3}, 5);
        testLongestConsecutiveSequence("Empty Array", new int[]{}, 0);
        testLongestConsecutiveSequence("Multiple Sequences", new int[]{1, 2, 3, 10, 11, 12, 13}, 4);
        testLongestConsecutiveSequence("Unordered Elements", new int[]{5, 1, 3, 4, 2}, 5);
        testLongestConsecutiveSequence("Single Element", new int[]{1}, 1);
        testLongestConsecutiveSequence("All Identical Elements", new int[]{2, 2, 2, 2, 2}, 1);
    }

    /**
     * Test method for longestConsecutiveSequence.
     *
     * @param title    Title of the test
     * @param nums     Input array
     * @param expected Expected result
     */
    private static void testLongestConsecutiveSequence(String title, int[] nums, int expected) {
        System.out.println("Test: " + title);
        System.out.print("Testing array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int result = longestConsecutiveSequence(nums);
        System.out.println("Expected longest streak: " + expected);
        System.out.println("Actual longest streak: " + result);

        if (result == expected) {
            System.out.println("PASS\n");
        } else {
            System.out.println("FAIL\n");
        }
    }


}
