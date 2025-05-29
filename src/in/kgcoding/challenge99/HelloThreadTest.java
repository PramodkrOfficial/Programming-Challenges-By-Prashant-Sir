package in.kgcoding.challenge99;

public class HelloThreadTest {
    public static void main(String[] args) {

        HelloThread th1 = new HelloThread(1);
        HelloThread th2 = new HelloThread(2);

        th1.start();
        th2.start();

//        th1.run();
    }
}
