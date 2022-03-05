package clan.campeones.model;

public class Recurso {

    private String name;
    private int maxQuantity;
    private int quantiy;
    private int regeneration;

    public Recurso(String name, int quantiy, int maxQuantity) {
        this.name = name;
        this.quantiy = quantiy;
        this.maxQuantity = maxQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public int getRegeneration() {
        return regeneration;
    }

    public void setRegeneration(int regeneration) {
        this.regeneration = regeneration;
    }
}
