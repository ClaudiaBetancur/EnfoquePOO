package domain;

public class UsedMotorizedLandVehicle extends MotorizedLandVehicle{
    private int mileage;

    public UsedMotorizedLandVehicle(String brand, String model, String reference, float cartax, String carType,
                                    String plate, String tractionType, int mileage) {
        super(brand, model, reference, cartax, carType, plate, tractionType);
        this.mileage = mileage;
    }




}
