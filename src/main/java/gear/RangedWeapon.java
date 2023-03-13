package gear;

import enums.GearFeature;

import java.util.HashSet;

public class RangedWeapon extends Weapon {
    private int ammo;

    public RangedWeapon(int ammo, enums.GearName name, int price, int bonus, int grip, int damage, int reach, HashSet<GearFeature> feat) {
        super(name, price, bonus, grip, damage, reach, feat);
        this.ammo=ammo;
    }

}
