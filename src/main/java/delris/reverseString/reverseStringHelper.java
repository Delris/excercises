package delris.reverseString;

import java.util.Arrays;

public class reverseStringHelper {


    public String reverseStringWithStringBuilder(String stringToReverse) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringToReverse);

        return stringBuilder.reverse().toString();
    }

    public String reverseStringWithLoop(String stringToReverse) throws Exception {

        if(stringToReverse == null || stringToReverse.isBlank() || stringToReverse.isEmpty()){
            throw new Exception("Input string incorrect");
        }
        char[] result = new char[stringToReverse.length()];
        int j = 0;
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            result[j] = stringToReverse.charAt(i);
        }
        return Arrays.toString(result);
    }
}
