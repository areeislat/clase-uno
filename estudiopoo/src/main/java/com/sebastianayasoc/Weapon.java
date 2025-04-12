package com.sebastianayasoc;

//clase hija, extendiendo de la clase padre
public class Weapon extends Item implements Equipable{
    private int damage;
    private boolean equiped;

    public Weapon(String name, int value, int damage){
        super(name, value); //se llenan con los atributos del padre OBLIGATORIO
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    @Override
    public void Use(){
        if(equiped){
            System.out.println("Attacking with " + getName() + ", damage : " + damage);
        } else{
            System.out.println("Primero debes equipar : " + getName());
        }




    }

    public void Use(int bonus){
        System.out.println("Attacking with " + getName() + ", damage : " + (damage + bonus));
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
