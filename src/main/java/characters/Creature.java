package characters;

import java.util.HashMap;

public abstract class Creature {
    private HashMap<enums.Stats, Integer> stats = new HashMap<>();

    public HashMap<enums.Stats, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<enums.Stats, Integer> stats) {
        this.stats = stats;
    }

    public Creature() {
    }

    public void addStats() {
        stats.put(enums.Stats.STY, 0);
        stats.put(enums.Stats.SMI, 0);

    }



}
