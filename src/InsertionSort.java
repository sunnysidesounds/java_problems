import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] arrayToSort = {34, 33, 2, 19,  789, 32, 12};
        InsertionSort insertion = new InsertionSort();
        insertion.insertionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }


    public void insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int j = i;
            int toInsert = array[i];
            while(j > 0 && array[j-1] > toInsert){
                System.out.println( i + " " + array[j-1] + " > " + toInsert);
                array[j] = array[j-1];
                System.out.println(Arrays.toString(array));
                j--;
            }

            array[j] = toInsert;
            System.out.println(Arrays.toString(array));
            System.out.println("-");
        }
    }
}