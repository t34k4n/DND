//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cleric cleric = new Cleric("Mehmet",Race.HUMAN);

    Mechanics mechanics = new Mechanics();

    cleric.getLevelUp();

    int number = cleric.chooseCantripSlot();

    int damage = mechanics.cantripHitDamage(cleric, number);

    System.out.println("Damage: " + damage);

}
