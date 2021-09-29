package com.company.oop.inheritance.example;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(int brain, int body, int size, int weight, String name) {
        super(brain, body, size, weight, name);
    }

    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void move(int speed) {
        super.move(5);
        System.out.println(getName() + " is moving.");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getName() + " is eating food.");
    }
}
