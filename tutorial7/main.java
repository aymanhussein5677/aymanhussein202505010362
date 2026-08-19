package tutorial7;

import tutorial7.applience.Appliance;

public class main {
    public static void main(String[] args) {

        Appliance wash = new WashingMachine("LG");
        wash.displayBrand();
        wash.turnOn();
        wash.operate();
        wash.turnOff();

        System.out.println();

        Appliance micro = new Microwave("Panasonic");
        micro.displayBrand();
        micro.turnOn();
        micro.operate();
        micro.turnOff();
    }
}  
}
