package lv.operatorsAnd;

public class OperatorsAndUse {
    public static void main(String[] args) {
        //operator are spacial symbols
        int result = 1 + 3; // = plase varibla from right to left
        System.out.println("result are =" + result);
        int previousResult = result; //store result in new warible
        result = result - 1;
        System.out.println(previousResult + " - 1 =" + result);


        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + "* 10 =" + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + "/ 10=" + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 =" + result);
        previousResult = result;
        result = result + 1;
        result++;
        System.out.println("Result are" + result);
        result--;
        System.out.println("Result are" + result);
        // Can use += *= -= /= comman operators
        // Statements
        // equel
        boolean isCool = false;
        if (isCool == false) {
            System.out.println("It is not so cool");
        }
        int topScore = 100;
        if (topScore != 100) {
            System.out.println("Hey you got the moste coolest score in the world");
        }
        int sceondTopScore = 200;
        if (topScore > sceondTopScore && topScore < 100) {
            System.out.println("Greaters score");
        }

        //or operator one of need to be true ||
        if (topScore > 90 || sceondTopScore <= 90) {
            System.out.println("One of this test are true");
        }
        //one equal are assessment, but two are equals we can use in boolean checks.
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This are errr");
        }
        boolean isCar = false;
        if (isCar = true) //we makeing
            System.out.println("This is not supposed to happen");

        //ternary operator

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("WasCar is true");
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html <-- her can find operatorsl

        double number1 = 20.0;
        double number2 = 80.0;
        double resultNew;
        resultNew = (number1 + number2) * 25;
        System.out.println(resultNew);
        double resultReminder = resultNew % 40;
        System.out.println(resultReminder);
        if (resultNew <= 20)
            System.out.println("Total was over the limit");
        //Long version
        if (resultNew == 20 || resultReminder < 20) {
            System.out.println("Total was over the limit");

        }
        //http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

    }


}
