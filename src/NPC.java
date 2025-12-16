import java.util.Scanner;

public abstract class NPC implements Combatant {
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

    @Override
    public String getName() {
        return "";
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int hp) {

    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getAttackRoll() {
        return 0;
    }

    @Override
    public Armor getArmor() {
        return null;
    }

    @Override
    public Weapon getWeapon() {
        return null;
    }

}
