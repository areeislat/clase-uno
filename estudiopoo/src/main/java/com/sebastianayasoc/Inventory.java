package com.sebastianayasoc;

import java.util.ArrayList;

public class Inventory {
    //solo estamso guardando espacio en la memoria
    // se instanciará en el constructor
    private ArrayList<Item> items;
    private int capacityLimit;
    private int actualCapacity;

    //aqui es donde se rellena el espacio con el arraylist
    public Inventory(int capacityLimit){
        items = new ArrayList<>();
        this.capacityLimit = capacityLimit;
        this.actualCapacity = 0;
    }

    public int getCapacityLimit(){
        return capacityLimit;
    }

    public void setCapacityLimit(int limit){
        // se setea el limite
        if(limit > 0){
            this.capacityLimit = limit;
        }else{
            System.out.println("The limit cannot be implemented");
        }
    }

    // donde se agregan los items
    public void addItem(Item item){
        //verifica que la capacidad actual sea menor que la
        // capacidad limite del inventario
        if (actualCapacity < capacityLimit){
            items.add(item);
            actualCapacity ++;
            System.out.println("Added item: " + item.getName());
            System.out.println("Your actual capacity is: " + actualCapacity + " of " + capacityLimit);
        } else {
            System.out.println("You can't add more items in this inventory");
        }
    }

    // buscar por indice
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

    // implementar mejor la logica de eliminar cositas por indice
    public void deleteItem(Item item){
        System.out.println("Eliminando item..." + item);
        items.remove(item);
    }

    // Devuelve los items del arraylist para llamarlos desde otras clases
    public ArrayList<Item> getItems(){
        return items;
    }
}
