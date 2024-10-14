package datastructures.stack.leetcode;

public class Main3 {
    //O(n)
    public static String reverseString(String input) {
        if(input == null || input.isEmpty())
            return "";

        Stack2<Character> charStack = new Stack2<>();
        for (int i = 0; i < input.length(); i++) {
            charStack.push(input.charAt(i));
        }

        StringBuilder output = new StringBuilder(input.length());
        for(int i = 0; i < input.length(); i++){
            output.append(charStack.pop());
        }

        return output.toString();
    }

    //O(n^2)
    /**
     * Since strings are immutable in Java, each concatenation results in a new String being created, taking O(n) for each iteration.
     * The total time complexity for this part is O(n^2).
     */
    public static String reverseString_course(String input) {
        if(input == null || input.isEmpty())
            return "";

        String reversedString = "";
        Stack2<Character> charStack = new Stack2<>();
        for(Character c : input.toCharArray()){
            charStack.push(c);
        }

        while (!charStack.isEmpty()){
            reversedString += charStack.pop();
        }
        return reversedString;
    }

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        String myString2 = "";
        String reversedString2 = reverseString(myString2);
        System.out.println(reversedString2);
        System.out.println("empty string is empty: " + myString2.isEmpty());
        System.out.println("empty string is blank: " + myString2.isBlank());
        System.out.println("empty string length: " + myString2.length());

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }
}
