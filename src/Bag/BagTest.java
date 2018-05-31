package Bag;

import java.util.Random;

public class BagTest {

    public static void main(String [] args) {
        String[] items = {"Hello","Goodbye","Testing","Greetings","Salutations"};

        BagInterface<String> wordBank = new ArrayBag<String>();
        BagInterface<String> fullBag = new ArrayBag<String>(6);
        BagInterface<String> resizeableArray = new ResizeableArrayBag<String>(2);
        String[] addToBag = {"A","A","B","A","C","A"};
        for(int i = 0; i < addToBag.length; i++) {
            wordBank.add(addToBag[i]);
            fullBag.add(addToBag[i]);
        }
        displayBag(wordBank);
        displayBag(fullBag);
        wordBank.add("REDDIT");
        displayBag(wordBank);
        fullBag.remove();
        fullBag.remove();
        displayBag(fullBag);
        wordBank.remove("A");
        displayBag(wordBank);
        System.out.println("A appears in wordBank : " + wordBank.getFrequencyOf("A") + ", # of times.");
        System.out.println("---------------------------------------");
        System.out.println("Test for ResizeableArrayBag: \nCurrent Size: " + ((ResizeableArrayBag<String>) resizeableArray).bagSize());
        resizeableArray.add("1");
        resizeableArray.add("2");
        displayBag(resizeableArray);
        resizeableArray.add("3");
        System.out.println("Current Size: " + ((ResizeableArrayBag<String>) resizeableArray).bagSize());
        resizeableArray.add("4");
        resizeableArray.add("5");
        displayBag(resizeableArray);
        System.out.println("Current Size: " + ((ResizeableArrayBag<String>) resizeableArray).bagSize());
        System.out.println("---------------------------------------\nTest for LinkBag (using Nodes)");
        BagInterface<String> linkBag = new LinkBag<String>();
        addRandomValues(linkBag);
        displayBag(linkBag);


    }

    public static void displayBag(BagInterface<String> bag) {
        Object[] myBag = bag.toArray();
        System.out.println("This bag contains: ");
        for(int i = 0; i < myBag.length; i++) {
            System.out.print(myBag[i] + " ");
        }
        System.out.println();
    }

    public static void addRandomValues(BagInterface<String> bag) {
        Random rd = new Random();
        int select = rd.nextInt(15) + 1;
        for(int i = 0; i < select; i++) {
            bag.add("" + rd.nextInt(50) + "");
        }
    }


}
