package Stacks;

public class LinkedStack<T> implements StackInterface<T> {
    private Node top;

    public LinkedStack() {
        top = null;
    }

    /**
     * Worst Case Run Time = O(1).
     * @param value The value of the new Object you want to add to the stack.
     */
    public void push(T value) {
        Node next = new Node(value,top);
        top = next;
    }

    public T peek() {
        T value = null;
        if(top != null) {
            value = top.getValue(); // can also use top.value since inner class.
        }
        return value;
    }

    public T pop() {
        T value = peek();
        if(top != null)
            top = top.getNext(); // Top element removed, and new element is pointed at.
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void clear() {
        top = null; //Since top is pointing to nothing now, the nodes are all dereferenced. 
    }


    private class Node {

        private T value;
        private Node next;

        private Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        private Node(T value) {
            this(value,null);
        }

        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }
}
