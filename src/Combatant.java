public interface Combatant {
    String getName();

    int getHealth();
    void setHealth(int hp);

    int getLevel();           // NPC için de sabit olabilir
    int getAttackRoll();      // genelde 20

    Armor getArmor();
    Weapon getWeapon();

}
