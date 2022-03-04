package clan.campeones.model;

public class Akali extends Campeon {

    private boolean visibility = true;

    public Akali(String name, String type, Health health, Recurso recurso, int damage) {
        super(name, type, health, recurso, damage);
    }

    public void hit_akali(boolean rightClic, int actuallyEnemyHealth) {
        if (rightClic) {
            actuallyEnemyHealth = actuallyEnemyHealth - getDamage();
        }
    }

    public void passive_akali(boolean rightClic, boolean outCircle, int actuallyEnemyHealth) {
        if ((rightClic) && (outCircle)){
            actuallyEnemyHealth = (int) (actuallyEnemyHealth - (getDamage() + (0.75*getDamage())));
        }
        else{
            hit_akali(rightClic, actuallyEnemyHealth);
        }
    }

    public void fiveKnifes(boolean q, boolean maxRange, int actuallyEnemyHealth) {
        if (maxRange && q) {
            actuallyEnemyHealth = (int) (actuallyEnemyHealth - (getDamage()+(getDamage()*0.5)));
        }if ((maxRange = false) && q ){
            actuallyEnemyHealth = (int) (actuallyEnemyHealth - getDamage());
        }
    }

    public void crepuscularMante(boolean w, boolean in, int durability){
        Recurso energy = new Recurso("Energy", 250);
        setRecurso(energy);
            if (w && in) {
                visibility = false;
            }
            else {
                visibility = true;
            }
            if (durability == 0)
                energy.setQuantiy(200);
    }
}