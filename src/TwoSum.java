import java.util.*;
import java.util.List;

/*

 Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

For example:

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

 */


public class TwoSum {

    public static void main(String[] args){
        int[] arrayOfIntegers = {3, 5, 6, 7, 8, 10, 12, 22, 4};
        int targetSum = 15;
        System.out.println(findTwoSumPairs(arrayOfIntegers, targetSum));
    }


    // Time complexity in worst case: O(n^2).
    public static ArrayList<List>findTwoSumPairs(int[] arrayOfIntegers, int targetSum){
        ArrayList<List>pairs = new ArrayList<List>();
        for(int i = 0; i < arrayOfIntegers.length; i++){
            for(int j = i + 1; j < arrayOfIntegers.length; j++){
                if(arrayOfIntegers[i] + arrayOfIntegers[j] == targetSum){
                    List<Integer> matchedPair = new ArrayList<Integer>();
                    matchedPair.add(arrayOfIntegers[i]);
                    matchedPair.add(arrayOfIntegers[j]);
                    pairs.add(matchedPair);
                }
            }
        }
        return pairs;
    }







}




/*
Notes:

Every combination in a list:

3 + 5
3 + 6
3 + 7
3 + 8
5 + 6
5 + 7
5 + 8
6 + 7
6 + 8
7 + 8

 */
