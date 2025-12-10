public class Items {

    public static Weapon getDefaultWeapon(Classes unitClass) {
        switch (unitClass) {
            case WARRIOR:
                return new Weapon("Long Sword", 10,1,1,14,Classes.WARRIOR);
            case ROUGE:
                return new Weapon("Dagger", 8,1,1,6,Classes.ROUGE);
            case MAGE:
                return new Weapon("Ice Staff", 6,1,1,8,Classes.MAGE);
            case CLERIC:
            default:
                return new Weapon("Sword", 8,1,1,12,Classes.CLERIC);
        }
    }

    public static Armor getDefaultArmor(Classes unitClass) {
        switch (unitClass) {
            case WARRIOR:
                return new Armor("Iron Plate", 18,1);
            case ROUGE:
                return new Armor("Black Coat", 10,1);
            case MAGE:
                return new Armor("Blue Robe", 10,1);
            case CLERIC:
            default:
                return new Armor("Chain Robe", 14,1);
        }
    }

    public static Cantrips getCantrips(int number) {
        switch (number) {
            case 1:
                return new Cantrips("Fire Bolt",1, 10);

            default:
                return new Cantrips("Eldritch Blast",1, 10);
        }
    }
}

