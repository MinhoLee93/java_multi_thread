import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {
    private static final int MAX_SIZE = 3;
    private final List<String> queue = new ArrayList<>();

    @Override
    public void run() {
        try {
            while (true) {
                produce();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private synchronized void produce() throws Exception {
        while (queue.size() == MAX_SIZE) {
            System.out.println("Queue limit reached. Waiting for consumer");
            wait();
            System.out.println("Producer got notification from consumer");
        }
        String data = LocalDateTime.now().toString();
        queue.add(data);
        System.out.println("Producer produced data");
        notify();
    }

    public synchronized String consume() throws Exception {
        notify();
        while (queue.isEmpty()) {
            wait();
        }
        String data = queue.get(0);
        queue.remove(data);
        return data;
    }
}
