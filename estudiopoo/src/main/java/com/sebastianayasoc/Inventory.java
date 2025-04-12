package com.sebastianayasoc;

import java.util.ArrayList;

public class Inventory {
    //solo estamso guardando espacio en la memoria
    // se instanciará en el constructor
    private ArrayList<Item> items;

    //aqui es donde se rellena el espacio con el arraylist
    public Inventory(){
        items = new ArrayList<>();
    }

    // donde se agregan los items
    public void addItem(Item item){
        items.add(item);
        System.out.println("Added item : " + item.getName());
    }

    public void UserItem(int index){
        //validadores
        if(index >= 0 && index < items.size()){
            items.get(index).Use();
        }else {System.out.println("Invalid Index");} 
    }

    public void showInventory(){
        System.out.println("Inventory: ");
        for( int i = 0; i < items.size(); i++){
            System.out.println(i + ": " + items.get(i).getName());
        }
    }

}
