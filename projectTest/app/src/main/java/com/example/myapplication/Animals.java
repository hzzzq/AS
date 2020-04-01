package com.example.myapplication;

public class Animals {
    private int aimage;
    private String name;
    private String atext;


    public Animals() {
    }

    public Animals(int aimage, String name, String text) {
        this.aimage = aimage;
        this.name = name;
        this.atext = text;
    }

    public int getAimage() {
        return aimage;
    }

    public String getName() {
        return name;
    }

    public String getAtext() {
        return atext;
    }

    public void setAimage(int aimage) {
        this.aimage = aimage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtext(String text) {
        this.atext = text;
    }
}
