public class Main extends Thread {

    private boolean flag = true;
    private int count = 0;

    public void stopThread() {
        flag = false;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("My infinite loop " + count);
            count++;
            if (count == 100) {
                stopThread();
            }
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.start();
    }
}
