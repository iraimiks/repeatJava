package lv.LoopsFor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhileLoopExm {
    public static void main(String[] args) {
        /*int count = 1;
        while(count != 6){
            System.out.println("Print coutn number: "+count);
            count++;
        }
        System.out.println("++++++++");
        for(count = 1; count !=6; count++){
            System.out.println("Count value " +count);
        }
        count = 1;
        while(true){
            if(count ==6){
                break;
            }
            System.out.println("Print coutn number: "+count);
            count++;
        }
        count =6;
        do{
            System.out.println("Count value was"+count);
            count++;
            if(count > 100){
                break;
            }
        }while(count != 6);
        //do while atleast  once will execute;*/

        System.out.println(isEventNumber(0));
        int number = 4;
        int finishNumber = 20;
        int totalEvenNum = 0;
        while (number <= finishNumber){
            number++;
            if(isEventNumber(number)){
                continue;
            }
            System.out.println("Even number "+ number);

            totalEvenNum++;
            if(totalEvenNum>=5){
                break;
            }
        }


    }
    public static boolean isEventNumber(int even){
        if(even%2!=0){
            return true;
        }
        return false;
    }
}
