public class Mage extends Class {

    public Mage(String name) {
        this.name = name;
        this.unitClass = Classes.MAGE; // ROUGE değildi, düzelttik :)
        this.attackRoll = super.getAttackRoll();

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.health = 16;
        this.level = 1;
    }
}
