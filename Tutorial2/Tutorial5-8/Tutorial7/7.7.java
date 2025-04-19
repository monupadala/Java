import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.remove();
        System.out.println("Consumed: " + value);
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        SharedQueue buffer = new SharedQueue();

        Thread producer = new Thread(() -> {
            int i = 0;
            try {
                while (true) {
                    buffer.produce(i++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    buffer.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {}
        });

        producer.start();
        consumer.start();
    }
}