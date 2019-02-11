package lv.lv.StringLearn;

public class StringLearnAndDataType {
    public static void main(String[] args) {
        //8 primitive data type who are using for Java
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        /**
         * String contain all character
         */
        String myString = "This is a string"; //Representing string
        System.out.println("my string whout are build "+myString);
        myString = myString + ", and this is more.";
        System.out.println("my string whout are build "+myString);
        myString = myString + " \u00A2 2019";
        System.out.println("some think hear "+ myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";// Here just add two string tohether witho mathematical.
        System.out.println("The result is "+ numberString);
        String lastString = "10";
        int myInt = 50;
        double myDouble = 40.2;
        lastString = lastString + myInt + myDouble; //int are converted to string and added to string and its works for another data types;

        System.out.println(lastString);
    }
}
