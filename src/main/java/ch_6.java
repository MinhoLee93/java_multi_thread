public class ch_6 {
    public static void main(String[] args){
        new Thread(()->{
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        System.out.println("Expecting program shutdown now");
    }
}
