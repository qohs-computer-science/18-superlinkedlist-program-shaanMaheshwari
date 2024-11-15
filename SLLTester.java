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

    SuperLinkedList list3 = new SuperLinkedList();
    
    list3.add("a");
    list3.add("z");
    list3.add("b");
    list3.add("y");
    list3.add("c");
    list3.add("a");
    list3.add("g");
    list3.add("f");
    list3.add("d");
    list3.add("y");

    System.out.print("Current List: ");
    System.out.println(list3.toString());

    System.out.print("Duplicates Removed: ");
    System.out.println(list3.removeDuplicates());

    System.out.print("Current List: ");
    System.out.println(list3.toString());

    System.out.print("Combined List: ");
    System.out.println(list3.concatenateStrings());

    SuperLinkedList list2 = new SuperLinkedList();

    list2.add("q");
    list2.add("w");
    list2.add("e");
    list2.add("r");
    list2.add("t");

    System.out.print("Current List: ");
    System.out.println(list2.toString());

    System.out.print("Mixed List: ");
    System.out.println(list2.mix(list2));
  } // end main
} // end class