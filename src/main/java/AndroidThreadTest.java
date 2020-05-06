public class AndroidThreadTest extends Thread {

    @Override
    public void run() {
        System.out.println("Starting Thread Name : " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("I love Android");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread Completed : " + Thread.currentThread().getName());
    }
}
