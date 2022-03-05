package clan.campeones.model;

public class Akali extends Campeon {

    public Akali(String name, String type, Health health, Recurso recurso, int damage) {
        super(name, type, health, recurso, damage);
    }

    public void hitAkali(Campeon enemy) {
        if (isRightClic()) {
            enemy.getHealth().setQuantity(enemy.getHealth().getQuantity() - getDamage());
        }
    }

    public void passiveAkali(Campeon enemy, boolean outCircle) {
        if ((isRightClic()) && (outCircle)){
            enemy.getHealth().setQuantity((int) (enemy.getHealth().getQuantity() - (getDamage()*1.75)));
        }
        else{
            hitAkali(enemy);
        }
    }

    public void fiveKnifes(Campeon enemy) {
        boolean maxRangeOfQ = false;

        if (maxRangeOfQ && isqHability()) {
            enemy.getHealth().setQuantity((int) (enemy.getHealth().getQuantity() - (getDamage()*1.5)));
        }if ((maxRangeOfQ = false) && isqHability() ){
            enemy.getHealth().setQuantity((int) (enemy.getHealth().getQuantity()));

        }
    }

    public void crepuscularMante(){
        short wDurability = 7;
        boolean inW = false;
        boolean visibility = true;
        this.getRecurso().setMaxQuantity(280);
        if (iswHability() && inW) {
                visibility = false;
            }
            else {
                visibility = true;
            }
        if (wDurability == 0)
                this.getRecurso().setMaxQuantity(200);
    }
}