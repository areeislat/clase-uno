package com.sebastianayasoc;

public class Tool extends Item implements Equipable{
    private String uso;
    private boolean equiped;
    
    public Tool(String name, int value, String uso){
        super(name, value);
        this.uso = uso;
    }

    public String getUso(){
        return uso;
    }

    @Override
    public void Use(){
        if(equiped){
            System.out.println("Ussing with " + getName() + ", Uso : " + uso);
        } else{
            System.out.println("First you must equip : " + getName());
        }
    }


    @Override
    public void Equip(){
        equiped = true;
        System.out.println(getName() + " equipada.");
    }

    public void Unequip(){
        equiped = false;
        System.err.println(getName() + " desequipada.");
    }

}
