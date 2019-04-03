package lv.Encapsulation;

public class EncapsulationWithout {
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tim";
        player.health = 120;
        player.weapon = "Sword";


        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaingi helth = "+ player.healthRemainin());
        damage =11 ;
        player.loseHealth(damage);
        System.out.println("Remaingi helth = "+ player.healthRemainin());
    }
}
