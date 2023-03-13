package Engine;

import enums.Archetype;
import enums.Skill;

import java.util.HashSet;
import java.util.Set;

public final class Library {
    public static HashSet<Skill> getArchSkills(Archetype arch){
        HashSet<Skill> skills = new HashSet<>();

        switch (arch) {
            case MINSTREL:
                skills.add(Skill.LORE);
                skills.add(Skill.INSIGHT);
                skills.add(Skill.MANIPULATION);
                skills.add(Skill.PERFORMANCE);
                skills.add(Skill.HEALING);
            case PEDDLER:
                skills.add(Skill.CRAFTING);
                skills.add(Skill.SLEIGHTOFHAND);
                skills.add(Skill.SCOUTING);
                skills.add(Skill.INSIGHT);
                skills.add(Skill.MANIPULATION);
            case HUNTER:
                skills.add(Skill.STEALTH);
                skills.add(Skill.MOVE);
                skills.add(Skill.MARKSMANSHIP);
                skills.add(Skill.SCOUTING);
                skills.add(Skill.SURVIVAL);
            case ROGUE:
                skills.add(Skill.MELEE);
                skills.add(Skill.STEALTH);
                skills.add(Skill.SLEIGHTOFHAND);
                skills.add(Skill.MOVE);
                skills.add(Skill.MANIPULATION);
            case RIDER:
                skills.add(Skill.ENDURANCE);
                skills.add(Skill.MELEE);
                skills.add(Skill.MARKSMANSHIP);
                skills.add(Skill.SURVIVAL);
                skills.add(Skill.ANIMALHANDLING);
            case DRUID:
                skills.add(Skill.ENDURANCE);
                skills.add(Skill.SURVIVAL);
                skills.add(Skill.INSIGHT);
                skills.add(Skill.HEALING);
                skills.add(Skill.ANIMALHANDLING);
            case FIGHTER:
                skills.add(Skill.MIGHT);
                skills.add(Skill.ENDURANCE);
                skills.add(Skill.MELEE);
                skills.add(Skill.CRAFTING);
                skills.add(Skill.MOVE);
            case SORCERER:
                skills.add(Skill.CRAFTING);
                skills.add(Skill.SLEIGHTOFHAND);
                skills.add(Skill.LORE);
                skills.add(Skill.INSIGHT);
                skills.add(Skill.MANIPULATION);
        }
        return skills;
    }
}
