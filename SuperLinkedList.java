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
        LinkedList<String> removedList = new LinkedList<String>();
        ListIterator<String> temp =  this.listIterator();

        for(int i = 0; i < this.size(); i++){
            String dupe = this.get(i);
            temp = this.listIterator();
            boolean found = false;
            while(temp.hasNext() == true){
                if(dupe.equals(temp.next())){
                    if(!found){
                        found = true;
                    } else {
                        removedList.add(temp.previous());
                        temp.remove();
                    }
                }
            }
        }
        return removedList;
    }

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> combinedList = new LinkedList<String>();
        ListIterator<String> temp =  this.listIterator();

        String start = temp.next();
        combinedList.add(start);

        while(temp.hasNext() == true){
            start += temp.next();
            combinedList.add(start);
        }

        return combinedList;
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