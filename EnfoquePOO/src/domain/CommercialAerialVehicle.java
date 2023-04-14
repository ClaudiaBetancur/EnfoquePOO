package domain;

public class CommercialAerialVehicle extends AerialVehicle{
    private double discount;

    public CommercialAerialVehicle(String brand, String model, String reference, boolean hasPermissionCA,
                                   int registrationCertificate, String typeUse, double discount) {
        super(brand, model, reference, hasPermissionCA, registrationCertificate, typeUse);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "CommercialAerialVehicle{" +
                "discount=" + discount +
                '}';
    }
}
