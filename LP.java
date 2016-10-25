package com.Stephanie;

/**
 * Created by Stephanie on 10/25/2016.
 */
public class LP extends Album {
    private int condition; //1 = barely playable, 5= mint


    public LP(String artist, String title, int condition, double price){
        super(artist, title,price); //call the album constructor
        this.condition = condition;

    }
    @Override
    public String toString(){
        return "Format = CD, Artist = "+artist+", Title= "+
                title+"Condition="+condition+", Price $" + price;
    }
}
