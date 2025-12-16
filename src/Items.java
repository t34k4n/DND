public class Items {

    public static Weapon getDefaultWeapon(Classes unitClass) {
        switch (unitClass) {
            case FIGHTER:
                return new Weapon("Long Sword",1,1,14,Classes.FIGHTER);
            case ROUGE:
                return new Weapon("Dagger",1,1,6,Classes.ROUGE);
            case MAGE:
                return new Weapon("Ice Staff",1,1,8,Classes.MAGE);
            case CLERIC:
            default:
                return new Weapon("Sword",1,1,12,Classes.CLERIC);
        }
    }

    public static Armor getDefaultArmor(Classes unitClass) {
        switch (unitClass) {
            case FIGHTER:
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

    public static Cantrips showCantrips(int number) {

        switch (number) {
            case 1:
                return new Cantrips("Guidance", 4);
            case 2:
                return new Cantrips("Sacred Flame", 8);
            case 3:
                return new Cantrips("Ray of Frost", 8);
            case 4:
                return new Cantrips("Fire Bolt", 10);
            case 5:
                return new Cantrips("Eldritch Blast", 10);
            default:
                return null;
        }
    }

    public static Spells showSpells(int number) {

        switch (number) {
            case 1:
                return new Spells(1, 10,"BOK",1);
            case 2:
                return new Spells(1, 10,"BOK",1);
            case 3:
                return new Spells(1, 10,"BOK",1);
            case 4:
                return new Spells(1, 10,"BOK",1);
            case 5:
                return new Spells(1, 10,"BOK",1);
            case 6:
                return new Spells(1, 10,"BOK",1);
            case 7:
                return new Spells(1, 10,"BOK",1);
            case 8:
                return new Spells(1, 10,"BOK",1);
            case 9:
                return new Spells(1, 10,"BOK",1);
            case 10:
                return new Spells(1, 10,"BOK",1);
            default:
                return null;
        }
    }
}

