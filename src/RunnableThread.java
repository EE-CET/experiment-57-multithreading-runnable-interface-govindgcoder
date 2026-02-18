class MyRunnable implements Runnable {

    // Override run() method
    // Loop from 1 to 5 and print numbers separated by space
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            if (i != 5) System.out.print(" ");
        }
    }
}

public class RunnableThread {

    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable mr = new MyRunnable();
        // Create a Thread object passing the runnable instance
        Thread tr = new Thread(mr);
        // Start the thread
        tr.run();
    }
}
