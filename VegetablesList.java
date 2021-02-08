package com.inventering;

import java.util.ArrayList;

public class VegetablesList  {
    public ArrayList<String> vegetablesList=new ArrayList<>();
    public void addVegetableItem(String item) {
       vegetablesList.add(item);
    }

    public void printVegetableList() {
        System.out.println("Du har " + vegetablesList.size() + " Grönsaker i din listan");
        for (int i = 0; i < vegetablesList.size(); i++) {
            System.out.println((i + 1) + "." + vegetablesList.get(i));
        }
    }

    public void modifyfruitList(int position, String newItem){
        vegetablesList.set(position,newItem);
        System.out.println("frukt list"+(position)+ "har ändrat");

    }
    public void removefruitList(int position){
        String theItem=vegetablesList.get(position);
        vegetablesList.remove(position);
    }
    public String findItem(String searchItem){
        int position=vegetablesList.indexOf(searchItem);
        if(position>=0){
            return vegetablesList.get(position);
        }
        return null;
    }
}
