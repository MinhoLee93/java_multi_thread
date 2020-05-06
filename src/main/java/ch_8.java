import java.util.ArrayList;
import java.util.List;

public class ch_8 {
    public static void main(String[] args) throws InterruptedException {
        List<Character> list = new ArrayList<>();

        Thread t1 = new StringReverseThread(list, "HELLO");
        t1.start();

        Thread t2 = new StringReverseThread(list, "WORLD");
        t2.start();

        t1.join();
        t2.join();
    }
}
