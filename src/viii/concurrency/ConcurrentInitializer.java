package viii.concurrency;

public class ConcurrentInitializer extends Thread{

    public static int amount = 0;

    public static void main(String[] args) {
        System.out.println("Before Thread. Amount: " + amount);
        ConcurrentInitializer thread = new ConcurrentInitializer();
        thread.start();

        // Wait for the thread to finish
        while (thread.isAlive()) {
            System.out.println("Waiting .. ");
        }

        // Update amount and print its value
        System.out.println("Before updating Amount: " + amount);
        amount ++;
        System.out.println("After updating Amount:  " + amount);
    }

    public void run () {
        System.out.println("Before thread run updating Amount: " + amount);
        amount ++;
        System.out.println("After thread run updating Amount: " + amount);
    }



}
