package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setName("Alone");
        wolf.setColor("grey");
        wolf.setAge(7);
        wolf.setWeight(19.2);
        wolf.setSex('M');
        
        System.out.println("Wolf's name: " + wolf.getName() 
                + "\nColor: " + wolf.getColor()
                + "\nAge: " + wolf.getAge()
                + "\nWeight: " + wolf.getWeight()
                + "\nSex: " + wolf.getSex());
        
        wolf.run();
        wolf.howl();
        wolf.walk();
        wolf.hunt();
        wolf.sit();
    }
}