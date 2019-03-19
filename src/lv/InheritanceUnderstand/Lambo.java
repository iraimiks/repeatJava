package lv.InheritanceUnderstand;

public class Lambo extends Car{
    private int troadServiceMonths;

    public Lambo(int troadServiceMonths) {
        super("Lambo", "4DW", 5, 5, 6, false);
        this.troadServiceMonths = troadServiceMonths;
    }
}
