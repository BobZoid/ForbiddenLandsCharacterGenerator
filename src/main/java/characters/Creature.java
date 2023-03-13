package characters;

import enums.Stat;

import java.util.HashMap;

public abstract class Creature {
    private HashMap<Stat, Integer> stats = new HashMap<>();

    public HashMap<Stat, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<Stat, Integer> stats) {
        this.stats = stats;
    }

    public Creature() {
    }

    public void addStats() {
        stats.put(Stat.STY, 0);
        stats.put(Stat.SMI, 0);

    }



}
