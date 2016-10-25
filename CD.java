package com.Stephanie;

public class CD extends Album{


    public CD(String artist,String title,double price){
    super(artist, title,price); //call the album constructor
    }

    @Override
public String toString() {
        return "Format = CD, Artist = " + artist + ", Title= " +
                title + ", Price $" + price;
    }}
