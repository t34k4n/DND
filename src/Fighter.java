public class Fighter extends Class {

    public Fighter(String name, Race race) {
        this.name = name;
        this.unitClass = Classes.FIGHTER;
        this.attackRoll = super.getAttackRoll();
        this.race = race;

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.health = 21;
        this.level = 1;
    }

    @Override
    public int getAttackDiceCounter() {
        return 0;
    }


}
