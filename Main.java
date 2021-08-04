public class Main {

    public static void main(String[] args) throws MyException {
        System.out.println("Thread " + Thread.currentThread().getName() + " ");
        System.out.println(Thread.currentThread().getName() + " is a " + Thread.currentThread().getState());

        CustomThread obj = new CustomThread();
        System.out.println(obj.getName() + " " + obj.getState());
        obj.start();

        System.out.println(obj.getName() + " " + obj.getState());

        try {
            Thread.sleep(1);
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
