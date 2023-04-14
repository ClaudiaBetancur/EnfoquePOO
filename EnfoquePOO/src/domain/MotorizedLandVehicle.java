package domain;

public class MotorizedLandVehicle extends Vehicle{
    protected float carTax;
    protected String carType;
    protected String plate;
    protected String tractionType;

    public MotorizedLandVehicle(String brand, String model, String reference, double carTax, String carType, String plate, String tractionType) {
        super(brand, model, reference);
    }

    public MotorizedLandVehicle(String brand, String model, String reference, int commercialValue,
                                float cartax, String carType, String plate, String tractionType) {
        super(brand, model, reference, commercialValue);
        this.carTax = cartax;
        this.carType = carType;
        this.plate = plate;
        this.tractionType = tractionType;
    }

    @Override
    public String toString() {
        return "MotorizedLandVehicle{" +
                "cartax=" + carTax +
                ", carType='" + carType + '\'' +
                ", plate='" + plate + '\'' +
                ", tractionType='" + tractionType + '\'' +
                '}';
    }

    @Override
    public float calculateFinalPrice(float commercialValue) {
        return 0;
    }


}
