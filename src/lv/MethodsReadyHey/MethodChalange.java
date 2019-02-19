package lv.MethodsReadyHey;

public class MethodChalange {
    public static void main(String[] args) {
        String platerName = "Antons";
        int score = 3000;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(platerName,position);
        int position2 = calculateHighScorePosition(100);
        displayHighScorePosition("Raims",position2);
        System.out.println(toMilesPerHour(20.0));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        return Double.valueOf(kilometersPerHour).longValue();
    }
    public static void displayHighScorePosition(String playerName, int positionInScoreTable){
        System.out.println(playerName +" position in score table "+positionInScoreTable);
    }
    public static int calculateHighScorePosition(int score){
        /*if(score >= 1000){
            return 1;
        }else if(score >= 500){
            return 2;

        }else if(score >= 100){
            return 3;
        }else{
            return 4;
        }*/
        int position = 4; // assuming position 4 will be returned
        if(score >=1000){
            position = 1;
        }else if (score >= 500){
            position = 2;
        }else if (score >= 100){
            position = 3;
        }
        return position;
    }
}
