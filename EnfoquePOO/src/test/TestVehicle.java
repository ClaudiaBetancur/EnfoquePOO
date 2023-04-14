package test;

import domain.HumanPoweredVehicle;

public class TestVehicle {
    public static void main(String[] args) {

        HumanPoweredVehicle humanPoweredVehicle = new HumanPoweredVehicle("cbc", "2CD",
                "5G",5000, true);
        double totalPrice = humanPoweredVehicle.calculateFinalPrice(5000000);
        System.out.println(" El valor total a pagar es de: " + totalPrice);



    }
}
