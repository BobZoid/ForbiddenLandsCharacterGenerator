package characters;

import Engine.Library;
import enums.*;
import gear.Gear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class PC extends Creature{
        private int age;
        private Race race;
        private Archetype arch;
        private String name;
        //wallet: Alla priser i kopparmynt
        private int wallet;
//        private boolean longAction;
//        private boolean shortAction;
//
//        private boolean sleepless;
//        private boolean cold;
//        private boolean hungry;
//        private boolean thirsty;

        /*private String darkSecret;
        private String pride;*/

        private int armor;
        private ArrayList<Gear> equipped = new ArrayList<>();
        private ArrayList<Gear> inventory = new ArrayList<>();
        private HashMap<Talent, Integer> talents = new HashMap<>();
        private HashMap<Skill, Integer> skills = new HashMap<>();
        private HashSet<Skill> archSkills = new HashSet<>();
        private HashMap<Stat, Integer> statCaps = new HashMap<>();
        //ageVal: 1. Ung 2. Medel 3. Gammal
        private int ageVal;


        public PC(int age, Race race) {
//            super();
        HashMap<Stat, Integer> stats = getStats();
        addSkills();
        addStats();
        this.age = age;
        this.race = race;
        statCaps.put(Stat.STY, 4);
        statCaps.put(Stat.SMI, 4);
        statCaps.put(Stat.INT, 4);
        statCaps.put(Stat.KAR, 4);
        switch (race) {
            case WOLFKIN:
                statCaps.put(Stat.SMI, 5);
                talents.put(Talent.HUNTINGINSTINCTS, 1);
                break;
            case DWARF:
                statCaps.put(Stat.STY, 5);
                talents.put(Talent.TRUEGRIT, 1);
                break;
            case ELF:
                statCaps.put(Stat.SMI, 5);
                talents.put(Talent.INNERPEACE, 1);
                break;
            case GOBLIN:
                statCaps.put(Stat.SMI, 5);
                talents.put(Talent.NOCTURNAL, 1);
                break;
            case HALFELF:
                statCaps.put(Stat.INT, 5);
                talents.put(Talent.PSYCHICPOWER, 1);
                break;
            case HALFLING:
                statCaps.put(Stat.KAR, 5);
                talents.put(Talent.HARDTOCATCH, 1);
                break;
            case HUMAN:
                statCaps.put(Stat.KAR, 5);
                talents.put(Talent.ADAPTIVE, 1);
                break;
            case ORC:
                statCaps.put(Stat.STY, 5);
                talents.put(Talent.UNBREAKABLE, 1);
                break;
        }
        setAgeVal();
    }
        public HashMap<Skill, Integer> getSkills() {
            return skills;
        }

        public void setSkills(HashMap<Skill, Integer> skills) {
            this.skills = skills;
        }

        public HashSet<Skill> getArchSkills() {
            return archSkills;
        }

        public void setArchSkills(HashSet<Skill> archSkills) {
            this.archSkills = archSkills;
        }

        public Archetype getArch() {
            return arch;
        }

        public int getAgeVal() {
            return ageVal;
        }

        public void addSkills() {
            skills.put(Skill.ANIMALHANDLING, 0);
            skills.put(Skill.CRAFTING, 0);
            skills.put(Skill.ENDURANCE, 0);
            skills.put(Skill.HEALING, 0);
            skills.put(Skill.INSIGHT, 0);
            skills.put(Skill.LORE, 0);
            skills.put(Skill.MANIPULATION, 0);
            skills.put(Skill.MARKSMANSHIP, 0);
            skills.put(Skill.MELEE, 0);
            skills.put(Skill.MIGHT, 0);
            skills.put(Skill.MOVE, 0);
            skills.put(Skill.PERFORMANCE, 0);
            skills.put(Skill.SCOUTING, 0);
            skills.put(Skill.SLEIGHTOFHAND, 0);
            skills.put(Skill.STEALTH, 0);
            skills.put(Skill.SURVIVAL, 0);
        }

        List<Skill> a = new ArrayList<>();

        public void setArch(Archetype arch) {
            this.arch = arch;
            setArchSkills(Library.getArchSkills(arch));
            switch (arch){
                case SORCERER:
                case DRUID:
                    statCaps.put(Stat.INT, statCaps.get(Stat.INT)+1);
                    break;
                case RIDER:
                case ROGUE:
                case HUNTER:
                    statCaps.put(Stat.SMI, statCaps.get(Stat.SMI)+1);
                    break;
                case FIGHTER:
                    statCaps.put(Stat.STY, statCaps.get(Stat.INT)+1);
                    break;
                case PEDDLER:
                case MINSTREL:
                    statCaps.put(Stat.KAR, statCaps.get(Stat.KAR)+1);
            }
        }

        public HashMap<Talent, Integer> getTalents() {
            return talents;
        }

        public void setTalents(HashMap<Talent, Integer> talents) {
            this.talents = talents;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Gear> getEquipped() {
            return equipped;
        }

        public void setEquipped(ArrayList<Gear> equipped) {
            this.equipped = equipped;
        }

        public ArrayList<Gear> getInventory() {
            return inventory;
        }

        public void setInventory(ArrayList<Gear> inventory) {
            this.inventory = inventory;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Race getRace() {
            return race;
        }

        public void setRace(Race race) {
            this.race = race;
        }

        public int getWallet() {
            return wallet;
        }

        public void setWallet(int wallet) {
            this.wallet = wallet;
        }

        private void setAgeVal() {
            if(getRace() == Race.ELF){
                ageVal = 2;
                return;
            }

            if (getAge() < 21) {
                ageVal = 1;
            } else if (getAge() > 100) {
                ageVal = 3;
            } else {
                switch (getRace()) {
                    case HUMAN:
                        if (getAge() < 26) {
                            ageVal = 1;
                        } else if (getAge() < 51) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                    case HALFELF:
                        if (getAge() < 31) {
                            ageVal = 1;
                        } else {
                            ageVal = 2;
                        }
                        break;
                    case DWARF:
                        if (getAge() < 41) {
                            ageVal = 1;
                        } else if (getAge() < 81) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                    case HALFLING:
                    case GOBLIN:
                        if (getAge() < 26) {
                            ageVal = 1;
                        } else if (getAge() < 61) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                    case ORC:
                        if (getAge() < 21) {
                            ageVal = 1;
                        } else if (getAge() < 46) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                    case WOLFKIN:
                        if (getAge() < 21) {
                            ageVal = 1;
                        } else if (getAge() < 41) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                }
                ;
            }
        }

        @Override
        public void addStats() {
            HashMap<Stat, Integer> stats = getStats();
            stats.put(Stat.KAR, 2);
            stats.put(Stat.STY, 2);
            stats.put(Stat.SMI, 2);
            stats.put(Stat.INT, 2);
            setStats(stats);

        }

    public HashMap<Stat, Integer> getStatCaps() {
        return statCaps;
    }

    @Override
    public String toString() {
        String characterSheet = "age: " + age +
                "\nRace: " + race +
                "\nArchetype: " + arch +
                "\nName: " + name +
                "\nWallet: " + wallet +
                "\nArmor: " + armor;
        final String stringHolder;
        if(!getStats().isEmpty()){
            characterSheet += "\nSTATS:" +
                    "\nSTR: " + getStats().get(Stat.STY) +
                    "\nDEX: " + getStats().get(Stat.SMI) +
                    "\nINT: " + getStats().get(Stat.INT) +
                    "\nCHA: " + getStats().get(Stat.KAR);
        }

        if(!equipped.isEmpty()){
            characterSheet += "\nEquipped=";

            for (int i = 0; i < equipped.size(); i++) {
                characterSheet += equipped.get(i);
            }
        }
        if(!inventory.isEmpty()){
            characterSheet += "\nInventory=" + inventory;

            for (int i = 0; i < inventory.size(); i++) {
                characterSheet += inventory.get(i);
            }
        }

        characterSheet += "\nTalents: ";
        ArrayList<String> tempTalents = new ArrayList<>();
        talents.forEach((talent, value) -> {
            tempTalents.add("\n" + talent + " " + value);
        });
        for (String talent: tempTalents) {
            characterSheet += talent;
        }

        characterSheet += "\nSkills: ";
        ArrayList<String> tempSkills = new ArrayList<>();
        skills.forEach((skill, value) -> {
            tempSkills.add("\n" + skill + " " + value);
        });
        for (String skill: tempSkills) {
            characterSheet += skill;
        }

        return characterSheet;
    }


}


