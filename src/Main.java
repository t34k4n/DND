//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Warrior Mehmet = new Warrior("Mehmet");
    Mehmet.setLevel(6);
    System.out.println(Mehmet.getAttackDiceCounter());
    System.out.println(Mehmet.physicalHitDamage());

    Cleric Ayse = new Cleric("Ayse");
    Ayse.setLevel(9);
    Ayse.cantrip = Items.getCantrips(1);
    System.out.println(Ayse.cantrip.getName());
    System.out.println(Ayse.cantripHitDamage());

}
