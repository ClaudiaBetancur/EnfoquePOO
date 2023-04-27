package domain;


public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected String reference;
    protected int commercialValue;


    public Vehicle(String brand, String model, String reference){
    }


    public Vehicle(String brand, String model, String reference, int commercialValue) {
        this.brand = brand;
        this.model = model;
        this.reference = reference;
        this.commercialValue = commercialValue;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", reference='" + reference + '\'' +
                ", commercialValue=" + commercialValue +
                '}';
    }

    //public abstract void calculateFinalPrice();

    public abstract double calculateFinalPrice();

}
