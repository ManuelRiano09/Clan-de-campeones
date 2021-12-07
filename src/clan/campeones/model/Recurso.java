package clan.campeones.model;

public class Recurso {

    private String name;
    private int quantiy;
    private int regeneration;

    public Recurso(String name, int quantiy) {
        this.name = name;
        this.quantiy = quantiy;
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
}
