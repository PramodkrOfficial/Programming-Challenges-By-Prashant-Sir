package in.kgcoding.challenge102;

public enum TrafficColor {

    RED(5000),
    YELLOW(2000),
    GREEN(3000);

    private final int onTimeInMillis;

    TrafficColor (int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }


}
