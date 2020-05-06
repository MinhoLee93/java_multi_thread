public class ch_5 {
    public static void main(String[] args) throws InterruptedException {
        CalculatorRunnable runnable = new CalculatorRunnable(1000000000L);

        Thread t1 = new Thread(runnable);
        t1.setName("High Priority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        // use join
        t1.join();

        System.out.println("System is exit");
        System.exit(0);
    }
}
