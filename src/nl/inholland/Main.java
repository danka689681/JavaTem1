package nl.inholland;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Blue");
        words.add("Black");
        words.add("Yellow");
        words.add("Cat");
        words.add("OK");
        words.add("UnicornIsVeryEpic");
        words.add("Popcorn");
        words.add("SomeOtherWordWithALoootOfChars");
        words.add("I");
        words.add("GuessThatIsIt");

        Map<Integer, String> map = new TreeMap<>();
        for (String color : words) {
            map.put(color.length(), color);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(String.format("%d : %s", entry.getKey(), entry.getValue()));
        }
    }
}
