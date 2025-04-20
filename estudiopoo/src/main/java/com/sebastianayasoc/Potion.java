package com.sebastianayasoc;

//clase hija, extendiendo de la clase padre

public class Potion extends Item implements Consumible{
    //se declaran los atributos
    private int healing;
    private boolean consumir;

    //se declara todo el constructor con sus atributos
    public Potion(String name, int value, int healing){
        super(name, value);
        this.healing = healing;
    }

    //getter
    public int getHealing(){
        return healing;
    }


    @Override
    public void Use(){
        System.out.println("Healing with " + getName() + ", damage : " + healing);
    }

    @Override
    public void Consumir(){
        consumir = false;
        System.out.println(getName() + " consumida.");
        // ¿puedo llamar al remove desde aqui?
    }


}
