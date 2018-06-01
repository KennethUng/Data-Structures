package Stacks;

import java.util.Arrays;

public class ArrayStack<T> implements StackInterface<T> {

    private T[] stack;
    private int top;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public ArrayStack(int capacity) {

        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[capacity];
        stack = temp;
        top = -1;

    }

    public void push(T value) {
        checkCapacity();
        stack[++top] = value; //increments top by 1, then adds to that index.
    }

    public void checkCapacity() {
        if(top == stack.length - 1)
            stack = Arrays.copyOf(stack, 2 * stack.length);
    }

    public T peek() {
        T topValue = null;
        if(!isEmpty())
            topValue = stack[top];
        return topValue;
    }

    public T pop() {
        T topValue = null;
        if(!isEmpty()) {
            topValue = stack[top];
            stack[top--] = null; //Sets top to null, then decrements
        }
        return topValue;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * My implementation of the clear method will be to remove
     * each element of the Stack and set them to null. This is not
     * needed and we can just set top to -1.
     */
    public void clear() {
        while(!isEmpty())
            pop();
    }


}
