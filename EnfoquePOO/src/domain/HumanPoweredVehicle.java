package domain;

public class HumanPoweredVehicle extends Vehicle{
    private static final double environmentalSubsidy = 0.25;


    public HumanPoweredVehicle(String brand, String model, String reference, int commercialValue,
                               double environmentalSubsidy) {
        super(brand, model, reference, commercialValue);
    }


    @Override
    public String toString() {
        return "HumanPoweredVehicle{}" + super.toString();
    }

    @Override
    public double calculateFinalPrice() {
        return (commercialValue - environmentalSubsidy);
    }


}
