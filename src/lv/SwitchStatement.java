package lv;

public class SwitchStatement {
    public static void main(String[] args) {
        int someValue = 3;
        switch (someValue){
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            case 3: case 4:
                System.out.println("Was 3 or 4");
                System.out.println("Actuoaly number: "+ someValue);
                break;
            default:
                System.out.println("Not 1 not 2");
                break;
        }
        char letter = 'X';
        switch (letter){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("No such letter");
                break;
        }
        String day = "Monday";
        switch (day){
            case "Monday":
                System.out.println("Mon");
                break;
            default:
                System.out.println("Holiday");
                break;
        }
        printDayOfTheWeek(-2);

    }
    private static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
                default:
                    System.out.println("invalide value");
                    break;
        }
    }
}
