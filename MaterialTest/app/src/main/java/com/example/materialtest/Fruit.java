package com.example.materialtest;

public class Fruit {
    private String fruitName;
    private int fruitImage;

    public Fruit(String fruitName,int fruitImage){
        this.fruitName = fruitName;
        this.fruitImage = fruitImage;
    }

    public String getName(){
        return fruitName;
    }

    public int getImage(){
        return fruitImage;
    }
}
