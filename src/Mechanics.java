import java.util.Random;

public class Mechanics {
    private final Random random = new Random();

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



}
