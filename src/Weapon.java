import java.lang.classfile.attribute.RuntimeInvisibleTypeAnnotationsAttribute;

public class Weapon {
    private final String name;
    private final int damage;

    private final int cost;
    private final int diceCount;
    private final int diceRoll;

    private final Classes unitClass;

    public Weapon(String name, int damage, int cost, int diceCount,int diceRoll, Classes unitClass) {

        this.name = name;
        this.damage = damage;

        this.cost = cost;
        this.diceCount = diceCount;
        this.diceRoll = diceRoll;

        this.unitClass = unitClass;;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public int getCost() {
        return cost;
    }

    public Classes getUnitClass() {
        return unitClass;
    }

    public int getDiceRoll() {
        return diceRoll;
    }

}
