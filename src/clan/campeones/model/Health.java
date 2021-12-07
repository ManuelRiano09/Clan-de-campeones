package clan.campeones.model;

public class Health {

    private int quantity;
    private int regeneration;

    public Health(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
