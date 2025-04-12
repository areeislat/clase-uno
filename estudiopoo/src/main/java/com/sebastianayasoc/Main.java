package com.sebastianayasoc;

public class Main {
    public static void main(String[] args) {
        Weapon arma1 = new Weapon("armita",10, 50);
        Potion pocion1 = new Potion("curacion", 5, 10);
        Inventory inventario1 = new Inventory();

        // el metodo use soloo fue hecho en la clase padre,
        // pero puede ser usado en las clases hijas
        arma1.Equip();
        arma1.Unequip();
        arma1.Use();
        arma1.Use(10);
        pocion1.Use();

        inventario1.addItem(arma1);
        inventario1.addItem(pocion1);
        
        inventario1.UserItem(0);

        inventario1.showInventory();
    }
}