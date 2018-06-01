package Stacks;

import java.util.Random;
import java.util.Stack;

public class StackTest {

    public static void main(String [] args) {
        StackInterface<String> chainTest = new LinkedStack<String>();
        System.out.println("Chained Link Stack Test");
        addTo(chainTest);
        System.out.println();
        removeAndPrint(chainTest);
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
