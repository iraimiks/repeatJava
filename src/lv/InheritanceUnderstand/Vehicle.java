package lv.InheritanceUnderstand;

public class Vehicle {
    private String nameCar;
    private String sizeOfCar;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String nameCar, String sizeOfCar) {
        this.nameCar = nameCar;
        this.sizeOfCar = sizeOfCar;

        this.currentDirection = 0;
        this.currentVelocity = 0;

    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at "+currentDirection+" degrees");
    }
    public  void  move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at "+currentVelocity+" in directio "+currentVelocity);
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getSizeOfCar() {
        return sizeOfCar;
    }

    public void setSizeOfCar(String sizeOfCar) {
        this.sizeOfCar = sizeOfCar;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }


    public void stop(){
        this.currentVelocity = 0;
    }
}
