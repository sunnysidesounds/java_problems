import java.util.*;

// TODO
public class reverseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> originalList = new LinkedList<Integer>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);

        LinkedList<Integer> reversedList = new LinkedList<Integer>();
        for(int i = originalList.size()-1; i >= 0; i--){
            reversedList.add(originalList.get(i));
        }

       System.out.println("Original LinkedList Order " + originalList);
       System.out.println("Reversed LinkedList Iterative Order " + reversedList);
    }

}
