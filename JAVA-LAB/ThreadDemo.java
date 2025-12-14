class MessageThread extends Thread {
    String message;
    int delay;

    MessageThread(String msg, int delayMillis) {
        this.message = msg;
        this.delay = delayMillis;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(delay);  // Delay in milliseconds
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        // Thread 1 → prints every 10 seconds (10000 ms)
        MessageThread t1 = new MessageThread("BMS College of Engineering", 10000);

        // Thread 2 → prints every 2 seconds (2000 ms)
        MessageThread t2 = new MessageThread("CSE", 2000);

        t1.start();
        t2.start();
    }
}