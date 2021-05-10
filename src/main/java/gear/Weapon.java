package gear;

import characters.Creature;
import enums.GearFeatures;

import java.util.HashSet;

public class Weapon extends Gear{
    //1 eller 2
    private int grip;
    private int damage;
    //reach: 1=arm, 2=nära.
    private int reach;

    public Weapon(enums.GearName name, int price,
                  int bonus, int grip, int damage,
                  int reach, HashSet<GearFeatures> feat) {
        super (bonus, name, price, feat);
        this.grip = grip;
        this.damage = damage;
        this.reach = reach;
        id=counter;
        counter++;
    }

    @Override
    public String toString() {
        return "Wepon{" + "name="+ getName()+ " grip=" + grip + ", damage=" + damage + ", bonus="+getBonus()+", reach=" + reach + ", features=" + getFeatures() +", price=" +getPrice()+ '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.grip;
        hash = 97 * hash + this.damage;
        hash = 97 * hash + this.reach;
        return hash;
    }



    public int getGrip() {
        return grip;
    }

    public int getDamage() {
        return damage;
    }

    public int getReach() {
        return reach;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Weapon other = (Weapon) obj;
        if (this.grip != other.grip) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        if (this.reach != other.reach) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }





    @Override
    public void use(Creature x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

