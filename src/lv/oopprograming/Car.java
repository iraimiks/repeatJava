package lv.oopprograming;

public class Car {
    //fields are variables in class
    //steamant
    //encapsulation acces this from public;
    //create
    /**
     */
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colours;
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("supercar")|| validModel.equals("commoder")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }



}
