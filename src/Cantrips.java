public class Cantrips {

    private final String name;
    private final int diceRoll;

    public Cantrips(String name, int diceRoll) {
        this.name = name;
        this.diceRoll = diceRoll;
    }

    public int getDiceRoll() {
        return diceRoll;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return name + " (" + "D:" + diceRoll + ")";
    }


}
