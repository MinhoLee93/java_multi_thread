public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = producer.consume();
                System.out.println("Consumed by : " + Thread.currentThread().getName() + " data : " + data);
            }
        } catch (Exception e) {

        }
    }
}
