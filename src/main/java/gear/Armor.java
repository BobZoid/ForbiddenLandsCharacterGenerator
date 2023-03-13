package gear;

import characters.Creature;
import enums.GearFeature;

import java.util.HashSet;

public class Armor extends Gear{
    int idA;
    static int counterA=0;

    public Armor(int bonus, enums.GearName name, int price, HashSet<GearFeature> feat) {
        super(bonus, name, price, feat);
        idA=counterA++;
    }

    @Override
    public String toString() {
        return "Armor{ Item="+ getName()+ " AC=" + getBonus() + " Price=" + getPrice() + "Features=" + getFeatures() + " }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idA;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Armor other = (Armor) obj;
        if (this.getName()==other.getName()) return true;
        return this.idA == other.idA;
    }

    @Override
    public void use(Creature x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
