public class Fighter extends Class {

    private int attackCount;

    public Fighter(String name, Race race) {
        this.name = name;
        this.unitClass = Classes.FIGHTER;
        this.attackRoll = super.getAttackRoll();
        this.race = race;
        this.attackCount = 1;

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.health = 21;
        this.level = 1;
        this.xp = 1;
    }

    @Override
    public void getLevelUp() {
        if(this.level == 1){
            this.attackCount = 1;
        } else if (this.level == 5) {
            this.attackCount = 2;
        } else if (this.level == 11) {
            this.attackCount = 3;
        } else if (this.level == 20){
            this.attackCount = 4;
        }
    }
}
