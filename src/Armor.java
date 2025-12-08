public class Armor {
    private final String name;
    private final int protection;

    public Armor(String name, int protection) {
        this.name = name;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public int getProtection() {
        return protection;
    }
}
