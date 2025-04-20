package com.sebastianayasoc;

public class Character extends LivingEntity{
    private Inventory inventory;
    private Equipable equippable;
    private String name;

    public Character(int maxHealth, String name){
        super(maxHealth);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIventory(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public void setEquippable(int id){
        Item item = inventory.getItems().get(id);
        if(item instanceof Equipable equippable){
            this.equippable = equippable;
            this.equippable.Equip();
        }else{
            System.out.println("The object " + item.getName() + " is not equippable.");
        }
        System.out.println("No item found with an ad");
    }

    @Override
    public void Attack(LivingEntity enemyEntity){
        enemyEntity.ReceiveDamage(10);
    }
}
