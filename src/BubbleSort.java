
import java.util.*;

public class BubbleSort {

    public static void main(String[] args){
        //Unsorted array
        int[] arrayToSort = {29, 24, 56, 46, 678, 43, 23, 568, 19, 345, 12, 2};
        BubbleSort bubble = new BubbleSort();
        bubble.bubbleSort(arrayToSort);
        //Display sorted array
       System.out.println(Arrays.toString(arrayToSort));
    }

    public void bubbleSort(int[] array){
        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(j != -1){
                    if(array[j] > array[j+1]){
                        int tmp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = tmp;
                    }

                }
            }
        }
    }

}
