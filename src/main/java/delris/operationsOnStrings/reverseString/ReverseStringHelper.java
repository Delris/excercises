package delris.operationsOnStrings.reverseString;

import java.util.Arrays;

public class ReverseStringHelper {


    /**
     * @param stringToBeReversed Accepts Non-NULL, Non-empty String object
     * @return Reversed string object
     * @throws Exception Throws basic Exception when input string is empty, blank or null
     */
    public String reverseStringWithStringBuilder(String stringToBeReversed) throws Exception {
        validateString(stringToBeReversed);
        StringBuilder stringBuilder = new StringBuilder(stringToBeReversed);
        return stringBuilder.reverse().toString();
    }

    /**
     * @param stringToBeReversed Accepts Non-NULL, Non-empty String object
     * @return Reversed string object
     * @throws Exception Throws basic Exception when input string is empty, blank or null
     */
    public String reverseStringWithLoop(String stringToBeReversed) throws Exception {
        validateString(stringToBeReversed);
        char[] result = new char[stringToBeReversed.length()];
        int j = 0;
        for (int i = stringToBeReversed.length() - 1; i >= 0; i--) {
            result[j] = stringToBeReversed.charAt(i);
        }
        return Arrays.toString(result);
    }

    /**
     * @param stringToBeReversed Accepts Non-NULL, Non-empty String object
     * @return Reversed string object
     * @throws Exception Throws basic Exception when input string is empty, blank or null
     */
    public String reverseStringWithXOROperation(String stringToBeReversed) throws Exception {
        validateString(stringToBeReversed);
        char[] chars = stringToBeReversed.toCharArray();
        char[] reversedChars = new char[stringToBeReversed.length()];
        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - i - 1];
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ reversedChars[i]);
            reversedChars[i] = (char) (chars[i] ^ reversedChars[i]);
            chars[i] = (char) (chars[i] ^ reversedChars[i]);
        }
        return Arrays.toString(chars);
    }

    public void validateString(String string) throws Exception {
        if (string == null || string.isBlank() || string.isEmpty()) {
            throw new Exception("Input string incorrect");
        }
    }
}
