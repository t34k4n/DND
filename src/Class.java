import java.util.Random;

public abstract class Class {
    protected String name;
    protected Classes unitClass;
    protected int hitDie;
    protected int health;
    protected int level;

    protected Weapon weapon;
    protected Armor armor;

    protected Random random = new Random();

    public int getHit() {
        int hitRoll = random.nextInt(this.hitDie) + 1;               // 1..hitDie
        int weaponRoll = random.nextInt(this.weapon.getDamage()) + 1; // 1..weaponDamage
        return hitRoll + weaponRoll;
    }

    public int getDamage(int attack) {
        int armorRoll = random.nextInt(this.armor.getProtection()) + 1; // 1..armorProtection
        int netDamage = attack - armorRoll;

        if (netDamage < 0) {
            netDamage = 0; // armor fazla ise hasar 0
        }

        this.health -= netDamage;

        if (this.health < 0) {
            this.health = 0;
        }

        return this.health; // kalan can
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
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
}
