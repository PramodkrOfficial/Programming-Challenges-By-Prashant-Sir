package in.kgcoding.challenge86;

public class TestOverride {

    public static void main(String[] args) {

        Vehicle myvehicle = new Vehicle();
        myvehicle.service();

        Car mycar = new Car();
        mycar.service();
    }
}
