package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
        Hero heroDefault = new Hero();
        heroDefault.name = "Dadang";
        heroDefault.display();

        HeroWarrior hero1 = new HeroWarrior();
        hero1.name = "Shepard";
        hero1.defense = 10;
        hero1.display();
    }
}
