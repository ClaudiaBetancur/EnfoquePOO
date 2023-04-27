package domain;

import java.util.Scanner;

public class UsedMotorizedLandVehicle extends MotorizedLandVehicle{
    private int mileage;

    public UsedMotorizedLandVehicle(String brand, String model, String reference, int commercialValue, float carTax, String carType, String plate, String tractionType) {
        super(brand, model, reference, commercialValue, carTax, carType, plate, tractionType);
    }


    @Override
    public String toString() {
        return "UsedMotorizedLandVehicle{" +
                "mileage=" + mileage +
                '}' + super.toString();
    }

    public double calculateFinalPrice() {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el kilometraje del vehiculo");
//        mileage = scanner.nextInt();

        double price = super.calculateFinalPrice();
        double discount = 0;
        if (mileage >=1 || mileage <= 4999){
            discount = price * 0.125;
        } else if (mileage <= 5000 || mileage >= 9999) {
            discount = price * 0.25;            
        } else if (mileage >= 10000) {
            discount = price * 0.5;
        } else {
            System.out.println("El kilometraje ingresado mo es válido");
        }

        return price - discount;
    }
}
