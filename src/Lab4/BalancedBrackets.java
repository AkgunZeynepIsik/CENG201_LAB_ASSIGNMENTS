package Lab4;

public class BalancedBrackets {

    public static boolean isBalanced(String s) {

        // Create a stack
        BracketStack stack = new BracketStack();

        // TODO:
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) return false;
                char c1 = stack.pop();
                if (c == '{' && c1 == '}') {
                    stack.pop();

                }
            }


        }
        // 1. Traverse the string character by character.
        // 2. If the character is an opening bracket,
        //    push it onto the stack.
        // 3. If it is a closing bracket:
        //      - Check whether the stack is empty.
        //      - Pop the top opening bracket.
        //      - Check whether the brackets match.(call isMatchingPair method)
        // 4. At the end, check whether the stack is empty.

        if (stack.isEmpty()) {
            return true;
        }


        private static boolean isMatchingPair ( char opening, char closing){

            // Check: ( matches )

            // Check: [ matches ]

            // Check: { matches }

            // if check doesnt match; then return false

            return false;
        }
    }
}