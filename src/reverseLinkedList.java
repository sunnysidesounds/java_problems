import java.util.*;

// TODO
public class reverseLinkedList {

    public static void main(String[] args) {

        System.out.println("Original LinkedList Order " + linkedListTest());
       System.out.println("Reversed LinkedList Iterative Order " + reverseIterative(linkedListTest()));
        System.out.println("Reversed LinkedList Recrusively Order " + reverseRecursively(linkedListTest()));

    }

    public static LinkedList reverseIterative(LinkedList node){
        LinkedList reverseList = new LinkedList();
        for(int i = node.size(); i > 0; i-- ){
            reverseList.add(node.get(i-1));
        }
        return reverseList;
    }

    public static LinkedList reverseRecursively(LinkedList node){

        node.add(node.getLast());
     /*
        LinkedList recusiveList = new LinkedList();
        recusiveList.add(node.getLast());

        reverseRecursively(recusiveList);
        return recusiveList;
        */
        return node;
    }



    public static LinkedList<Integer> linkedListTest(){
        LinkedList<Integer> head = new LinkedList<Integer>();
        head.add(1);
            head.add(3);
                head.add(5);
            head.add(7);
        head.add(9);
        return head;
    }






}
