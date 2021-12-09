package vi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsInit {

    public static void main(String[] args) {
        List<String> names = DataHelper.createListOfNames();
        List<String> filteredNames = mapStreamFilterCollection(names);
        filteredNames.forEach(name -> {
            System.out.println(name);
        });
        System.out.println(collectResults());
        System.out.println(returnEvenNumbers());

    }

    public static List<String> mapStreamFilterCollection(List<String> list){
        return list.stream()
                .map(name -> name.toLowerCase())
                .filter(name -> name.startsWith("T"))
                .collect(Collectors.toList());
    }

    /**
     * Collect method is used to return the result of the intermediate operations performed on the stream
     * @return
     */
    public static Set collectResults () {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
        return numbers.stream().map(x -> x * x).collect(Collectors.toSet());
    }

    /**
     * Reduce method is used to reduce the elements of a stream to a single value
     * Reduce method takes a Binary Operator as a parameter
     * Reduce is a terminal stream operation
     * @return int - how many even numbers
     */
    public static int returnEvenNumbers(){
        List<Integer> numbers = DataHelper.generateRandomListOfNumbers();
        int even = numbers.stream().filter(number -> number % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);
        return even;
    }
}
