
/*
Fibonacci Sequence
0, 1, 1, 2, 3, 5, 8, 13, 21…
 */


public class FibonacciSequence {
    private static int stoppingPoint = 40;

    public static void main(String[] args){
        fibonacci(0, 1);
    }


    public static void fibonacci(int start, int end){
         Integer sum = start + end;
        System.out.println(start + " + " + end + " = " + sum);
        if(sum > stoppingPoint){
            return;
        }
        fibonacci(end, end+start);
        // 1, (1+0)
        // 1, (1+1)
        // 2, (2+1)
    }
}
