package lv.ArraysLearn;

import java.util.Scanner;

public class ArraysSort {


    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArrays = getInteer(5);
        printArray(myArrays);

    }
    public static int[] getInteer(int numbers){
        System.out.println("You need enter  "+ numbers);
        int[] values = new int[numbers];
        for(int i=0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){

            System.out.println("Eache element printed "+i+" array element"+array[i]);

        }
    }
    public static int[] sortInteger(int[] array){
        int[] sortedArray = new int[array.length]; //created array whotis execly same lengeth of array whot is pass;
        for(int i=0; i<array.length; i++){
            sortedArray[i] = array[i]; // created copy of existing array;
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i=0; i<sortedArray.length-1;i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return  sortedArray;
    }

}
