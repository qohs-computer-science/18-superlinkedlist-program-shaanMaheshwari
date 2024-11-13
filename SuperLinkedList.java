import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    ListIterator<String> temp =  this.listIterator();
    public boolean removeVowels() {
        boolean removed = false;
        while(temp.hasNext() == true){
            if(temp.next().indexOf("AEIOUaeiou") != -1){
                temp.remove();
                removed = true;
            }
        }
        return removed;
    }

    public boolean removeConsonants() {
        return false;
    }

    public LinkedList<String> removeDuplicates() {
        return null;
    }

    public LinkedList<String> concatenateStrings() {

        return null;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {

        return null;
    }

    public String toString() {
        temp = this.listIterator();
        String output = "";
        output += temp.next();
        while(temp.hasNext() == true){
            output += ", " + temp.next();
        }
        return output;
    }
} // end SuperLinkedList