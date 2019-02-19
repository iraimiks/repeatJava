package lv.MethodsReadyHey;

public class StartUsingMethods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        int hightScoreHer =  calculateScore(true, 800, 5, 100);
        System.out.println("Yout super score "+ hightScoreHer );

        calculateScore(gameOver, score, levelCompleted,bonus);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if(gameOver){
            int finalScore = score+(levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }//daunt return anything because have type void
    // -1 invalid value or cosse error.

}
