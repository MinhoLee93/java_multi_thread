public class ch_7 {
    public static void main(String[] args) throws InterruptedException {
        CustomThread stopThread = new CustomThread();
        stopThread.start();
        int maxWait = 3000;
        int wait = 0;

        while (wait < maxWait){
            Thread.sleep(300);
            wait += 300;
            if(!stopThread.isAlive()){
                System.out.println("Thread was completed within 3 seconds");
            }
        }

        if(stopThread.isAlive()){
            stopThread.setShouldExit(true);
            stopThread.join();
        }
    }
}
