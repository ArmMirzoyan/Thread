public class Main extends Thread {

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

    public static void main(String[] args) throws MyException {
        System.out.println("Thread " + Thread.currentThread().getName() + " ");
        System.out.println(Thread.currentThread().getName() + " is a " + Thread.currentThread().getState());

        Main obj = new Main();
        obj.start();

        System.out.println(obj.getName() + " " + obj.getState());

        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new MyException(e.getMessage());
        }
        System.out.println(obj.getName() + " " + obj.getState());

        System.out.println("Try to stop Thread-0");
        obj.stopThread();

        try {
            obj.join();
        } catch (InterruptedException e) {
            throw new MyException(e.getMessage());
        }

        System.out.println(obj.getName() + " " + obj.getState());
    }
}
