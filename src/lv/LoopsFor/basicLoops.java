package lv.LoopsFor;

public class basicLoops {
    public static void main(String[] args) {
        System.out.println("1000 amount at 2 % interest: "+calculInterest(1000.0,2.0));
        //for(init; termination; increment){
        for(int i=0; i<4; i++){
            System.out.println("Helo ther "+i+" Monika");
        }
        for(double i=1.0; i<9.0; i++){
            System.out.println("1000 amount at "+i+" % interest: "+calculInterest(1000.0,i));
        }
        System.out.println();
        for(double i=8.0; i>0.0; i--){
            System.out.println("1000 amount at "+i+" % interest: "+calculInterest(1000.0,i));
        }
        System.out.println(primeNumber.isPrime(4));
        int prime = 0;
        int notePrime = 0;
        for(int i = 0; i < 100; i++){
            if(primeNumber.isPrime(i)==true){
                prime++;
                System.out.println("Prime number"+i);
                if(prime==10){
                    break;
                }
            }
        }
        System.out.println(prime);
        System.out.println(notePrime);
    }
    private static double calculInterest(double amount, double interest){
        return (amount *(interest/100));
    }
}
