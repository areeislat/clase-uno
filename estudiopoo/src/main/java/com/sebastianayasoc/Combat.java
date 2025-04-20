package com.sebastianayasoc;

import java.util.Scanner;

public class Combat {
    private Character playerCharacter;
    private Npc enemyCharacter;
    private Inventory inventoryPlayer;

    public Combat (Character playCharacter, Npc enemyCharacter, Inventory inventoryPlayer){
        this.playerCharacter = playCharacter;
        this.enemyCharacter = enemyCharacter;
        this.inventoryPlayer = inventoryPlayer;
    }

    public void CombatStart(){
        System.out.println("You hace encountered an enemy " + enemyCharacter.getName());
        while (!playerCharacter.getIsDead() && !enemyCharacter.getIsDead()){
            if (playerCharacter.getCurrentHealth() == 0) {
                playerCharacter.setIsDead(true);
                System.out.println(playerCharacter.getName() + " ha muerto");
            } else if (enemyCharacter.getCurrentHealth() == 0) {
                enemyCharacter.setIsDead(true);
                System.out.println(enemyCharacter.getName() + " ha muerto.");
            } else if (!playerCharacter.getIsDead()) {
                System.out.println(playerCharacter.getName() + " ataca.");
                playerCharacter.Attack(enemyCharacter);
            }
             else if (!enemyCharacter.getIsDead()){                
                System.out.println(enemyCharacter.getName() + " ataca.");
                enemyCharacter.Attack(playerCharacter);
            }


        }
    }


    public void CombatDesicion(){
        System.out.println("You hace encountered an enemy " + enemyCharacter.getName());
        Scanner scanner = new Scanner (System.in);
        while (!playerCharacter.getIsDead() && !enemyCharacter.getIsDead()){
                System.out.println("----Opciones Player----");
                System.out.println("1 -> Atacar");
                System.out.println("2 -> Usar item");
                System.out.println("3 -> Pasar");
                System.out.println("-----------------------");
                System.out.println("Escribe un número: ");
                int desicion = scanner.nextInt();
                
                switch (desicion) {
                    case 1:
                        System.out.println("Elegiste atacar.");
                        playerCharacter.Attack(enemyCharacter);
                        break;
                    case 2:
                        //System.out.println("Tomaste una poción.");
                        //mostrar un inventario
                        inventoryPlayer.showInventory();
                        //metodo consumir pocion
                        System.out.println("Tomaste una poción");
                        break;
                    case 3:
                        System.out.println("Pasaste.");
                        break;
                    default:
                        System.out.println("Elige una opción válida la prox vez, por favor.");
                        System.out.println("Pasaste por default.");
                        break;
                }
            if (enemyCharacter.getCurrentHealth() == 0) {
                // Verifica si el enemigo ha muerto o no
                enemyCharacter.setIsDead(true);
                System.out.println(enemyCharacter.getName() + " ha muerto.");
                scanner.close();
            }   else {
                // Aqui se supone que ataca sea cual sea la desicion (?)
                System.out.println(enemyCharacter.getName() + " ataca.");
                enemyCharacter.Attack(playerCharacter);
                if(playerCharacter.getCurrentHealth() == 0){
                    // pero verifica si el player murió o no
                    // para seguir iterando
                    playerCharacter.setIsDead(true);
                    System.out.println(playerCharacter.getName() + " ha muerto");
                    scanner.close();
                }
            }
                
            }
        }
        
    }

