public class Cleric extends Class {

    public Cleric(String name) {
        this.name = name;
        this.unitClass = Classes.CLERIC;
        this.attackRoll = super.getAttackRoll();

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);
        this.cantrip = null;

        this.health = 19;
        this.level = 1;
    }

}
