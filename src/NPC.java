import java.util.Scanner;

public abstract class NPC {
    // ========== FIELDS ==========
    protected String name;
    protected Types unitType;
    protected Race race;

    protected int level;
    protected int xpValue;
    protected int health;
    protected int attackRoll = 20;

    protected Weapon weapon;
    protected Armor armor;

    protected Cantrips[] cantrips;
    protected Spells[] spells;

    private final Mechanics mechanics = new Mechanics();

}
