class Task extends Thread {
    public void run() {
        try {
            System.out.println("Sleeping...");
            Thread.sleep(5000);
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Task t = new Task();
        t.start();
        try {
            Thread.sleep(1000);
            t.interrupt();  // Interrupt after 1 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}