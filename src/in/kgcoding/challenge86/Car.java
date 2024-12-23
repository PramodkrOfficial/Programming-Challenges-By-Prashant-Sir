package in.kgcoding.challenge86;

class Car extends Vehicle {

    @Override
    void service() {
        super.service();
        System.out.println("Car-specific service is being performed: Checking engine, brakes, and oil.");
    }


}
