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


    public int startCombatPlayer(Class player, NPC npc){
        int playerDiceCheck = random.nextInt(20) + 1;
        int npcDiceCheck = random.nextInt(20) + 1;

        if(npcDiceCheck > playerDiceCheck){
            System.out.println("Player " + player.getName() + " dice check failed!");
            return 1;
        } else if (playerDiceCheck > npcDiceCheck) {
            System.out.println("Player " + player.getName() + " dice check succeed!");
            return 0;
        } else  {
            System.out.println("Player " + player.getName() + " miss.");
            return 1;
        }
    }

    public int startCombatNpc(Class player, NPC npc){
        int playerDiceCheck = random.nextInt(20) + 1;
        int npcDiceCheck = random.nextInt(20) + 1;

        if(npcDiceCheck > playerDiceCheck){
            System.out.println("NPC " + npc.getName() + " dice check succeed!");
            return 0;
        } else if (playerDiceCheck > npcDiceCheck) {
            System.out.println("NPC " + npc.getName() + " dice check failed!");
            return 1;
        } else  {
            System.out.println("NPC " + player.getName() + " miss.");
            return 1;
        }
    }

    public void combatInitiaed(Class player, NPC npc){

        int startNumber = startCombatPlayer(player, npc);
        if(0 == startNumber){
            System.out.println("Player " + player.getName() + " Starts combat!");
        } else if (1 == startNumber) {
            System.out.println("Npc " + player.getName() + " Starts combat!");
        }

        while(player.health == 0 || npc.health == 0){

        }
    }




}
