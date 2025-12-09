import java.util.Random;

public abstract class Class {
    protected String name;
    protected Classes unitClass;
    protected int attackRoll = 20;
    protected int health;
    protected int level;
    protected Race race;
    protected Weapon weapon;
    protected Armor armor;
    protected Random random = new Random();

    protected int getAttackDiceCounter() {
        return 0;
    }

    //calculates full damage
    public int physicalHitDamage() {

        int naturalAttacks = getAttackDiceCounter();
        int weaponAttacks = this.weapon.getDiceCount();

        int total = 0;

        //calculates the normal attack dice
        for (int i = 0; i < naturalAttacks; i++) {
            int xattackRoll = random.nextInt(this.attackRoll) + 1;
            total = total + xattackRoll;
        }

        //calculates the weapon attack dice
        for (int i = 0; i < weaponAttacks; i++) {
            int xweaponRoll = random.nextInt(this.weapon.getDamage()) + 1; // 1..weaponDamage
            total = total + xweaponRoll;
        }

        return total;
    }

    /*
    Future Workings
    public int spellHitDamage() {

    }
    */

    //calculates incoming damage
    public void getDamage(int attack) {
        int netDamage = attack - this.armor.getProtection();

        if (netDamage < 0) {
            netDamage = 0;
        }

        this.health -= netDamage;

        if (this.health < 0) {
            this.health = 0;
        }

        setHealth(this.health); // kalan can
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Classes getUnitClass() {
        return unitClass;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getRace() {
        return race.ordinal();
    }

    public int getLevel() {
        return level;
    }

    public int getAttackRoll() {
        return attackRoll;
    }

}
