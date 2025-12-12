public class Cleric extends Class {

    public Cleric(String name, Race race) {
        this.name = name;
        this.unitClass = Classes.CLERIC;
        this.attackRoll = super.getAttackRoll();
        this.race = race;

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.cantrips = new Cantrips[5];
        this.spells   = new Spells[10];

        this.health = 19;
        this.level = 1;
    }

    @Override
    public int getAttackDiceCounter() {
        return 1;
    }

}
