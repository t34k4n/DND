import java.util.Scanner;

public abstract class Class implements Combatant{

    // ========== FIELDS ==========
    protected String name;
    protected Classes unitClass;
    protected Race race;

    protected int level;
    protected int xp;
    protected int health;
    protected int attackRoll = 20;
    protected int attackCount = 1;

    protected Weapon weapon;
    protected Armor armor;

    protected Cantrips[] cantrips;
    protected Spells[] spells;

    private final Mechanics mechanics = new Mechanics();
    protected final Scanner scanner = new Scanner(System.in);

    // ========== ABSTRACT / OVERRIDABLE ==========
    public abstract void getLevelUp();

    // ========== XP / LEVEL ==========
    public void addXp(int amount) {
        if (amount <= 0) return;
        this.xp += amount;
        updateLevelFromXp();
    }

    // D&D 5e XP eşikleri (1-20)
    public void updateLevelFromXp() {
        int newLevel = 1;

        if (xp >= 355000) newLevel = 20;
        else if (xp >= 305000) newLevel = 19;
        else if (xp >= 265000) newLevel = 18;
        else if (xp >= 225000) newLevel = 17;
        else if (xp >= 195000) newLevel = 16;
        else if (xp >= 165000) newLevel = 15;
        else if (xp >= 140000) newLevel = 14;
        else if (xp >= 120000) newLevel = 13;
        else if (xp >= 100000) newLevel = 12;
        else if (xp >= 85000) newLevel = 11;
        else if (xp >= 64000) newLevel = 10;
        else if (xp >= 48000) newLevel = 9;
        else if (xp >= 34000) newLevel = 8;
        else if (xp >= 23000) newLevel = 7;
        else if (xp >= 14000) newLevel = 6;
        else if (xp >= 6500) newLevel = 5;
        else if (xp >= 2700) newLevel = 4;
        else if (xp >= 900) newLevel = 3;
        else if (xp >= 300) newLevel = 2;

        if (newLevel != this.level) {
            this.level = newLevel;
            System.out.println("Level Up! New level: " + this.level);
        }
    }

    // ========== CHOICE MENUS ==========
    public int chooseSpellSlot() {
        if (spells == null || spells.length == 0) {
            System.out.println("No spell slots available.");
            return -1;
        }

        System.out.println("Pick the spell slot to use:");
        for (int i = 0; i < spells.length; i++) {
            System.out.println(i + " - " + (spells[i] == null ? "(empty)" : spells[i]));
        }

        int slot = scanner.nextInt();
        if (slot < 0 || slot >= spells.length) {
            System.out.println("Invalid slot.");
            return -1;
        }
        if (spells[slot] == null) {
            System.out.println("That slot is empty.");
            return -1;
        }
        return slot;
    }

    public int chooseCantripSlot() {
        if (cantrips == null || cantrips.length == 0) {
            System.out.println("No cantrip slots available.");
            return -1;
        }

        System.out.println("Pick the cantrip slot to use:");
        for (int i = 0; i < cantrips.length; i++) {
            System.out.println(i + " - " + (cantrips[i] == null ? "(empty)" : cantrips[i]));
        }

        int slot = scanner.nextInt();
        if (slot < 0 || slot >= cantrips.length) {
            System.out.println("Invalid slot.");
            return -1;
        }
        if (cantrips[slot] == null) {
            System.out.println("That slot is empty.");
            return -1;
        }
        return slot;
    }

    // ========== CANTRIP MANAGEMENT ==========
    public void removeCantrip() {
        if (cantrips == null || cantrips.length == 0) {
            System.out.println("No cantrip slots available.");
            return;
        }

        System.out.println("Pick the slot you want to remove:");
        for (int i = 0; i < cantrips.length; i++) {
            System.out.println(i + " - " + (cantrips[i] == null ? "(empty)" : cantrips[i]));
        }

        int slot = scanner.nextInt();
        if (slot < 0 || slot >= cantrips.length) {
            System.out.println("Invalid slot.");
            return;
        }
        if (cantrips[slot] == null) {
            System.out.println("That slot is already empty.");
            return;
        }

        System.out.println("Removed: " + cantrips[slot].getName());
        cantrips[slot] = null;
    }

    public void addCantrip() {
        if (cantrips == null || cantrips.length == 0) {
            System.out.println("No cantrip slots available.");
            return;
        }

        int emptySlot = -1;
        for (int i = 0; i < cantrips.length; i++) {
            if (cantrips[i] == null) { emptySlot = i; break; }
        }
        if (emptySlot == -1) {
            System.out.println("All cantrip slots are full.");
            return;
        }

        System.out.println("Pick the cantrip you want to add:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Items.showCantrips(i));
        }

        int choice = scanner.nextInt();
        Cantrips selected = Items.showCantrips(choice);

        if (selected == null) {
            System.out.println("Invalid cantrip selection.");
            return;
        }

        for (Cantrips c : cantrips) {
            if (c != null && c.getName().equals(selected.getName())) {
                System.out.println("You already have that cantrip.");
                return;
            }
        }

        cantrips[emptySlot] = selected;
        System.out.println("Added to slot " + emptySlot + ": " + selected.getName());
    }

    // ========== SPELL MANAGEMENT ==========
    public void removeSpell() {
        if (spells == null || spells.length == 0) {
            System.out.println("No spell slots available.");
            return;
        }

        System.out.println("Pick the slot you want to remove:");
        for (int i = 0; i < spells.length; i++) {
            System.out.println(i + " - " + (spells[i] == null ? "(empty)" : spells[i]));
        }

        int slot = scanner.nextInt();
        if (slot < 0 || slot >= spells.length) {
            System.out.println("Invalid slot.");
            return;
        }
        if (spells[slot] == null) {
            System.out.println("That slot is already empty.");
            return;
        }

        System.out.println("Removed: " + spells[slot].getName());
        spells[slot] = null;
    }

    public void addSpell() {
        if (spells == null || spells.length == 0) {
            System.out.println("No spell slots available.");
            return;
        }

        int emptySlot = -1;
        for (int i = 0; i < spells.length; i++) {
            if (spells[i] == null) { emptySlot = i; break; }
        }
        if (emptySlot == -1) {
            System.out.println("All spell slots are full.");
            return;
        }

        System.out.println("Pick the spell you want to add:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " - " + Items.showSpells(i));
        }

        int choice = scanner.nextInt();
        Spells selected = Items.showSpells(choice);

        if (selected == null) {
            System.out.println("Invalid spell selection.");
            return;
        }

        if (selected.getRequiredLevel() > this.level) {
            System.out.println("Your level is too low for: " + selected.getName());
            return;
        }

        for (Spells s : spells) {
            if (s != null && s.getName().equals(selected.getName())) {
                System.out.println("You already have that spell.");
                return;
            }
        }

        spells[emptySlot] = selected;
        System.out.println("Added to slot " + emptySlot + ": " + selected.getName());
    }

    // ========== SETTERS ==========
    public void setCantrip(Cantrips cantrip, int index) { this.cantrips[index] = cantrip; }
    public void setSpells(Spells spell, int index)     { this.spells[index] = spell; }
    public void setArmor(Armor armor)                  { this.armor = armor; }
    public void setWeapon(Weapon weapon)               { this.weapon = weapon; }
    public void setLevel(int level)                    { this.level = level; }
    public void setHealth(int health)                  { this.health = health; }

    // ========== GETTERS ==========
    public Classes getUnitClass() { return unitClass; }
    public String getName()       { return name; }
    public int getHealth()        { return health; }
    public int getRace()          { return race.ordinal(); }
    public int getLevel()         { return level; }
    public int getXp()            { return xp; }
    public int getAttackRoll()    { return attackRoll; }
    public Weapon getWeapon()     { return weapon; }
    public Armor getArmor()       { return armor; }
    public int getAttackCount() { return attackCount; }
    public Spells getSpell(int index)     { return spells[index]; }
    public Cantrips getCantrip(int index) { return cantrips[index]; }

}
