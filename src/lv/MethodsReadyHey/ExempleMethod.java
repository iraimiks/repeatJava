package lv.MethodsReadyHey;

public class ExempleMethod {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(30.0));
        System.out.println(toMilesPerHour(-4.0));
        kilometersPerHour(-8);
        printMegBytesAndKiloBytes(2500);
        System.out.println(shouldWakeUp(true,10));
        System.out.println(shouldWakeUp(true,2));
        System.out.println(isLeapYear(3999));
        System.out.println(areEqualByThreeDecimalPlaces(3.22,4.0));
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return (long)kilometersPerHour;
    }
    public static void kilometersPerHour(double printConversiopn){
        if(toMilesPerHour(printConversiopn)>0){
            long YY = toMilesPerHour(printConversiopn);
            double XX = YY * 1.609;
            System.out.println(XX+ " km/h = "+YY+" mi/h");
        }else{
            System.out.println("Invalid Value");
        }
    }
    public static void printMegBytesAndKiloBytes(int kiloBytes){
        //1mb = 1024kb
        if(kiloBytes>0) {
            int ZZ = kiloBytes % 1024;
            int YY = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + YY + " MB " + ZZ + " KB");
        }else{
            System.out.println("Invalid Value");
        }

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        return ((barking && hourOfDay<=8&&hourOfDay>0)||hourOfDay > 22 && hourOfDay < 24);
    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
            if((year%4)==0){
                return true;
            }else if((year%100)==0){
                return true;
            }else if((year%400)==0){
                return true;
            }
        }
        return false;
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y){
        x = (int)(x*1000);
        y = (int)(y*1000);
        if(y == y){
            return true;
        }
        return false;
    }
}
