public class Cantrips {

    private final String name;

    private final int diceCount;
    private final int diceRoll;


    public Cantrips(String name, int diceCount, int diceRoll) {
        this.name = name;
        this.diceCount = diceCount;
        this.diceRoll = diceRoll;
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

    // Oyuncunun leveline göre kaç zar atılacağını hesaplar
    public int getDiceCountForLevelOnCantrips(Class player) {
        int level = player.getLevel();

        if (level >= 17) {
            return 4;
        } else if (level >= 11) {
            return 3;
        } else if (level >= 5) {
            return 2;
        } else {
            return 1;
        }
    }
}
