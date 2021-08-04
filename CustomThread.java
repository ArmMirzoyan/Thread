public class CustomThread extends Thread{

    private boolean flag = true;
    private int count = 0;

    public void stopThread() {
        flag = false;
    }

    @Override
    public void run() {
        while (flag) {
            System.out.println("My infinite loop by Thread-0, num: " + count);
            count++;
        }
    }
}
