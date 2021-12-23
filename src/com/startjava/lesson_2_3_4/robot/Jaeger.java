package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int strength;
    private int armor;

    public Jaeger() {

    }

    public Jaeger(String modelName) {
        this.modelName = modelName;
    }

    public Jaeger(String modelName, String mark) {
        this(modelName);
        this.mark = mark;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean drift() {
        return false;
    }

    public void move() {
        System.out.println("Moving...");
    }

    public String scan() {
        return "scanning...";
    }

    public void useVortexCannon() {
        System.out.println("Activated!");
    }
}