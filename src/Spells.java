public class Spells {

    private final int requiredLevel;
    private final int diceRoll;
    private final String name;
    private final int diceCount;

    public Spells(int requiredLevel, int diceRoll, String name, int diceCount) {
        this.requiredLevel = requiredLevel;
        this.diceRoll = diceRoll;
        this.name = name;
        this.diceCount = diceCount;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    public int getDiceRoll() {
        return diceRoll;
    }

    public String getName() {
        return name;
    }

    public int getDiceCount() {
        return diceCount;
    }

}
