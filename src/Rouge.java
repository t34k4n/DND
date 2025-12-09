public class Rouge extends Class {

    public Rouge(String name) {
        this.name = name;
        this.unitClass = Classes.ROUGE;
        this.attackRoll = super.getAttackRoll();

        this.weapon = Equipment.getDefaultWeapon(this.unitClass);
        this.armor  = Equipment.getDefaultArmor(this.unitClass);

        this.health = 15;
        this.level = 1;
    }
}
