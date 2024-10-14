package datastructures.stack.leetcode;

public class Main4 {

    //my implementation
    public static boolean isBalancedParentheses(String input) {
        if (input == null || input.isEmpty() || input.length() == 1) {
            return false;
        }
        Stack2<Character> stack = new Stack2<>();
        for (char c : input.toCharArray()){
            if(c == ')' && stack.isEmpty())
                return false;

            if(c == ')'){
                char top = stack.pop();
                if(top != '(')
                    return false;
                else
                    continue;
            }

            stack.push(c);
        }
        return stack.isEmpty();
    }

    //The course implementation
    public static boolean isBalancedParentheses_2(String input) {
        if (input == null) {
            return true;
        }

        Stack2<Character> stack = new Stack2<>();
        for (char c : input.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

}
