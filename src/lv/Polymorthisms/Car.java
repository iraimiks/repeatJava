package lv.Polymorthisms;

public class Car {
    private boolean engine;
    private int cylinder;
    private int wheels;
    private String name;
    public Car(int cylinder, String name){
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }
    public String startingEngine(){
        return "Start engine";
    }
    public String carAccelereate(){
        return "Car -> accelerate   ";
    }
    public String carBrake(){
        return  "Car -> brake() ";
    }
    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}
class Bmw extends Car{
    public Bmw(){
        super(8,"Bmw");
    }

    @Override
    public String startingEngine() {
        return "BMW -> starting   ";
    }

    @Override
    public String carAccelereate() {
        return "BMW -> accelerate   ";
    }

    @Override
    public String carBrake() {
        return "BMW -> brake   ";

    }
}
