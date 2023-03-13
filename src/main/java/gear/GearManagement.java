package gear;


import enums.GearFeature;

import java.util.Arrays;
import java.util.HashSet;

public class GearManagement {

    public static HashSet<Weapon> allMeleeWeapons = new HashSet<>();
    public static HashSet<RangedWeapon> allRangedWeapons = new HashSet<>();
    public static HashSet<Armor> allBodyArmors = new HashSet<>();
    public static HashSet<Helmet> allHelmets = new HashSet<>();


    public static void startUp() {
        allBodyArmors.add(new Armor(2, enums.GearName.LEATHERARMOR, 40, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allBodyArmors.add(new Armor(2, enums.GearName.LEATHERARMOR, 40, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allBodyArmors.add(new Armor(3, enums.GearName.STUDDEDLEATHERARMOR, 60, new HashSet<>()));
        allBodyArmors.add(new Armor(6, enums.GearName.CHAINMAIL, 240, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.CHAIN))));
        allBodyArmors.add(new Armor(8, enums.GearName.PLATEMAIL, 800, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.IMMOBILE))));
        allHelmets.add(new Helmet(1, enums.GearName.STUDDEDLEATHERCAP, 30, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allHelmets.add(new Helmet(2, enums.GearName.OPENHELMET, 80, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allHelmets.add(new Helmet(3, enums.GearName.CLOSEDHELMET, 180, new HashSet<>()));
        allHelmets.add(new Helmet(4, enums.GearName.GREATHELM, 300, new HashSet<>(Arrays.asList(GearFeature.lOWVISIBILITY))));
        allMeleeWeapons.add(new Weapon(enums.GearName.KNIFE, 10, 1, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.POINTED, GearFeature.LIGHT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.DAGGER, 20, 1, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.POINTED, GearFeature.LIGHT, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.FALCHION, 40, 1, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.SHORTSWORD, 60, 2, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.PARRYING, GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.BROADSWORD, 100, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.PARRYING, GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.LONGSWORD, 180, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.PARRYING, GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.TWOHANDEDSWORD, 400, 2, 2, 3, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.PARRYING, GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.SCIMITAR, 80, 1, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.HOOK, GearFeature.PARRYING, GearFeature.POINTED, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.HANDAXE, 20, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.HOOK, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.BATTLEAXE, 60, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.HOOK, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.TWOHANDEDAXE, 240, 2, 2, 3, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.HOOK, GearFeature.EDGED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.MACE, 40, 2, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.BLUNT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.MORNINGSTAR, 80, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.BLUNT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.WARHAMMER, 120, 2, 1, 2, 1, new HashSet<>(Arrays.asList(GearFeature.BLUNT, GearFeature.HOOK))));
        allMeleeWeapons.add(new Weapon(enums.GearName.FLAIL, 160, 1, 1, 2, 2, new HashSet<>(Arrays.asList(GearFeature.BLUNT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.WOODENCLUB, 10, 1, 1, 1, 1, new HashSet<>(Arrays.asList(GearFeature.BLUNT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.LARGEWOODENCLUB, 20, 1, 2, 2, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.BLUNT))));
        allMeleeWeapons.add(new Weapon(enums.GearName.HEAVYWARHAMMER, 220, 2, 2, 3, 1, new HashSet<>(Arrays.asList(GearFeature.HEAVY, GearFeature.BLUNT, GearFeature.HOOK))));
        allMeleeWeapons.add(new Weapon(enums.GearName.STAFF, 10, 1, 2, 1, 2, new HashSet<>(Arrays.asList(GearFeature.PARRYING, GearFeature.BLUNT, GearFeature.HOOK))));
        allMeleeWeapons.add(new Weapon(enums.GearName.SHORTSPEAR, 20, 1, 1, 1, 2, new HashSet<>(Arrays.asList(GearFeature.POINTED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.LONGSPEAR, 40, 2, 2, 1, 2, new HashSet<>(Arrays.asList(GearFeature.POINTED))));
        allMeleeWeapons.add(new Weapon(enums.GearName.PIKE, 120, 2, 2, 2, 2, new HashSet<>(Arrays.asList(GearFeature.POINTED, GearFeature.HEAVY))));
        allMeleeWeapons.add(new Weapon(enums.GearName.HALBERD, 300, 2, 2, 2, 2, new HashSet<>(Arrays.asList(GearFeature.EDGED, GearFeature.HOOK, GearFeature.POINTED, GearFeature.HEAVY))));
        allMeleeWeapons.add(new Weapon(enums.GearName.TRIDENT, 60, 1, 2, 2, 2, new HashSet<>(Arrays.asList(GearFeature.HOOK, GearFeature.POINTED))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.ROCK, 0, 0, 1, 1, 2, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.THROWINGAXE, 10, 1, 1, 1, 2, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.THROWINGDAGGER, 20, 1, 1, 2, 2, new HashSet<>()));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.THROWINGSPEAR, 20, 2, 1, 1, 3, new HashSet<>()));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.SLING, 10, 1, 1, 1, 3, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.SHORTBOW, 60, 2, 2, 1, 3, new HashSet<>(Arrays.asList(GearFeature.LIGHT))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.LONGBOW, 120, 2, 2, 1, 4, new HashSet<>()));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.LIGHTCROSSBOW, 240, 1, 2, 2, 4, new HashSet<>(Arrays.asList(GearFeature.CROSSBOW))));
        allRangedWeapons.add(new RangedWeapon(1, enums.GearName.HEAVYCROSSBOW, 400, 1, 2, 3, 4, new HashSet<>(Arrays.asList(GearFeature.CROSSBOW, GearFeature.HEAVY))));
    }

}

