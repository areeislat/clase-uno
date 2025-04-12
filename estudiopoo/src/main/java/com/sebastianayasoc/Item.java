package com.sebastianayasoc;

public abstract class Item {
    private String name;
    private int value;

    public Item(String name, int value){
        this.name = name;
        this.value = value;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        
        if(value > 0){
        this.value = value;
        }
        else{
            System.err.println("The value has to be greater than zero");
        }
    }

    //public void Use(){
    //    //metodo use, para usar el objeto
    //    System.out.println("Using " + name);
    //}

    //se convierte en abstracto
    //le esta diciendo que todas las clases las implementen
    //pero que no le importa cómo
    public abstract void Use();



}
