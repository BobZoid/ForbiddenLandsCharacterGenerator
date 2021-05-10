import gear.*;
import enums.GearFeatures;
import enums.GearName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;


public class GearTest {

    @Test
    public void startUp() {
        assertEquals(0, GearManagement.allMeleeWeapons.size());
        assertEquals(0, GearManagement.allRangedWeapons.size());
        assertEquals(0, GearManagement.allBodyArmors.size());
        assertEquals(0, GearManagement.allHelmets.size());
        GearManagement.startUp();
        assertEquals(24, GearManagement.allMeleeWeapons.size());
        assertEquals(9, GearManagement.allRangedWeapons.size());
        assertEquals(5, GearManagement.allBodyArmors.size());
        assertEquals(4, GearManagement.allHelmets.size());

    }

    @Test
    public void createWeapon() {
        HashSet<GearFeatures> hs = new HashSet<>();
        hs.add(GearFeatures.IMMOBILE);
        Weapon w = new Weapon(GearName.BATTLEAXE, 1, 2, 3, 4, 5, hs);
        assertTrue(w instanceof Weapon);
        assertEquals(GearName.BATTLEAXE, w.getName());
        assertEquals(1, w.getPrice());
        assertEquals(2, w.getBonus());
        assertEquals(3, w.getGrip());
        assertEquals(4, w.getDamage());
        assertEquals(5, w.getReach());
        assertEquals(1, w.getFeatures().size());
    }

    @Test
    public void createArmor() {
        HashSet<GearFeatures> hs = new HashSet<>();
        hs.add(GearFeatures.POINTED);
        hs.add(GearFeatures.LIGHT);
        Armor w = new Armor(20, GearName.LEATHERARMOR, 10, hs);
        assertTrue(w instanceof Armor);
        assertEquals(GearName.LEATHERARMOR, w.getName());
        assertEquals(10, w.getPrice());
        assertEquals(20, w.getBonus());
        assertEquals(2, w.getFeatures().size());
    }

    @Test
    public void createRanged() {
        HashSet<GearFeatures> hs = new HashSet<>();
        RangedWeapon r = new RangedWeapon(1, GearName.FALCHION, 2, 3, 4, 5, 6, hs);
        assertTrue( r instanceof RangedWeapon);
        assertEquals(GearName.FALCHION, r.getName());
        assertEquals(2, r.getPrice());
        assertEquals(3, r.getBonus());
        assertEquals(4, r.getGrip());
        assertEquals(5, r.getDamage());
        assertEquals(6, r.getReach());
        assertEquals(0, r.getFeatures().size());
    }

    @Test
    public void createHelmet() {
        HashSet<GearFeatures> hs = new HashSet<>();
        hs.add(GearFeatures.CROSSBOW);
        Helmet h = new Helmet(11, GearName.CLOSEDHELMET, 12, hs);
        assertTrue(h instanceof Helmet);
        assertEquals(11, h.getBonus());
        assertEquals(GearName.CLOSEDHELMET, h.getName());
        assertEquals(12, h.getPrice());
        assertEquals(1, h.getFeatures().size());
    }
}
