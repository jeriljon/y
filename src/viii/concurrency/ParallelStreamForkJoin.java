package viii.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class ParallelStreamForkJoin {

    public static void main(String[] args) {
        ParallelStreamForkJoin streamForkJoin = new ParallelStreamForkJoin();
        streamForkJoin.processLargeDataSet();
    }

    /**
     * creates a custom fork-join pool with a size of five
     * executes parallelStream statement inside of the submit block
     * this control threads number in Java parallel stream and enforces the stream to process five records max at the same time
     * this allows developers to control the threads that parallel stream uses
     * it separates the parallel stream thread pool from the application pool which is considered a good practice
     * creating and destroying the thread pool is an expensive process
     */
    private void processLargeDataSet() {
        List<String> largeDataset = getLargeDataSet();
        ForkJoinPool customThreadPool = new ForkJoinPool(5);
        customThreadPool.submit(() -> largeDataset.parallelStream().forEach(System.out::println));
        customThreadPool.shutdownNow();
    }

    /**
     * creates a very large fake data set containing over 2 billion records
     * @return
     */
    private List<String> getLargeDataSet() {
        List<String> largeDataset = new ArrayList<>();
        IntStream.range(0, Integer.MAX_VALUE).forEach( i -> {
            largeDataset.add(UUID.randomUUID().toString());
        });
        return largeDataset;
    }
}
