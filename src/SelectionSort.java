import java.util.*;

public class SelectionSort {

    public static void main(String[] args){
        int[] arrayToSory = {34, 33, 67, 68, 12, 5, 567, 1, 45};
        SelectionSort selection = new SelectionSort();
        selection.selectionSort(arrayToSory);
        System.out.println(Arrays.toString(arrayToSory));
    }

    public void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int minimum = i;
            for(int y=i; y < array.length; y++){
                if(array[minimum] > array[y]){
                    minimum = y;
                }
            }
            int tmp = array[i];
            array[i] = array[minimum];
            array[minimum] = tmp;
        }
    }



}
