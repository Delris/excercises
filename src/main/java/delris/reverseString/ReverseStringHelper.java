package delris.reverseString;

import java.util.Arrays;

public class ReverseStringHelper {


    public String reverseStringWithStringBuilder(String stringToReversed) {
        StringBuilder stringBuilder = new StringBuilder(stringToReversed);
        return stringBuilder.reverse().toString();
    }

    public String reverseStringWithLoop(String stringToReversed) throws Exception {

        if(stringToReversed == null || stringToReversed.isBlank() || stringToReversed.isEmpty()){
            throw new Exception("Input string incorrect");
        }
        char[] result = new char[stringToReversed.length()];
        int j = 0;
        for (int i = stringToReversed.length() - 1; i >= 0; i--) {
            result[j] = stringToReversed.charAt(i);
        }
        return Arrays.toString(result);
    }

    public String reverseStringWithXOROperation(String stringToBeReversed){
        char[] chars = stringToBeReversed.toCharArray();
        char[] reversedChars = new char[stringToBeReversed.length()];
        for(int i =0 ; i< chars.length; i++){
            reversedChars[i] = chars[chars.length -i -1];
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char)(chars[i] ^ reversedChars[i]);
            reversedChars[i] = (char)(chars[i] ^ reversedChars[i]);
            chars[i] = (char)(chars[i] ^ reversedChars[i]);
        }
        return Arrays.toString(chars);
    }
}
