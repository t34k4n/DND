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
    public void getLevelUp() {
        if(this.level == 1){
           addCantrip();
        } else if (this.level == 5) {
            this.attackCount = 2;
        } else if (this.level == 11) {
            this.attackCount = 3;
        } else if (this.level == 20){
            this.attackCount = 4;
        }
    }
}
