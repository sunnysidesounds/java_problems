import java.util.*;

// COMPLETED!
public class ReversePolishNotation {

    /*
    Evaluate the value of an arithmetic expression in Reverse Polish Notation.

    Valid operators are +, -, *, /. Each operand may be an integer or another expression.

    Some examples:
      ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
      ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

      http://www.programcreek.com/2012/12/leetcode-evaluate-reverse-polish-notation/
     */

    public static void main (String[] args){
        String[] tokens = new String[] { "18", "10", "+", "3", "/", "4" };

        ReversePolishNotation rpn = new ReversePolishNotation();

        System.out.println(rpn.evalRPN(tokens));
    }

    public int evalRPN(String[] tokens) {

        int returnValue = 0;

        String operators = "+-*/";

        Stack<String> stack = new Stack<String>();

        for(String t : tokens){
            if(!operators.contains(t)){
                stack.push(t);
            }else{
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                int index = operators.indexOf(t);
                switch(index){
                    case 0: // +
                        stack.push(String.valueOf(a+b));
                        break;
                    case 1: // -
                        stack.push(String.valueOf(b-a));
                        break;
                    case 2: // *
                        stack.push(String.valueOf(a*b));
                        break;
                    case 3: // /
                        stack.push(String.valueOf(b/a));
                        break;
                }
            }
        }

        returnValue = Integer.valueOf(stack.pop());
        return returnValue;

    }




}
