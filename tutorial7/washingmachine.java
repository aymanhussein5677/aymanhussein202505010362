package tutorial7;

import tutorial7.applience.Appliance;

public class washingmachine {
    public class Microwave extends Appliance {

    public Microwave(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("Heating food...");
    }
}
}
