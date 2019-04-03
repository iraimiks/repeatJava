package lv.ArraysLearn;

import java.util.Scanner;

public class ArraysLern {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArrays = new int[30];
        for(int i=0; i<30; i++){
            myArrays[i] = i*2;

        }
        //printArray(myArrays);
        int[] myIntegers = getInteer(3);
        for(int i = 0; i<myIntegers.length; i++){
            System.out.println("Elements "+i+" type, value was " +myIntegers[i]);
        }
        System.out.println("The avarage of my input numbers are : "+getAvarege(myIntegers));
    }
    public static void printArray(int[] arrays){
        for(int i=0; i<arrays.length; i++){
            System.out.println("Elemetn i is = "+i+"Element i * 2 = "+arrays[i]);
        }
    }
    public static int[] getInteer(int numbers){
        System.out.println("Enter +"+ numbers +"thy");
        int[] values = new int[numbers];
        for(int i=0; i<values.length; i++){
           values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAvarege(int[] arrays){
        int sum = 0;
        for(int i=0; i<arrays.length; i++){
            sum +=arrays[i];
        }
        return (double)sum/(double)arrays.length;
    }
}
