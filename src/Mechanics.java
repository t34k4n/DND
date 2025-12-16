import java.util.Random;

public class Mechanics {
    private final Random random = new Random();

    public int spellHitDamage(Class caster, int spellIndex) {

        Spells spell = caster.spells[spellIndex];
        if (spell == null) return 0;

        int total = 0;
        for (int i = 0; i < spell.getDiceCount(); i++) {
            total += random.nextInt(spell.getDiceRoll()) + 1;
        }
        return total;
    }

    public int cantripHitDamage(Class caster, int cantripIndex) {

        Cantrips cantrip = caster.cantrips[cantripIndex];
        if (cantrip == null) return 0;

        int diceCount = getCantripDiceCountByLevel(caster.getLevel());

        int total = 0;
        for (int i = 0; i < diceCount; i++) {
            total += random.nextInt(cantrip.getDiceRoll()) + 1;
        }
        return total;
    }

    public int weaponHitDamage(Class attacker){

        Weapon weapon = attacker.getWeapon();
        if(weapon == null) return 0;

        int diceCount = attacker.getAttackCount();

        int total = 0;
        for(int i = 0; i < diceCount; i++){
            total += random.nextInt(weapon.getDiceRoll()) + 1;
        }

        return total;
    }



    public int getCantripDiceCountByLevel(int level) {
        if (level >= 17) return 4;
        if (level >= 11) return 3;
        if (level >= 5)  return 2;
        return 1;
    }


    public void combat(){

    }





}
