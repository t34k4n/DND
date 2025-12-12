import java.util.Random;

public class Mechanics {
    private final Random random = new Random();

    public int physicalHitDamage(Class c) {
        int naturalAttacks = c.getAttackDiceCounter();
        int weaponAttacks  = c.getWeapon().getDiceCount();

        int total = 0;

        // (Not: D&D'de d20 hit içindir; senin sistemde "damage'e eklenen doğal zar" gibi duruyor.)
        for (int i = 0; i < naturalAttacks; i++) {
            total += random.nextInt(c.getAttackRoll()) + 1;
        }

        for (int i = 0; i < weaponAttacks; i++) {
            total += random.nextInt(c.getWeapon().getDiceRoll()) + 1;
        }

        return total;
    }

    public int spellHitDamage(Class caster, int spellIndex) {
        if (caster == null || caster.spells == null || caster.spells.length == 0) return 0;
        if (spellIndex < 0 || spellIndex >= caster.spells.length) return 0;

        Spells spell = caster.spells[spellIndex];
        if (spell == null) return 0;

        // Level requirement kontrolü
        if (spell.getRequiredLevel() > caster.getLevel()) return 0;

        int total = 0;
        for (int i = 0; i < spell.getDiceCount(); i++) {
            total += random.nextInt(spell.getDiceRoll()) + 1;
        }
        return total;
    }

    public int cantripHitDamage(Class caster, int cantripIndex) {
        if (caster == null || caster.cantrips == null || caster.cantrips.length == 0) return 0;
        if (cantripIndex < 0 || cantripIndex >= caster.cantrips.length) return 0;

        Cantrips cantrip = caster.cantrips[cantripIndex];
        if (cantrip == null) return 0;

        int diceCount = getCantripDiceCountByLevel(caster.getLevel());

        int total = 0;
        for (int i = 0; i < diceCount; i++) {
            total += random.nextInt(cantrip.getDiceRoll()) + 1;
        }
        return total;
    }

    private int getCantripDiceCountByLevel(int level) {
        if (level >= 17) return 4;
        if (level >= 11) return 3;
        if (level >= 5)  return 2;
        return 1;
    }

    public void applyDamage(Class target, int attack) {
        int netDamage = attack - target.getArmor().getProtection();
        if (netDamage < 0) netDamage = 0;

        target.setHealth(Math.max(0, target.getHealth() - netDamage));
    }
}
