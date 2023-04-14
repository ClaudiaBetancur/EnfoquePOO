package domain;

public class Invoice {
    private String description;
    private double gobernmentTax;
    private int id;
    private int quantity;
    private double totalPrice;
    private int unitPrice;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGobernmentTax() {
        return gobernmentTax;
    }

    public void setGobernmentTax(double gobernmentTax) {
        this.gobernmentTax = gobernmentTax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "description='" + description + '\'' +
                ", gobernmentTax=" + gobernmentTax +
                ", id=" + id +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
