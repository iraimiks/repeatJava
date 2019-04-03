package lv.EncapsulaitingLearning;

public class Printer {
    private int tunerLevel = 100;
    private int numberOfPagePrinted;
    private boolean duplexPrint;

    public Printer(int tunerLevel,  boolean duplexPrint) {
        if(tunerLevel >= 1 && tunerLevel<=100){
            this.tunerLevel = tunerLevel;
        }else{
           this.tunerLevel = -1;
        }
        this.duplexPrint = duplexPrint;
        this.numberOfPagePrinted = 0;
    }
    public int fillTuner(int fill){
        if(tunerLevel > 0 && tunerLevel <= 100){
            if(this.tunerLevel + tunerLevel >100){
                return  -1;
            }
            this.tunerLevel += fill;
            return  tunerLevel;
        }else{
           return -1;
        }
    }
    public int printPage(int pages){
        int pagestoPrint = pages;
        if(this.duplexPrint){
            pagestoPrint /=2;
            System.out.println("Pages to print outing");
        }
        this.numberOfPagePrinted += pagestoPrint;
        return numberOfPagePrinted;

    }

    public int getNumberOfPagePrinted() {
        return numberOfPagePrinted;
    }
}
