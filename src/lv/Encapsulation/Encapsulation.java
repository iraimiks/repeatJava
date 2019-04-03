package lv.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        EnchancedPlayerEncapsulated palyer = new EnchancedPlayerEncapsulated("Raimds",111, "Spear");
        System.out.println("Initial health is "+ palyer.getHealth());
    }
}
