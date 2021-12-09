package vi.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataHelper {

    public static List<String> createListOfNames(){
        List<String> names = new ArrayList<>();
        names.add("TOM");
        names.add("JIM");
        names.add("MARK");
        names.add("CHRIS");
        return names;
    }

    public static List<Integer> generateRandomListOfNumbers(){
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 52; i++) numbers.add(i % 2);
        Collections.shuffle(numbers);
        return numbers;
    }
}