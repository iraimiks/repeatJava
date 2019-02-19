package lv.MethodOverload;

public class MethodOverload {

    public static void main(String[] args) {
        calculateScore("Tim",40040);
        int overloadPar = calculateScore("Bratans",4040);
        System.out.println("Ather cheater score are "+ overloadPar);
        calculateScore(2020);
        calculateScore();
        calcFeetAndInchesToCentimeters(5,3);
        calcFeetAndInchesToCentimeters(3.0);
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("His name are "+ playerName+ "and his score was "+score);
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("No name cool man"+score);
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No name cool man");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet <0) || ((inches < 0)||(inches>12))){
            System.out.println("Invalid feed or Inches");
            return -1;
        }
        double centimeter = (feet * 12)*2.54;
        centimeter += inches * 2.54;
        System.out.println(feet+ " feet, " + inches +"inches = "+ centimeter + " cm");
        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeters( double inches){
        if(inches < 0){
            System.out.println("Invalid Inches");
            return -1;
        }

        double feet = (int)inches/12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " inches is qual to "+ feet + "feet and "+ remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet,remainingInches);
    }

}
