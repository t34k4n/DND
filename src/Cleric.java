public class Cleric extends Class {

    public Cleric(String name) {
        this.name = name;
        this.unitClass = Classes.CLERIC;
        this.hitDie = 8;

        this.weapon = Equipment.getDefaultWeapon(this.unitClass);
        this.armor  = Equipment.getDefaultArmor(this.unitClass);

        this.health = 19;
        this.level = 1;
    }
}
