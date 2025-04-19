public class Task1 extends Thread {
    public void run() {
        System.out.println("Running Task1...");
    }
}

public class Task2 extends Thread {
    public void run() {
        System.out.println("Running Task2...");
    }
}

public class Main {
    public static void main(String[] args) {
        new Task1().start();
        new Task2().start();  // Runs concurrently with Task1
    }
}