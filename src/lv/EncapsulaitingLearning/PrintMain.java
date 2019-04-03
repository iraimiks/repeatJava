package lv.EncapsulaitingLearning;

public class PrintMain {
    public static void main(String[] args) {
        Printer printer = new Printer(100,true);
        System.out.println("initial page count ="+printer.getNumberOfPagePrinted());
        int pagesPrinted = printer.printPage(5);
        System.out.println("Page prinited was "+pagesPrinted +"new total count for printer "+printer.getNumberOfPagePrinted());
    }
}
