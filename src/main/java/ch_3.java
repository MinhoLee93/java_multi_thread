public class ch_3 {
    public static void main(String[] args) throws InterruptedException {
        runJavaThread();
        runJavaFXThread();
        runAndroidThread();
    }

    private static void runJavaThread() {
        JavaThreadTest threadTest = new JavaThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("JAVA_THREAD");
        th.start();
    }

    private static void runJavaFXThread() {
        JavaFXThreadTest threadTest = new JavaFXThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("JAVAFX_THREAD");
        th.start();
    }

    private static void runAndroidThread() {
        AndroidThreadTest threadTest = new AndroidThreadTest();
        Thread th = new Thread(threadTest);
        th.setName("ANDROID_THREAD");
        th.start();
    }
}
