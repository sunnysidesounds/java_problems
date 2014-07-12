import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arrayToSort = {34, 33, 2, 56, 789, 32, 12};
        InsertionSort insertion = new InsertionSort();
        insertion.insertionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }


    public void insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int j = i;
            int toInsert = array[i];
            while(j > 0 && array[j-1] > toInsert){
                array[j] = array[j-1];
                j--;
            }
            array[j] = toInsert;
        }
    }
}