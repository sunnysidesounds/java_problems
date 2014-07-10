import java.util.Iterator;
import java.util.LinkedList;

/**
 Testing / messy with Java LinkedList

 */
public class TestLinkedList {

    public static void main(String[] args){

        LinkedList<String> ll = new LinkedList<String>();
        for(char chr = 'a'; chr <= 'z'; chr++){
            ll.add(String.valueOf(chr));
        }

        ll.addFirst("first");
        ll.addLast("last");
        ll.remove("m");

        /*
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */

        for(String character : ll){
            System.out.println(character);
        }




    }


}
