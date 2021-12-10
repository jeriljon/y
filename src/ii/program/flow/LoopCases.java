package ii.program.flow;

import java.util.Arrays;
import java.util.List;

public class LoopCases {

    public static void main(String[] args) {
        printStream();
    }

    /**
     * Terminal forEach method where stream cannot be reused
     */

    public static void printStream(){
        List<Integer> numbers = getNumbers();
        numbers.stream()
                .filter( i -> i % 2 == 0)
                .forEach( System.out::println);
    }

    private static List<Integer> getNumbers(){
        List<Integer> listOfPrimes = Arrays.asList(2, 3, 5, 7, 11, 3, 16);
//        listOfPrimes.stream().forEach( System.out::println );
        return listOfPrimes;
    }
}
