package delris.reverseString;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class ReverseStringHelperTest {

    private final ArrayList<String> listOfStringsToBeReversed = new ArrayList<>(Arrays.asList("Buenos", "Rigcz", "Kajak", "Crispy", "Kraken", "ThisIsTestOfStringReversal", "soneuB", "zcgiR", "kajaK", "ypsirC", "nekarK", "lasreveRgnirtSfOtseTsIsihT"));
    private final ArrayList<String> reversedStrings = new ArrayList<>(Arrays.asList("soneuB", "zcgiR", "kajaK", "ypsirC", "nekarK", "lasreveRgnirtSfOtseTsIsihT", "Buenos", "Rigcz", "Kajak", "Crispy", "Kraken", "ThisIsTestOfStringReversal"));

    ReverseStringHelper reverseStringHelper = new ReverseStringHelper();

    @Test
    void reverseStringWithStringBuilder() {
        for(String word : listOfStringsToBeReversed){
            assert reverseStringHelper.reverseStringWithStringBuilder(word).equals(reversedStrings.get(listOfStringsToBeReversed.indexOf(word)));
        }
    }

    @Test
    void reverseStringWithLoop() throws Exception {
        for(String word : listOfStringsToBeReversed){
            assert reverseStringHelper.reverseStringWithLoop(word).equals(reversedStrings.get(listOfStringsToBeReversed.indexOf(word)));
        }
    }

    @Test
    void reverseStringWithXOROperation() {
        for(String word : listOfStringsToBeReversed){
            assert reverseStringHelper.reverseStringWithXOROperation(word).equals(reversedStrings.get(listOfStringsToBeReversed.indexOf(word)));
        }
    }
}