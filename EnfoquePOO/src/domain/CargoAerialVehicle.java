package domain;

public class CargoAerialVehicle extends AerialVehicle{
    private int capacityKilograms;

    public CargoAerialVehicle(String brand, String model, String reference, boolean hasPermissionCA,
                              int registrationCertificate, String typeUse, int capacityKilograms) {
        super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse);
        this.capacityKilograms = capacityKilograms;
    }

    public int getCapacityKilograms() {
        return capacityKilograms;
    }

    public void setCapacityKilograms(int capacityKilograms) {
        this.capacityKilograms = capacityKilograms;
    }

    @Override
    public String toString() {
        return "CargoAerialVehicle{" +
                "capacityKilograms=" + capacityKilograms +
                '}';
    }

}
