package com.sebastianayasoc;

public class Npc extends LivingEntity{

    private String name;

    public Npc (int maxHealth, String name){
        super(maxHealth);
        this.name = name;
    }

    public String getName(){
        return name;
    }

public void Attack(LivingEntity enemyEntity){
    enemyEntity.ReceiveDamage(10);
}
}
