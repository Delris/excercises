package delris.operationsOnStrings.reverseString;

import java.util.Arrays;

public class ReverseStringHelper {


    /**
    @param stringToBeReversed Expecting Non-NULL, non-Empty String object to be reversed
     @return Reversed text in String object
     **/
    public String reverseStringWithStringBuilder(String stringToBeReversed) throws Exception {
        if(stringToBeReversed == null || stringToBeReversed.isBlank() || stringToBeReversed.isEmpty()){
            throw new Exception("Input string incorrect");
        }
        StringBuilder stringBuilder = new StringBuilder(stringToBeReversed);
        return stringBuilder.reverse().toString();
    }

    /**
     @param stringToBeReversed Expecting Non-NULL, non-Empty String object to be reversed
     @return Reversed text in String object
     **/
    public String reverseStringWithLoop(String stringToBeReversed) throws Exception {

        if(stringToBeReversed == null || stringToBeReversed.isBlank() || stringToBeReversed.isEmpty()){
            throw new Exception("Input string incorrect");
        }
        char[] result = new char[stringToBeReversed.length()];
        int j = 0;
        for (int i = stringToBeReversed.length() - 1; i >= 0; i--) {
            result[j] = stringToBeReversed.charAt(i);
        }
        return Arrays.toString(result);
    }

    /**
     @param stringToBeReversed Expecting Non-NULL, non-Empty String object to be reversed
     @return Reversed text in String object
     **/
    public String reverseStringWithXOROperation(String stringToBeReversed) throws Exception{
        if(stringToBeReversed == null || stringToBeReversed.isBlank() || stringToBeReversed.isEmpty()){
            throw new Exception("Input string incorrect");
        }
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
