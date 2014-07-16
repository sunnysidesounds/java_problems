import java.util.ArrayList;

/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.


 */
public class ValidPalindrome {

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal: Panama";

        System.out.println(isValidPalindrome(testString));


    }


    public static boolean isValidPalindrome(String str){

        if(str.length() == 0){
            return true;
        }

        ArrayList<Character> frontArray = new ArrayList<Character>();
        ArrayList<Character> backArray = new ArrayList<Character>();
           for(int i = 0; i < str.length(); i++){
               int front = i;
               int back = (str.length() - 1) - front;

               char strFront = Character.toLowerCase(str.charAt(front));
               char strBack = Character.toLowerCase(str.charAt(back));

                if(strFront >= 'a' && strFront <= 'z'){
                    frontArray.add(strFront);
                }

               if(strBack >= 'a' && strBack <= 'z'){
                   backArray.add(strBack);
               }
           }

        //If both arrays match
        if(frontArray.equals(backArray)){
            return true;
        } else {
            return false;
        }
    }


}
