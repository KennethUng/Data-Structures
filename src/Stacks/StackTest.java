package Stacks;

import java.util.Random;

public class StackTest {

    public static void main(String [] args) {
        StackInterface<String> chainTest = new LinkedStack<String>();
        System.out.println("Chained Link Stack Test");
        addTo(chainTest);
        System.out.println();
        removeAndPrint(chainTest);
        System.out.println("\n---------------------------");
        System.out.println("Array Stack Test");
        StackInterface<String> arrayTest = new ArrayStack<String>(10);
        addTo(arrayTest);
        addTo(arrayTest);
        System.out.println();
        removeAndPrint(arrayTest);
        System.out.println("\n---------------------------");
        System.out.println("Vector Stack Test");
        StackInterface<String> vectorTest = new VectorStack<String>(10);
        addTo(vectorTest);
        addTo(vectorTest);
        System.out.println();
        removeAndPrint(vectorTest);
        System.out.println("\n---------------------------");

    }

    public static void addTo(StackInterface stack) {
        Random rd = new Random();
        for(int i = 0; i < 10; i++) {
            int random = rd.nextInt(100);
            System.out.print(random + " ");
            stack.push("" + random);
        }
    }

    public static void removeAndPrint(StackInterface stack) {
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
