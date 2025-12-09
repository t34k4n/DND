public class Armor {
    private final String name;
    private final int protection;
    private final int cost;

    public Armor(String name, int protection, int cost) {
        this.name = name;
        this.protection = protection;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }

    public int getCost() {
        return cost;
    }
}
