package in.kgcoding.challenge100;

public class ThreadStateTest {
    public static void main(String[] args) throws InterruptedException {

        ThreadState ts1 = new ThreadState();

        System.out.printf("\nCreate the thread %s", ts1.getState());
        ts1.start();

        ts1.join();
        System.out.printf("\nThread finished %s",ts1.getState());
    }
}
