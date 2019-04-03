package lv.Composition;

public class Room {
    private String name;
    private Furniture furniturel;

    public Room(String name, Furniture furniturel) {
        this.name = name;
        this.furniturel = furniturel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Furniture getFurniturel() {
        return furniturel;
    }

    public void setFurniturel(Furniture furniturel) {
        this.furniturel = furniturel;
    }
}
