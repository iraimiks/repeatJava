package lv.AreaCalculator;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(3.3));
        System.out.println(area(2.3,24.2));
        printYearsAndDays(525600);
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if(x <0 || y <0){
            return -1.0;
        }
        return x * y;
    }
    public static void printYearsAndDays(long minutes){
        long XX = minutes;
        long YY = XX/(365 * 24 * 60);
        long ZZ = (minutes%(365 * 24 * 60))/(24 * 60);
        if(minutes<0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(XX + " min = "+YY+" y and "+ ZZ +" d");
        }


    }
}
