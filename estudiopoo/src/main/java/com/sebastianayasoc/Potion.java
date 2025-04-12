package com.sebastianayasoc;

//clase hija, extendiendo de la clase padre
public class Potion extends Item{
    //se declaran los atributos
    private int healing;

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



}
