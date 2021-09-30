package com.company.oop.polymorphism.challenge;

public class Kia extends Car{

    public Kia(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Kia -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Kia -> accelerate()";
    }

    @Override
    public String brake() {
        return "Kia -> brake()";
    }
}
