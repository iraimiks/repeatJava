package lv.LoopsFor;

public class loopSum {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i=1; i<1000; i++){
            if((i%3==0 )&& (i % 5 == 0)){
                count++;
                sum+=i;
                System.out.println("Found number: "+i);
            }
            if(count==5){
                break;
            }
        }
        System.out.println("Sum = "+sum);
    }
    public static boolean isOdd(int number){
        if(number>0){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if(isOdd(start)&&isOdd(end)){
            for(;start<=end;start++){

            }
        }
        return start;
    }
}
