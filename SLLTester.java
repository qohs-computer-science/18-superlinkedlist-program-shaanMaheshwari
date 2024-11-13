import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList firstList = new SuperLinkedList();
    firstList.add("a");
    firstList.add("b");
    firstList.add("c");
    firstList.add("d");
    firstList.add("e");
    firstList.add("f");
    firstList.add("g");
    firstList.add("h");

    System.out.print("Current List: ");
    System.out.println(firstList.toString());

    System.out.print("Vowels Removed: ");
    System.out.println(firstList.removeVowels());

    System.out.print("Current List: ");
    System.out.println(firstList.toString());

    firstList.add("a");
    firstList.add("e");
    firstList.add("i");
    firstList.add("o");
    firstList.add("u");

    System.out.print("Current List: ");
    System.out.println(firstList.toString());

    System.out.print("Consonants Removed: ");
    System.out.println(firstList.removeConsonants());

    System.out.print("Current List: ");
    System.out.println(firstList.toString());

    
  } // end main
} // end class