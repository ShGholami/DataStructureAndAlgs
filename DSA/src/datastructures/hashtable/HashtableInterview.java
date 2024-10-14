package datastructures.hashtable;

import java.util.HashMap;

public class HashtableInterview {

    /**
     * Interview question, do array1 and array2 has item in common?
     */


    //inefficient way!!!!!!!!!! Nested loop --> O(n^2)
    public static boolean haveItemInCommon(int[] array1, int[] array2){
        for(int i : array1){
            for(int j : array2){
                if(i==j){
                    return true;
                }
            }
        }

        return false;
    }

    //Efficient way :) using HashMap --> O(n)
    public static boolean haveItemInCommonEfficient(int[] array1, int[] array2){
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for(int i : array1){
            hashMap.put(i, true);
        }

        for(int j : array2){
            if(hashMap.get(j) != null)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 6, 5};
        int[] array2 = {2, 4, 6};

        System.out.println(haveItemInCommonEfficient(array1, array2));
    }
}
