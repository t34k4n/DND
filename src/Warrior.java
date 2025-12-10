public class Warrior extends Class {

    public Warrior(String name) {
        this.name = name;
        this.unitClass = Classes.WARRIOR;
        this.attackRoll = super.getAttackRoll();

        this.weapon = Items.getDefaultWeapon(this.unitClass);
        this.armor  = Items.getDefaultArmor(this.unitClass);

        this.health = 21;
        this.level = 1;
    }

    public int getAttackDiceCounter(){

        int counter = 1;

        if(this.getLevel() >= 5 && this.getLevel() <= 10) {
            counter = 2;
        }
        if(this.getLevel() >= 11 && this.getLevel() <= 19) {
            counter = 3;
        }
        if(this.getLevel() == 20) {
            counter = 4;
        }

        return counter;

    }

}
