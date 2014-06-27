import java.util.HashMap;
import java.util.Map;


// TODO
public class stringCompression {
    /*
      Implement a method to preform basic string compression using counts of repeated characters. For example, the string aabcccccaa would become a2b1c5a3.
      If the "compressed" string wpi;d not become smaller than the original string, your method should return the original string.
     */

        public static void main(String[] args){
            System.out.println(compressBad("aabcccccaa"));
        }


        /* WRONG */
        public static String compressString(String rawString){
            int charCount = 1;
            String compressedString = "";
            HashMap<String, Integer> compressList = new HashMap<String, Integer>();
            char[] cArray = rawString.toCharArray();
            for(char c : cArray){
                    compressList.put(String.valueOf(c), charCount++);
            }
            for(Map.Entry<String, Integer> entry : compressList.entrySet()){
                compressedString += entry.getKey() + entry.getValue();
            }

            if(rawString.length() < compressedString.length()){
                return rawString;
            } else {
                return compressedString;
            }
        }

        /* SOLUTION */
      public static String compressBad(String str){
            String mystr = "";
            char last = str.charAt(0);
            int count = 1;
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == last){
                    count++;
                } else {
                    mystr += last + "" + count;
                    last = str.charAt(i);
                    count = 1;
                }
            }
            return mystr + last + count;
        }

}
