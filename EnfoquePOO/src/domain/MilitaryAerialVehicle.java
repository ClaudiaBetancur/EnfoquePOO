package domain;

public class MilitaryAerialVehicle extends AerialVehicle{

    private double militaryTax;

    public MilitaryAerialVehicle(String brand, String model, String reference, boolean hasPermissionCA,
                                 int registrationCertificate, String typeUse, double militaryTax) {
        super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse);
        this.militaryTax = militaryTax;
    }

    public double getMilitaryTax() {
        return militaryTax;
    }

    public void setMilitaryTax(double militaryTax) {
        this.militaryTax = militaryTax;
    }

    @Override
    public String toString() {
        return "MilitaryAerialVehicle{" +
                "militaryTax=" + militaryTax +
                '}';
    }
}
