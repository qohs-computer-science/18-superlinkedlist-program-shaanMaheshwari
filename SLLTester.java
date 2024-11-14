import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    list1.add("a");
    list1.add("b");
    list1.add("c");
    list1.add("d");
    list1.add("e");
    list1.add("f");
    list1.add("g");
    list1.add("h");

    System.out.print("Current List: ");
    System.out.println(list1.toString());

    System.out.print("Vowels Removed: ");
    System.out.println(list1.removeVowels());

    System.out.print("Current List: ");
    System.out.println(list1.toString());

    list1.add("a");
    list1.add("e");
    list1.add("i");
    list1.add("o");
    list1.add("u");

    System.out.print("Current List: ");
    System.out.println(list1.toString());

    System.out.print("Consonants Removed: ");
    System.out.println(list1.removeConsonants());

    System.out.print("Current List: ");
    System.out.println(list1.toString());

    SuperLinkedList list2 = new SuperLinkedList();
    
    list2.add("a");
    list2.add("z");
    list2.add("b");
    list2.add("y");
    list2.add("c");
    list2.add("a");
    list2.add("g");
    list2.add("f");
    list2.add("d");
    list2.add("y");

    System.out.print("Current List: ");
    System.out.println(list2.toString());

    System.out.print("Duplicates Removed: ");
    System.out.println(list2.removeDuplicates());

    System.out.print("Current List: ");
    System.out.println(list2.toString());

    System.out.print("Combined List: ");
    System.out.println(list2.concatenateStrings());

    
  } // end main
} // end class