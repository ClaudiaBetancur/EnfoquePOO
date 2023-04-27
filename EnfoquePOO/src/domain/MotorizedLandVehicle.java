package domain;

import java.util.Scanner;

public class MotorizedLandVehicle extends Vehicle{
    protected float carTax;
    protected String carType;
    protected String plate;
    protected String tractionType;


    public MotorizedLandVehicle(String brand, String model, String reference, int commercialValue,
                                float carTax, String carType, String plate, String tractionType) {
        super(brand, model, reference, commercialValue);
        this.carTax = carTax;
        this.carType = carType;
        this.plate = plate;
        this.tractionType = tractionType;
    }

    @Override
    public String toString() {
        return "MotorizedLandVehicle{" +
                "carTax=" + carTax +
                ", carType='" + carType + '\'' +
                ", plate='" + plate + '\'' +
                ", tractionType='" + tractionType + '\'' +
                '}' + super.toString();
    }

    @Override
    public double calculateFinalPrice() {
        return calculateTypeVehicle() + carTax;
    }

    public double calculateTypeVehicle() {

        double precioFinal = 0;

        if (this.carType.equals("SUV")) {
            precioFinal = commercialValue * 1.20;
        } else if (this.carType.equals( "pickup")) {
            precioFinal = commercialValue * 1.30;
        } else {
            System.out.println("El tipo de vehiculo ingresado no existe");
        }
        return precioFinal;

    }


}
