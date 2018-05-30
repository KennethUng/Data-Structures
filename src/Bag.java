/**
 * Bags contain things, in respect to the real world, bags are a type of container.
 * In Java, or any programming language, a container is an object whose class extends the standard Container class.
 * So in Java, a bag is considered a collection. It differs from other collections such that it doesn't care
 * what order its items are in and it doesn't prevent duplication of items.
 * Think of a bag, what kind of Methods/Functions would we need in it.
 * =============================================================================================
 * 1. Bags contain a finite number of items.
 *      So we need a method that returns the number of items currently in the bag.
 * 2. Since a bag contains a finite number of items, need to know when it is full or empty.
 * 3. We would also need the functionality to remove or add items to the bag.
 *      Can remove by:
 *          1. Unspecified object (remove randomly).
 *          2. Remove a specified object.
 *          3. Remove everything from the bag.
 * 4. Counting Items in the bag. (Searching)
 *      Ways to Count:
 *          1. Count the # of occurrences of an item in the bag.
 *          2. Test whether a bag contains an item.
 *          3. Look at all objects in the bag.
 * ==============================================================================================
 * We have our specifications now, we could now design a UML (Unified Modeling Language) for this Abstract Data Type
 *  left is the method/function, right is return type
 *  ==================================
 *  +getCurrentSize(): integer
 *  +isFull() : boolean
 *  +isEmpty() : boolean
 *  +add(newEntry : T) : boolean
 *  +remove() : T
 *  +remove(anEntry : T) : boolean
 *  +clear() : void
 *  +getFrequencyOf(anEntry : T) : integer
 *  +contains(anEntry : T) : boolean
 *  +toArray() : T[]
 *
 */
public class Bag {

    public int size() {
        return 1;
    }

    public boolean isFull() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }
}
