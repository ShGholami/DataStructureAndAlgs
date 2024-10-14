package datastructures.hashtable.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main3 {

    public static List<List<String>> groupAnagrams(String[] stringArr) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String s : stringArr) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);

            //the rest of the for loop can be reduced to ----> ** hashMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
            if (hashMap.containsKey(sorted)) {
                hashMap.get(sorted).add(s);
            } else {
                List<String> groupList = new ArrayList<>();
                groupList.add(s);
                hashMap.put(sorted, groupList);
            }
        }

        return new ArrayList<>(hashMap.values());
        /*
        hashMap.values() returns a Collection<List<String>> that is a view of the values in the HashMap.
        new ArrayList<>(hashMap.values()) converts this Collection into a List:
        Ensures type compatibility with the required return type (List<List<String>>).
        Creates a new list instance that is independent of the original map, allowing for modifications without affecting the original HashMap.
        Supports all List operations that are not available for a Collection, such as index-based access.
        */
    }

    /*
     ** hashMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
     * computeIfAbsent(): This is a method of the Map interface. It checks if the key is already present in the map.
     * If the key is not present, it computes a value for that key using the given function and adds it to the map.
     * If the key is present, it simply returns the existing value.
     *
     * Parameters of computeIfAbsent:
sorted: This is the key. In the context of the anagram problem, sorted is the sorted version of the current string.
k -> new ArrayList<>(): This is a lambda expression. It is a function that tells computeIfAbsent how to create a new value if the key does not exist in the map. Specifically, k -> new ArrayList<>() means, "If the key is not present, create a new ArrayList and associate it with this key."
add(s): After computeIfAbsent either retrieves or creates the list, .add(s) is used to add the original string (s) to that list.
     */

    public static void main(String[] args) {
        System.out.println("1st set:");
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

        System.out.println("\n2nd set:");
        System.out.println(groupAnagrams(new String[]{"abc", "cba", "bac", "foo", "bar"}));

        System.out.println("\n3rd set:");
        System.out.println(groupAnagrams(new String[]{"listen", "silent", "triangle", "integral", "garden", "ranged"}));

        /*
            EXPECTED OUTPUT:
            ----------------
            1st set:
            [[eat, tea, ate], [tan, nat], [bat]]

            2nd set:
            [[abc, cba, bac], [foo], [bar]]

            3rd set:
            [[listen, silent], [triangle, integral], [garden, ranged]]

        */

    }

    private static int getAscii(String input) {
        char[] charArray = input.toCharArray();
        int ascii = 0;
        for (char c : charArray) {
            ascii += c;
        }

        return ascii;
    }
}
