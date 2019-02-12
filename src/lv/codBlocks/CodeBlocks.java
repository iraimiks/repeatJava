package lv.codBlocks;

public class CodeBlocks {
    public static void main(String[] args) {
        //all about curdle brackets Check it and you can figurout how many blocks you can
        //fined in code

        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        /*if(score < 500 && score > 1000) {
            System.out.println("Your score was 500");
        }else if(score < 1000){
            System.out.println("Slow down boy");
        }else{
            System.out.println("Cool thinck happened");
        }*/
        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //scope Accusation of variables .

        int secondScore = 1000;
        int secondBonus = 200;
        int levelCompled = 8;
        boolean winGame = true;
        if(winGame){
            System.out.println("Your score = "+secondScore);
            int scoreGetFinaly = secondScore +(levelCompled * secondBonus);
            System.out.println("Your bonus score = " +scoreGetFinaly);
        }


    }
}
