import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

//Shaan Maheshwari, 11/15/24, pd. 3, This program creates methods for a super linked list, and creates methods to remove vowels, remove constanants, remove duplicates, combine 2 seperate lists, and concatenate all the values

public class SuperLinkedList extends LinkedList<String> {
    public boolean removeVowels() {
        ListIterator<String> temp =  this.listIterator(); 
        boolean removed = false;
        while(temp.hasNext() == true){
            if("AEIOUaeiou".indexOf(temp.next()) != -1){
                temp.remove();
                removed = true;
            }//end if
        }//end while
        return removed;
    }//end function

    public boolean removeConsonants() {
        ListIterator<String> temp =  this.listIterator(); 
        boolean removed = false;
        while(temp.hasNext() == true){
            if("QWRTYPSDFGHJKLZXCVBNMqwrtypsdfghjklzxcvbnm".indexOf(temp.next()) != -1){
                temp.remove();
                removed = true;
            }//end if
        }//end while
        return removed;
    }//end function

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
                    }//end if else
                }//end if
            }//end while
        }//end for
        return removedList;
    }//end function

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> combinedList = new LinkedList<String>();
        ListIterator<String> temp =  this.listIterator();

        String start = temp.next();
        combinedList.add(start);

        while(temp.hasNext() == true){
            start += temp.next();
            combinedList.add(start);
        }//end while

        return combinedList;
    }//end fuction

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> mixed = new LinkedList<String>();
        ListIterator<String> temp1 =  this.listIterator(); 
        ListIterator<String> temp2 =  list2.listIterator(); 
        
        while(temp1.hasNext() == true & temp2.hasNext() == true){
            mixed.add(temp1.next());
            mixed.add(temp2.next());
        }//end while
        return mixed;
    }//end function

    public String toString() {
        ListIterator<String> temp =  this.listIterator(); 
        String output = "";
        output += temp.next();
        while(temp.hasNext() == true){
            output += ", " + temp.next();
        }//end while
        return output;
    }//end function
} // end SuperLinkedList