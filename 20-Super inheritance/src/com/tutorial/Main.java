package com.tutorial;

class Main {
    public static void main(String[] args) throws Exception {
        Hero hero = new Hero();
        HeroWarrior hero1 = new HeroWarrior();
        
        hero.display();
        hero1.display();
        hero1.displaySuperClass();

    }
}
