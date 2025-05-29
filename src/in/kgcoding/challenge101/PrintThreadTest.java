package in.kgcoding.challenge101;

public class PrintThreadTest {
    public static void main(String[] args) throws InterruptedException {

        PrintThread pt1 = new PrintThread(1);
        PrintThread pt2 = new PrintThread(2);
        PrintThread pt3 = new PrintThread(3);

        pt1.start();
        pt1.join();
        pt2.start();
        pt2.join();
        pt3.start();
        pt3.join();
    }
}
