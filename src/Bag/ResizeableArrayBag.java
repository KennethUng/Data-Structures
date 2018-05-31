package Bag;

import java.util.Arrays;

public class ResizeableArrayBag<T> implements BagInterface<T>{

    private T[] bag;
    private static int INITIAL_CAPACITY = 25;
    private int numberOfEntries;


    public ResizeableArrayBag() {
        this(INITIAL_CAPACITY);
    }

    public ResizeableArrayBag(int capacity) {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[capacity];
        bag = tempBag;
        numberOfEntries = 0;
    }

    public int size() {
        return numberOfEntries;
    }
    public boolean add(T newEntry) {
        checkCapacity();
        bag[numberOfEntries++] = newEntry;
        return true;
    }

    /**
     * Arrays.copyOf method internal implementation run time complexity is O(N), so it is also O(N)
     */
    private void checkCapacity() {
        if(numberOfEntries == bag.length)
            bag = Arrays.copyOf(bag, 2 * bag.length);
    }

    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] tempBag = (T[])new Object[numberOfEntries];
        for(int i = 0; i < tempBag.length;i++) {
            tempBag[i] = bag[i];
        }
        return tempBag;
    }

    public boolean isFull() {
        if(numberOfEntries == bag.length)
            return true;
        return false;
    }

    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    public T remove() {
        T result = removeEntry(numberOfEntries - 1);
        return result;

    }

    public boolean remove(T anEntry) {
        int index = getIndex(anEntry);
        T result = removeEntry(index);
        return anEntry.equals(result);
    }

    private int getIndex(T anEntry) {
        int index = -1;
        boolean found = false;
        for(int i = 0; !found && i < numberOfEntries; i++) {
            if(anEntry.equals(bag[i])) {
                index = i;
                found = true;
            }
        }
        return index;
    }

    private T removeEntry(int givenIndex) {
        T result = null;
        if(!isEmpty() && givenIndex >= 0) {
            result = bag[givenIndex];
            numberOfEntries--;
            bag[givenIndex] = bag[numberOfEntries];
            bag[numberOfEntries] = null;
        }
        return result;

    }

    public void clear() {
        while(!isEmpty()) {
            remove();
        }
    }

    public int bagSize() {
        return bag.length;
    }

    /**
     * Returns the frequency of the Object you are looking for.
     * Average/Best/Worst Case are all the same : Time Complexity = O(N)
     * @param anEntry Object you are looking to get Frequency
     * @return counter which is the number of times that object appears
     */
    public int getFrequencyOf(T anEntry) {
        int counter = 0;
        for(int i = 0; i < numberOfEntries; i++) {
            if(anEntry.equals(bag[i])) {
                counter++;
            }
        }
        return counter;
    }

    public boolean contains(T anEntry) {

        return getIndex(anEntry) > -1;
    }
}
