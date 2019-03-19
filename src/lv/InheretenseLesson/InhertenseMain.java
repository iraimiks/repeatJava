package lv.InheretenseLesson;

public class InhertenseMain {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal",1,1,1,1);
        Dog dog = new Dog("Yorkie",8,2,3,4,5,"long");
        dog.eat();
        dog.walk();
    }
}
