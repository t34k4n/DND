public class Warrior extends Class {

    public Warrior(String name) {
        this.name = name;
        this.unitClass = Classes.WARRIOR;
        this.hitDie = 12;

        this.weapon = Equipment.getDefaultWeapon(this.unitClass);
        this.armor  = Equipment.getDefaultArmor(this.unitClass);

        this.health = 21;
        this.level = 1;
    }
}
