package com.example.week6_b4.model;

public class Cat {
    private int rsImg;
    private String name;

    public Cat(int rsImg, String name) {
        this.rsImg = rsImg;
        this.name = name;
    }

    public int getRsImg() {
        return rsImg;
    }

    public String getName() {
        return name;
    }

    public void setRsImg(int rsImg) {
        this.rsImg = rsImg;
    }

    public void setName(String name) {
        this.name = name;
    }
}
