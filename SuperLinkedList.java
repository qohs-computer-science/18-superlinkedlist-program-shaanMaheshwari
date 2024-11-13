import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
 
    
    public boolean removeVowels() {
        ListIterator<String> temp =  this.listIterator(); 
        boolean removed = false;
        while(temp.hasNext() == true){
            if("AEIOUaeiou".indexOf(temp.next()) != -1){
                temp.remove();
                removed = true;
            }
        }
        return removed;
    }

    public boolean removeConsonants() {
        ListIterator<String> temp =  this.listIterator(); 
        boolean removed = false;
        while(temp.hasNext() == true){
            if("QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm".indexOf(temp.next()) != -1){
                temp.remove();
                removed = true;
            }
        }
        return removed;
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
        ListIterator<String> temp =  this.listIterator(); 
        String output = "";
        output += temp.next();
        while(temp.hasNext() == true){
            output += ", " + temp.next();
        }
        return output;
    }
} // end SuperLinkedList