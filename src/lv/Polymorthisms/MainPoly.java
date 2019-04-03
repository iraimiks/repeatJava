package lv.Polymorthisms;

class Movie{
    private String nameMovie;

    public Movie(String nameMovie) {
        this.nameMovie = nameMovie;
    }
    public String plot(){
        return "No plot here";
    }

    public String getNameMovie() {
        return nameMovie;
    }
}
class Jaws  extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "Shar eats lot of people";
    }
}
class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("IndependenceDay");
    }
    @Override
    public String plot(){
        return "Aliens attempt to take world";
    }
}
class MazerRunner extends  Movie{
    public MazerRunner(){
        super("MazerRunner");
    }
    @Override
    public String plot(){
        return "Kids trying escape a maze";
    }

}
class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot(){
        return "Imperial take over univers";
    }
}
class Forgetable  extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    // No plot method
}



public class MainPoly {
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+
                               " : " + movie.getNameMovie() + "\n"
                                + "Plot: " + movie.plot() + "\n");
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1;
        System.out.println("Random number was =" +randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazerRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
