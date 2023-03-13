package gear;

import characters.Creature;
import enums.GearFeature;

import java.util.HashSet;

public class Helmet extends Gear{

    public Helmet(int bonus, enums.GearName name, int price, HashSet<GearFeature> feat) {
        super(bonus, name, price, feat);
    }

    @Override
    public String toString() {
        return "Helmet{ Item="+ getName()+ " AC=" + getBonus() + " Price=" + getPrice() + "Features=" + getFeatures() + " }";
    }

    @Override
    public void use(Creature x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
