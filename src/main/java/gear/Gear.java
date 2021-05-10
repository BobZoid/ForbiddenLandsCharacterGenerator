package gear;

import engine.Useable;
import enums.GearName;

import java.util.HashSet;
import java.util.Objects;

public abstract class Gear implements Useable {
    private enums.GearName name;
    private int bonus;
    //price är alltid i kopparmynt. *10 för SM och *100 för GM
    private int price;
    private HashSet<enums.GearFeatures> features = new HashSet<>();
    int id;
    static int counter=0;

    public Gear(int bonus, enums.GearName name, int price) {
        this.price=price;
        this.name=name;
        this.bonus = bonus;
        id=counter++;
    }

    public Gear(int bonus, enums.GearName name, int price, HashSet<enums.GearFeatures> feat) {
        this.price=price;
        this.name=name;
        this.bonus = bonus;
        features=feat;
        id=counter++;
    }

    public enums.GearName getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    public int getPrice() {
        return price;
    }

    public HashSet<enums.GearFeatures> getFeatures() {
        return features;
    }

    public void setFeatures(HashSet<enums.GearFeatures> features) {
        this.features = features;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.bonus;
        hash = 89 * hash + this.price;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gear other = (Gear) obj;
        if (this.bonus != other.bonus) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.name != other.name) {
            return false;
        }
        if (!Objects.equals(this.features, other.features)) {
            return false;
        }
        return true;
    }

    public void setName(GearName name) {
        this.name = name;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

