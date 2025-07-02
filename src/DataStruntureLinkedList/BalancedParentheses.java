package DataStruntureLinkedList;

class MyStack {
    private char[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
     MyStack(int size) {
        capacity = size;
        stack = new char[capacity];
        top = -1;
    }

    // Push an element onto the stack
    void push(char ch) {
        if (top < capacity - 1) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Pop an element from the stack
    char pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack Underflow");
            return '\0'; // null character
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}

public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        MyStack stack = new MyStack(expression.length());

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing parenthesis
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); // If stack is empty, parentheses are balanced
    }

    // Test the function
    public static void main(String[] args) {
        String[] testCases = {
                "()",         // true
                "(()())",     // true
                "((())",      // false
                "())(",       // false
                "",           // true
                "(()(()))()"  // true
        };

        for (String test : testCases) {
            System.out.println("Input: " + test + " --> Balanced: " + isBalanced(test));
        }
    }
}
