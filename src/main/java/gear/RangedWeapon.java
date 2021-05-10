package gear;

import enums.GearFeatures;

import java.util.HashSet;

public class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(int ammo, enums.GearName name, int price, int bonus, int grip, int damage, int reach, HashSet<GearFeatures> feat) {
        super(name, price, bonus, grip, damage, reach, feat);
        this.ammo=ammo;
    }

}
