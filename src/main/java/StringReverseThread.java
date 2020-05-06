import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class StringReverseThread extends Thread {
    private List<Character> names;
    private String message;
    // shared lock
    private static Lock lock = new ReentrantLock();

    public StringReverseThread(List<Character> names, String message) {
        this.names = names;
        this.message = message;
    }

    @Override
    public void run() {
        doLock();
        try {
            for (int i = 0; i < message.length(); i++) {
                try {
                    // HELLO -> H, E, L, L, O
                    names.add(message.charAt(i));
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(names);
        }finally {
            lock.unlock();
        }
    }

    private void doLock() {
        lock.lock();
    }
}
