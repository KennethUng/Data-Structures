package Stacks;

import java.util.Vector;

/**
 * We are going to be implementing a Stack off of Vectors, using Java's Class Library Vector class.
 * A Vector is similar to a Array, as it is technically a high level array.
 * Some might ask why not just use inheritance of a Vector to derive our VectorStack
 * We don't do this because of the reason that a Stack is not a vector.
 *    (1) Stacks can't remove any index in the stack, a vector can.
 *    (2) Stacks can't also add to any index, it adds to the top. Vectors allow adding anywhere
 * If we use inheritance, we would more or less be making an enhanced vector.
 * @param <T>
 */

public class VectorStack<T> implements StackInterface<T> {

    private Vector<T> stack;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public VectorStack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    public VectorStack(int capacity) {
        stack = new Vector<T>(capacity);
    }

    public void push(T value) {
        stack.add(value);
    }

    public T peek() {

        T top = null;

        if(!isEmpty())
            top = stack.lastElement();

        return top;
    }

    public T pop() {

        T top = null;

        if(!isEmpty())
            top = stack.remove(stack.size() - 1); //Vector remove function returns the value that was removed.

        return top;

    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clear() {
        stack.clear();
    }


}
