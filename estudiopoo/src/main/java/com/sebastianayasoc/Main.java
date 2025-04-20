package com.sebastianayasoc;

public class Main {
    public static void main(String[] args) {
        Weapon arma1 = new Weapon("armita",10, 50);
        Potion pocion1 = new Potion("curacion", 5, 10);
        Tool herramienta1 = new Tool("Pala",2,"Cavar");
        Inventory inventario1 = new Inventory(10);
        Character personaje1 = new Character(100, "Guerrero");
        Npc monster = new Npc(90, "Tentaculos-chan");

        Combat combate = new Combat(personaje1, monster,inventario1);

        
        

        // el metodo use solo fue hecho en la clase padre,
        // pero puede ser usado en las clases hijas
        

        //para equipar
        //arma1.Equip();
        //herramienta1.Equip();

        //para desequipar
        //arma1.Unequip();
        /* 
        arma1.Use();
        arma1.Use(10);
        pocion1.Use();
        */

        inventario1.addItem(arma1);
        inventario1.addItem(pocion1);
        inventario1.addItem(herramienta1);
        
        //inventario1.UserItem(0);

        //inventario1.showInventory();

        //inventario1.deleteItem(arma1);

        //inventario1.showInventory();

        //personaje1.Attack(monster);
        //monster.Attack(personaje1);
        //combate.CombatStart();
        
        combate.CombatDesicion();
    }   
}