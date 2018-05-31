package Bag;

public class LinkBag<T> implements BagInterface<T> {

    private Node root;
    private int numOfEntries;

    public LinkBag() {

        root = null;
        numOfEntries = 0;
    }

    public boolean add(T value) {

        Node next = new Node(value);
        next.nextNode = root;

        root = next;
        numOfEntries++;
        return true;
    }

    public T[] toArray() {

        @SuppressWarnings("unchecked")
        T[] results = (T[])new Object[numOfEntries];

        int index = 0;
        Node traversal = root;
        while((index < numOfEntries) && (traversal != null)) {

            results[index] = traversal.value;
            index++;
            traversal = traversal.nextNode;
        }
        return results;
    }

    public int getFrequencyOf(T value) {
        int frequency = 0;
        Node traversal = root;
        while(traversal != null) {
            if(traversal.value.equals(value))
                frequency++;
            traversal = traversal.nextNode;
        }
        return frequency;
    }

    public boolean contains(T value) {
        return getRef(value) != null;
    }

    public T remove() {
        T result = null;
        if(root != null) {
            result = root.value;
            root = root.nextNode; //Removes the first node of the Bag, since the previous root has no reference now, it is destroyed.
            numOfEntries--;

        }
        return result;
    }

    public boolean remove(T value) {
        boolean result = false;
        Node removal = getRef(value);
        if(removal != null) {
            removal.value = root.value; //Setting the value of the "removed" Node to the value of the root
            remove(); //Actually removing the root node instead of
            result = true;
        }
        return result;

    }

    public boolean isEmpty() {
        return numOfEntries > 0;
    }

    public void clear() {
        while(!isEmpty())
            remove();
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        return numOfEntries;
    }

    private Node getRef(T value) {
        boolean found = false;
        Node current = root;
        while(!found && current != null) {
            if(current.value.equals(value))
                found = true;
            else
                current = current.nextNode;
        }
        return current;
    }


    /**
     * This is a private class (inner class) within the LinkBag class, it is the Object that will be stored
     * in our Link Bag. We don't have to put the <T> for the Node class, since it inherits the generic type from
     * the outer class. Also, since it is a inner class, we do not need to implement set and get methods, and the
     * outer class can just access the fields of the Node class.
     */
    private class Node {

        private T value;
        private Node nextNode;

        private Node(T value) {
            this(value,null);
        }

        private Node(T value, Node nextNode) {
            this.value = value;
            this.nextNode = nextNode;
        }

    }
}

