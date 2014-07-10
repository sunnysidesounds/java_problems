import java.util.*;

/**
 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public static void main(String[] args){

        LinkedList<Integer> listOne = listOfRandomDigits(3);
        LinkedList<Integer> listTwo = listOfRandomDigits(3);

        System.out.println("Original List 1: " + listOne);
        System.out.println("Original List 2: " + listTwo);

        Integer listOneNumber = convertListToNumber(reverseList(listOne));
        Integer listTwoNumber = convertListToNumber(reverseList(listTwo));

        Integer sumOfNumbers = listOneNumber + listTwoNumber;
        LinkedList<Integer> sumOfNumberList = numberToList(sumOfNumbers);

        System.out.println(listOneNumber + " + " + listTwoNumber + " = " + sumOfNumbers );
        System.out.println("Stored sum in reverse list: " + reverseList(sumOfNumberList));

    }

    public static LinkedList<Integer>numberToList(Integer number){
            LinkedList<Integer> list = new LinkedList<Integer>();
            String sNumber = String.valueOf(number);
            for(int i = 0; i < sNumber.length(); i++){
                String sNode = sNumber.substring(i, i + 1);
                list.add(Integer.parseInt(sNode));
            }
            return list;
    }

    public static Integer convertListToNumber(LinkedList<Integer> list){
        String combine = "";
        for(Integer node : list){
            combine += String.valueOf(node);
        }
        return Integer.parseInt(combine);
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> list){
        LinkedList<Integer> reversal = new LinkedList<Integer>();
      for(int i = list.size()-1; i >= 0; i--){
            reversal.add(list.get(i));
        }
        return reversal;
    }

    public static LinkedList<Integer> listOfRandomDigits(int howManyNumbers){
        LinkedList<Integer> list = new LinkedList<Integer>();
        Random randomNumber = new Random();
        for(int i = 1; i <= howManyNumbers; i++){
            Integer randomInt = randomNumber.nextInt(10);
            if(randomInt != 0){
                list.add(randomInt);
            } else {
                howManyNumbers = howManyNumbers + 1;
            }
        }
        return list;
    }


}
