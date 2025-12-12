public class Rogue extends Class {

    public Rouge(String name, Race race) {
        this.name = name;
        this.unitClass = Classes.ROUGE;
        this.attackRoll = super.getAttackRoll();
        this.race = race;

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.health = 15;
        this.level = 1;
    }

    @Override
    public int getAttackDiceCounter() {
        return 1;
    }

}
