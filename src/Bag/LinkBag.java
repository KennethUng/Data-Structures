package Bag;

public class LinkBag<T> implements BagInterface<T> {

    private Node root;
    private int numOfEntries;

    public LinkBag() {
        root = null;
        numOfEntries = 0;
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

