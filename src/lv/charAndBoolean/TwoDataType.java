package lv.charAndBoolean;

public class TwoDataType {
    public static void main(String[] args) {
        char myChar = 'A'; //unicode-table.com can find char values in unicode;
        char myChar2 = '\u00A9';
        System.out.println("Unicode output was: "+ myChar2);

        boolean myBoolean = false;
        boolean myBoolean2 = true;

        char myFindedChar = '\u04B9';
        System.out.println("My searched unicode char is = " + myFindedChar);

    }
}
