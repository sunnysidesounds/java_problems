import java.util.ArrayList;

// TODO
public class uniqueCharacter {

    /*
    Implement an algorithm to determine if a string has all unique characters
     */


    public static void main(String[] args){

        System.out.println(isUniqueChar("aaaajjj"));

       /* WRONG */
       /* ArrayList<String> isUnique = new ArrayList<String>();
        String stringToTest = "aajson";
        boolean unique = false;

        for(int i = 0; i < stringToTest.length(); i ++){
            String Char = String.valueOf(stringToTest.charAt(i));
            if(!isUnique.contains(Char)){
                isUnique.add(Char);
                unique = true;
            } else {
                unique = false;

            }
        }
            System.out.println(isUnique);
        */



    }


    public static boolean isUniqueChar(String str){
        int checker = 0;
        for(int i = 0; i < str.length(); i++){

            //The reason for - 'A', is that it "shifts" the ascii/unicode value so that A - Z have values 0 - 25. And are thus more suitable as an array index.
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0){
                return false;
            }
            checker |= (1 << val);
        }
        return true;
    }



}
