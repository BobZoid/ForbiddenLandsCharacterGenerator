import characters.PC;
import enums.*;
import gear.Gear;
import gear.RangedWeapon;
import gear.Weapon;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    @Test
    public void createPC() {
        PC pc = new PC(10, Race.DWARF);
        pc.setArch(Archetype.FIGHTER);
        pc.setArchSkills(new HashSet<Skill>());
        pc.getArchSkills().add(Skill.MELEE);
        pc.getArchSkills().add(Skill.ENDURANCE);
        pc.setEquipped(new ArrayList<Gear>());
        Weapon w = new Weapon(GearName.BATTLEAXE, 1, 1, 1, 1, 1, new HashSet<>());
        pc.getEquipped().add(w);
        ArrayList<Gear> list = new ArrayList<>();
        RangedWeapon r = new RangedWeapon(1, GearName.HEAVYCROSSBOW, 1, 1, 1, 1, 1, new HashSet<>());
        list.add(r);
        pc.setInventory(list);
        pc.setName("Bosse");
        HashMap<Skill, Integer> skills = new HashMap<>();
        skills.put(Skill.MELEE, 4);
        skills.put(Skill.ENDURANCE, 3);
        pc.setSkills(skills);
        pc.setWallet(100);
        pc.getTalents().put(Talent.AXEFIGHTER, 2);

        assertEquals(Archetype.FIGHTER, pc.getArch());
        assertEquals(2, pc.getArchSkills().size());
        assertEquals(1, pc.getEquipped().size());
        assertEquals(1, pc.getInventory().size());
        assertEquals("Bosse", pc.getName());
        assertEquals(2, skills.size());
        assertEquals(2, pc.getTalents().size());
        assertEquals(100, pc.getWallet());

        assertEquals(3, pc.getStats().get(Stat.STY));
        assertEquals(2, pc.getStats().get(Stat.SMI));
        assertEquals(2, pc.getStats().get(Stat.INT));
        assertEquals(2, pc.getStats().get(Stat.KAR));
    }
}
