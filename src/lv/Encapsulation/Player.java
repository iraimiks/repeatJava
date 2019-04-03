package lv.Encapsulation;

public class Player {
    public String name;
    public int health;
    public String weapon;


    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0){
            System.out.println("Payer knocke out");
        }
    }
    public int healthRemainin(){
        return  this.health;
    }
}
