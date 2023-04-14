package domain;

public class AerialVehicle extends Vehicle{
    protected boolean hasPermissionCA;
    protected int registrationCertificate;
    protected String typeUse;

    public AerialVehicle(String brand, String model, String reference, boolean hasPermissionCA,
                         int registrationCertificate, String typeUse) {
        super(brand, model, reference);
        this.hasPermissionCA = hasPermissionCA;
        this.registrationCertificate = registrationCertificate;
        this.typeUse = typeUse;
    }

    @Override
    public String toString() {
        return "AerialVehicle{" +
                "hasPermissionCA=" + hasPermissionCA +
                ", registrationCertificate=" + registrationCertificate +
                ", typeUse='" + typeUse + '\'' +
                '}';
    }

    @Override
    public float calculateFinalPrice(float commercialValue) {
        return 0;
    }


}
