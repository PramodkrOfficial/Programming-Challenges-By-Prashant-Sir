package in.kgcoding.challenge102;

public class TrafficColorTest {
    public static void main(String[] args) throws InterruptedException {

        TrafficLightThread tl1 = new TrafficLightThread(TrafficColor.GREEN);
        TrafficLightThread tl2 = new TrafficLightThread(TrafficColor.YELLOW);
        TrafficLightThread tl3 = new TrafficLightThread(TrafficColor.RED);

        tl1.start();
        tl1.join();
        tl2.start();
        tl2.join();
        tl3.start();
        tl3.join();

    }
}
