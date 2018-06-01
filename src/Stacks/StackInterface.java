package Stacks;

/**
 * A stack is built off of a LIFO behavior. LIFO is essentially Last-In-First-Out, so the last thing you add to a Stack is going to be
 * the first object that comes out. You can imagine it like a stack of library books, the newest book you add is always on the top and
 * the older books you never removed will be on the bottom.
 * Qualities of Stack
 *      (1) Stack organizes its entries according to the order in which they were added.
 *              All new additions are added to the top of the stack.
 *      (2) Stack restricts access to its entries. Can only look at or remove top entry of stack.
 *              If you want to see an element in the stack, have to keep removing the top.
 *      (3) Add operation to a stack is referred to "Push"
 *      (4) Removing from Stack referred as "Pop"
 *      (5) Looking at the top of the stack is "Peek"
 *
 * Methods we need for Stack ADT (Abstract Data Type)
 *      PSEUDOCODE              UML                                 DESCRIPTION
 *      push(newEntry)          +push(newEntry: T): void            Adds a new entry to the top of the stack. Requires an Object as input.
 *      pop()                   +pop(): T                           Removes and returns the stack's top entry.
 *      peek()                  +peek(): T                          Retrieves the top entry of the stack, doesn't alter the stack.
 *      isEmpty()               +isEmpty(): boolean                 Simply detects whether the stack is empty
 *      clear()                 +clear(): void                      Removes all entries from the stack.
 */

public interface StackInterface<T> {

    public void push(T newEntry);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public void clear();
}
