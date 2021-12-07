package clan.campeones.model;

public class Vayne extends Campeon{

    private int hit = 0;

    public Vayne(String name, String type, Health health, Recurso recurso, int damage) {
        super(name, type, health, recurso, damage);
    }

    @Override
    public void hit(Campeon campeon) {
        super.hit(campeon);
    }

    private int hitVayne(){
        this.hit++;
        boolean isTrueDamage = trueDamage() != 0;

        if (isTrueDamage){
            trueDamage();
            return trueDamage();
        } else {
            System.out.println(getDamage());
            return getDamage();
        }
    }

    private int trueDamage(){
        int trueDamage = 0;
        if (hit==3){
            super.setDamage(super.getDamage()  + 300);
            trueDamage = getDamage() + 300;
            System.out.println(getName() + " hizo " + trueDamage + " de daño verdadero");
            this.hit = 0;

        }
        return trueDamage;
    }

}