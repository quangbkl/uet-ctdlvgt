package week3.stack;

import java.lang.reflect.Array;

public class ArrayStack<T> {
    public static final int CAPACITY = 1024;
    private int lengthStack;
    private T Stacks[];
    private int indexItem = -1;
    private Class<T> tclass;

    public ArrayStack(Class<T> tclass) {
        this(tclass, CAPACITY);
    }

    public ArrayStack(Class<T> tclass, int cap) {
        this.tclass = tclass;
        lengthStack = cap;
        Stacks = (T[]) Array.newInstance(tclass, cap);
    }

    public void newStack(Class<T> tclass) {
        lengthStack = CAPACITY;
        Stacks = (T[]) Array.newInstance(tclass, CAPACITY);
    }

    public int size() {
        return indexItem + 1;
    }

    public boolean isEmpty() {
        return indexItem < 0;
    }

    public T top() throws StackEmptyException {
        T element;
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        element = Stacks[indexItem];
        Stacks[indexItem--] = null;
        return element;
    }

    public void push(T element) throws StackFullException {
        if (size() == lengthStack) {
            lengthStack += CAPACITY;
            T newStacks[] = Stacks = (T[]) Array.newInstance(tclass, lengthStack);

            for (int i = 0, length = size(); i < length; i++) {
                newStacks[i] = Stacks[i];
            }

            Stacks = newStacks;
        }
        Stacks[++indexItem] = element;
    }

    public T pop() throws StackEmptyException {
        if (isEmpty()) throw new StackEmptyException("Stack is empty.");
        return Stacks[indexItem];
    }
}
