package com.tutorial;

public class HeroWarrior extends Hero{
    double defense;

    // * Overriding methods
    void display() {
        System.out.println("\nClass : Warrior");
        System.out.println("Hero 1 : " + this.name);
        System.out.println("Defense : " + this.defense);
    }
}