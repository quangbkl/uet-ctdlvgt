package week3.stack;

public class ArrayStackTestDrive {
    public static void main(String[] args) {
        ArrayStack<Integer> newStack = new ArrayStack<>(Integer.class);

        // Test error.
        try {
            int val = newStack.top();
            System.out.println(val);
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        try {
            newStack.push(5);
        } catch (StackFullException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(newStack.pop());
        } catch (StackEmptyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(newStack.size());

        System.out.println(newStack.isEmpty());
    }
}
