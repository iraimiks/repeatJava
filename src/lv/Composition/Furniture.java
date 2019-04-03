package lv.Composition;

public class Furniture {
    private String chear;
    private String table;

    public Furniture(String chear, String table) {
        this.chear = chear;
        this.table = table;
    }
    public void getAllChears(){
        System.out.println("Chears Her");
    }

    public String getChear() {
        return chear;
    }

    public String getTable() {
        return table;
    }
}
