public class ch_4 {

    public static void main(String[] args){
        CalculatorRunnable runnable = new CalculatorRunnable(1000000000L);

        Thread t1 = new Thread(runnable);
        t1.setName("High Priority");
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        Thread t3 = new Thread(runnable);
        t3.setName("Min Priority");
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();

        Thread t2 = new Thread(runnable);
        t2.setName("Normal Priority");
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
    }
}
