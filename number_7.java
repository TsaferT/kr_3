import java.util.Stack;

public class number_7 {
    public static void swapStacks(Stack<Integer> stack1, Stack<Integer> stack2) {
        Stack<Integer> tempStack = new Stack<>();


        while (!stack1.isEmpty()) {
            tempStack.push(stack1.pop());
        }


        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }


        while (!tempStack.isEmpty()) {
            stack2.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();


        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);


        System.out.println("Before swapping:");
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);


        swapStacks(stack1, stack2);


        System.out.println("\nAfter swapping:");
        System.out.println("Stack 1: " + stack1);
        System.out.println("Stack 2: " + stack2);
    }
}
