package characters;

import enums.*;
import gear.Gear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PC extends Creature{
        private int age;
        private Race race;
        private Archetypes arch;
        private String name;
        //wallet: Alla priser i kopparmynt
        private int wallet;
        private boolean longAction;
        private boolean shortAction;
        private boolean sleepless;
        private boolean cold;
        private boolean hungry;
        private boolean thirsty;
        private String darkSecret;
        private String pride;
        private int armor;
        private ArrayList<Gear> equipped = new ArrayList<>();
        private ArrayList<Gear> inventory = new ArrayList<>();
        private HashMap<Talents, Integer> talents = new HashMap<>();
        private HashMap<Skills, Integer> skills = new HashMap<>();
        private HashSet<Skills> archSkills = new HashSet<>();
        //ageVal: 1. Ung 2. Medel 3. Gammal
        private int ageVal;

        public HashMap<Skills, Integer> getSkills() {
            return skills;
        }

        public void setSkills(HashMap<Skills, Integer> skills) {
            this.skills = skills;
        }

        public HashSet<Skills> getArchSkills() {
            return archSkills;
        }

        public void setArchSkills(HashSet<Skills> archSkills) {
            this.archSkills = archSkills;
        }

        public Archetypes getArch() {
            return arch;
        }

        public int getAgeVal() {
            return ageVal;
        }

        public void addSkills() {
            skills.put(Skills.ANIMALHANDLING, 0);
            skills.put(Skills.CRAFTING, 0);
            skills.put(Skills.ENDURANCE, 0);
            skills.put(Skills.HEALING, 0);
            skills.put(Skills.INSIGHT, 0);
            skills.put(Skills.LORE, 0);
            skills.put(Skills.MANIPULATION, 0);
            skills.put(Skills.MARKSMANSHIP, 0);
            skills.put(Skills.MELEE, 0);
            skills.put(Skills.MIGHT, 0);
            skills.put(Skills.MOVE, 0);
            skills.put(Skills.PERFORMANCE, 0);
            skills.put(Skills.SCOUTING, 0);
            skills.put(Skills.SLEIGHTOFHAND, 0);
            skills.put(Skills.STEALTH, 0);
            skills.put(Skills.SURVIVAL, 0);
        }

        public PC(int age, Race race) {
            super();
            HashMap<Stats, Integer> stats = getStats();
            addSkills();
            addStats();
            this.age = age;
            this.race = race;
            switch (race) {
                case BEASTMAN:
                    stats.put(Stats.SMI, (stats.get(Stats.SMI) + 1));
                    talents.put(Talents.HUNTINGINSTINCTS, 1);
                    break;
                case DWARF:
                    stats.put(Stats.STY, (stats.get(Stats.STY) + 1));
                    talents.put(Talents.TRUEGRIT, 1);
                    break;
                case ELF:
                    stats.put(Stats.SMI, (stats.get(Stats.SMI) + 1));
                    talents.put(Talents.INNERPEACE, 1);
                    break;
                case GOBLIN:
                    stats.put(Stats.SMI, (stats.get(Stats.SMI) + 1));
                    talents.put(Talents.NOCTURNAL, 1);
                    break;
                case HALFELF:
                    stats.put(Stats.INT, (stats.get(Stats.INT) + 1));
                    talents.put(Talents.PSYCHICPOWER, 1);
                    break;
                case HALFLING:
                    stats.put(Stats.KAR, (stats.get(Stats.KAR) + 1));
                    talents.put(Talents.HARDTOCATCH, 1);
                    break;
                case HUMAN:
                    stats.put(Stats.KAR, (stats.get(Stats.KAR) + 1));
                    talents.put(Talents.ADAPTIVE, 1);
                    break;
                case ORC:
                    stats.put(Stats.STY, (stats.get(Stats.STY) + 1));
                    talents.put(Talents.UNBREAKABLE, 1);
                    break;
            }
            setAgeVal();
        }

        public void setArch(Archetypes arch) {
            this.arch = arch;
        }

        public HashMap<Talents, Integer> getTalents() {
            return talents;
        }

        public void setTalents(HashMap<Talents, Integer> talents) {
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
                    case ELF:
                        ageVal = 2;
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
                    case GOBLIN:
                        if (getAge() < 26) {
                            ageVal = 1;
                        } else if (getAge() < 61) {
                            ageVal = 2;
                        } else {
                            ageVal = 3;
                        }
                        break;
                    case BEASTMAN:
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
            HashMap<Stats, Integer> stats = getStats();
            stats.put(Stats.KAR, 2);
            stats.put(Stats.STY, 2);
            stats.put(Stats.SMI, 2);
            stats.put(Stats.INT, 2);
            setStats(stats);

        }


    }


