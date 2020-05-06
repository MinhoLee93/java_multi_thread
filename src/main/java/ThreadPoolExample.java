import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ThreadPoolExample example = new ThreadPoolExample();
        example.startThreadPoolExample();
    }

    private void startThreadPoolExample() {
        ExecutorService executorService = Executors.newCachedThreadPool();

        WorkTask t1 = new WorkTask("Task-1");
        WorkTask t2 = new WorkTask("Task-2");
        WorkTask t3 = new WorkTask("Task-3");
        WorkTask t4 = new WorkTask("Task-4");
        WorkTask t5 = new WorkTask("Task-5");
        WorkTask t6 = new WorkTask("Task-6");

        // submit
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.submit(t4);
        executorService.submit(t5);
        executorService.submit(t6);

        // shutdown
        executorService.shutdown();
    }
}
