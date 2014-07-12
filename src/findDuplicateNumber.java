import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// COMPLETED
public class FindDuplicateNumber {

    /*
    You have got a range of numbers between 1 to N, where one of the number is
     repeated. You need to write a program to find out the duplicate number.
     */

    public List<Integer> getRandomList(){
        int listSize = 10;
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        Random r = new Random();

        //Building the list of numbers.
        for(int i = 1; i < listSize; i++ ){
            listOfNumbers.add(i);
        }
        //Get a random number within list size
       // listOfNumbers.add( r.nextInt(listSize));
        if(r.nextInt(listSize) != 0){
            listOfNumbers.add( r.nextInt(listSize));
        } else {
            listOfNumbers.add(1);
        }
        return listOfNumbers;
    }

    public static void main(String[] args) {
        FindDuplicateNumber fdn = new FindDuplicateNumber();
        List<Integer> unquList =new  ArrayList<Integer>();

        List<Integer> randomList = fdn.getRandomList();
        System.out.println(randomList);
        for(Integer num:randomList){
            if(!unquList.contains(num)){
              unquList.add(num);
            } else {
                System.out.println("\n Duplicate number in list: " + num);
            }
        }

    }
}