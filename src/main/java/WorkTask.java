
public class WorkTask extends Thread {
    private long createdTime;
    private String taskName;

    public WorkTask(String taskName) {
        this.createdTime = System.currentTimeMillis();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        long waitedTime = System.currentTimeMillis() - createdTime;
        System.out.println(taskName + " got CPU after waiting for " + waitedTime + "ms with thread" + currentThread.getName());

        try {
            Thread.sleep(3000);
            System.out.println(taskName +  " completed. Releasing thread" + currentThread.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
