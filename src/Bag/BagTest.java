package Bag;

public class BagTest {

    public static void main(String [] args) {
        String[] items = {"Hello","Goodbye","Testing","Greetings","Salutations"};

        BagInterface<String> wordBank = new ArrayBag<String>();
        BagInterface<String> fullBag = new ArrayBag<String>(6);
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
    }

    public static void displayBag(BagInterface<String> bag) {
        Object[] myBag = bag.toArray();
        System.out.println("This bag contains: ");
        for(int i = 0; i < myBag.length; i++) {
            System.out.print(myBag[i] + " ");
        }
        System.out.println();
    }


}
