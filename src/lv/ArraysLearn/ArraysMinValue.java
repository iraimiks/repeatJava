package lv.ArraysLearn;

import java.util.Scanner;

public class ArraysMinValue {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        readIntegers(3);
    }
    public static int[] readIntegers(int numbersOf){
        int[] values = new int[numbersOf];
        System.out.println("You need enter: "+numbersOf);
        for(int i=0; i<values.length;i++){
            System.out.println("Enter a number");
            int count = scanner.nextInt();
            scanner.nextInt();
            int[] returnArray = readIntegers(count);
            int returnedMin = fintMin(returnArray);
            System.out.println("min = " + returnedMin);
        }
        return values;
    }
    public static int fintMin(int[] array){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
