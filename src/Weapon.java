import java.lang.classfile.attribute.RuntimeInvisibleTypeAnnotationsAttribute;

public class Weapon {
    private final String name;

    private final int cost;
    private final int diceCount;
    private final int diceRoll;

    private final Classes unitClass;

    public Weapon(String name, int cost, int diceCount,int diceRoll, Classes unitClass) {

        this.name = name;

        this.cost = cost;
        this.diceCount = diceCount;
        this.diceRoll = diceRoll;

        this.unitClass = unitClass;;
    }

    public String getName() {
        return name;
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
