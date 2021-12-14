package clan.campeones.model;

public class Campeon {

    private String name;
    private String type;
    private Health health;
    private Recurso recurso;
    private int damage;
    private int hit = 0;


    public Campeon(String name, String type, Health health, Recurso recurso, int damage) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.recurso = recurso;
        this.damage = damage;
    }

    public void hit(Campeon campeon){
        Health health = campeon.getHealth();
        int healthAfterHit = health.getQuantity() - getDamage();
        campeon.getHealth().setQuantity(healthAfterHit);
        System.out.println("la vida de " + campeon.getName() + " luedo del basico es de " + campeon.getHealth().getQuantity());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public Recurso getRecurso() {
        return recurso;
    }

    public void setRecurso(Recurso recurso) {
        this.recurso = recurso;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
