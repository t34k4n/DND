public class Equipment {

    public static Weapon getDefaultWeapon(Classes unitClass) {
        switch (unitClass) {
            case WARRIOR:
                return new Weapon("Long Sword", 10);
            case ROUGE:
                return new Weapon("Dagger", 8);
            case MAGE:
                return new Weapon("Ice Staff", 6);
            case CLERIC:
            default:
                return new Weapon("Sword", 8);
        }
    }

    public static Armor getDefaultArmor(Classes unitClass) {
        switch (unitClass) {
            case WARRIOR:
                return new Armor("Iron Plate", 18);
            case ROUGE:
                return new Armor("Black Coat", 10);
            case MAGE:
                return new Armor("Blue Robe", 10);
            case CLERIC:
            default:
                return new Armor("Chain Robe", 14);
        }
    }
}

