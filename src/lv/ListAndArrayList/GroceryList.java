package lv.ListAndArrayList;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() +"Item in your grocery list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ ". "+ groceryList.get(i));
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position+1) + " has been modified");
    }
    public void removeGroceryitem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
    public String findeItem(String serchItem){
    //    boolean exists = groceryList.contains(serchItem);
      int position = groceryList.indexOf(serchItem);
      if(position >=0){
          return groceryList.get(position);
      }
      return null;
    }

}
