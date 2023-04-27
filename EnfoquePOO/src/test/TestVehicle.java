package test;

import domain.HumanPoweredVehicle;
import domain.MotorizedLandVehicle;
import domain.UsedMotorizedLandVehicle;

public class TestVehicle {
    public static void main(String[] args) {

        HumanPoweredVehicle humanPoweredVehicle = new HumanPoweredVehicle("cbc", "2CD",
                "5G",5000, 0.25);
        double totalPrice = humanPoweredVehicle.calculateFinalPrice();
        System.out.println(" El valor total a pagar es de: " + totalPrice);


        MotorizedLandVehicle motorizedLandVehicle = new MotorizedLandVehicle("ccc", "cbd",
                "3g", 5000,0.25f, "SUV", "ED34", "trac");
        double valor = motorizedLandVehicle.calculateFinalPrice();
        System.out.println("El valor a pagar es de " + valor);


        UsedMotorizedLandVehicle usedMotorizedLandVehicle = new UsedMotorizedLandVehicle("ccc", "dbd",
                "dcd", 5000, 0.25f, "SUV", "trac", "trac");
        double valor2 = usedMotorizedLandVehicle.calculateFinalPrice();
        System.out.println("El valor a pagar con el descuento del kilometraje es de = " + valor2);

    }
}
