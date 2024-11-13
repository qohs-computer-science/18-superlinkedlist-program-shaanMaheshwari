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
    firstList.removeVowels();
    System.out.println("Vowels Removed: ");
    firstList.toString();
  } // end main
} // end class