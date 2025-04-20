package com.sebastianayasoc;

public abstract class LivingEntity implements IDamageable{
    private int maxHealth;
    private int currentHealth;
    private Boolean isDead = false;

    public LivingEntity(int maxHealth){
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
    }

    public int getMaxHealth(){
        return maxHealth;
    }

    public int getCurrentHealth(){
        return currentHealth;
    }

    public Boolean getIsDead(){
        return isDead;
    }


    public Boolean setIsDead(Boolean isdead){
        this.isDead = isdead;
        return isdead;
    }

    @Override
    public void ReceiveDamage(int damage){
        // a nuestra vida actual, se le resta el danio
        // hecho
        currentHealth -= damage;
        System.out.println("You have receive " + damage + ". Your current health is " + currentHealth);
    }

    public abstract void Attack(LivingEntity enemyEntity);

}
