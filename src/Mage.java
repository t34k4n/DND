public class Mage extends Class {

    public Mage(String name, Race race) {
        this.name = name;
        this.unitClass = Classes.MAGE; // ROUGE değildi, düzelttik :)
        this.attackRoll = super.getAttackRoll();
        this.race = race;

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.cantrips = new Cantrips[5];
        this.spells   = new Spells[10];

        this.health = 16;
        this.level = 1;
        this.xp = 1;
    }

    @Override
    public void getLevelUp() {
    }

}
