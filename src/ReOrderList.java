import java.util.LinkedList;

/**
 The problem:

 Given a singly linked list L: L0→L1→ ... →Ln-1→Ln,
 reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→...

 For example, given {1,2,3,4}, reorder it to {1,4,2,3}. You must do this in-place without altering the nodes' values.
 */
public class ReOrderList {
    public static void main(String[] args){

        LinkedList<Integer> unOrderList = new LinkedList<Integer>();
        unOrderList.add(1);
        unOrderList.add(2);
        unOrderList.add(3);
        unOrderList.add(4);

        System.out.println("Original unsorted list: " + unOrderList);

        unOrderList.add(1, unOrderList.getLast());
        unOrderList.removeLast();

        System.out.println("Reordered list: " + unOrderList);

    }

}
