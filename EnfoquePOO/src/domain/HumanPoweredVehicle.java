package domain;

public class HumanPoweredVehicle extends Vehicle{
    private boolean environmentalSubsidy;


    public HumanPoweredVehicle(String brand, String model, String reference, int commercialValue,
                               boolean environmentalSubsidy) {
        super(brand, model, reference, commercialValue);
        this.environmentalSubsidy = environmentalSubsidy;
    }

    public boolean isEnvironmentalSubsidy() {
        return environmentalSubsidy;
    }

    public void setEnvironmentalSubsidy(boolean environmentalSubsidy) {
        this.environmentalSubsidy = environmentalSubsidy;
    }

    @Override
    public String toString() {
        return "HumanPoweredVehicle{" +
                "environmentalSubsidy=" + environmentalSubsidy +
                '}';
    }

    @Override
    public float calculateFinalPrice(float commercialValue) {
        final float DISCOUNT = (commercialValue * 25)/ 100;
        float result = commercialValue - DISCOUNT;

        return result;
    }


}
