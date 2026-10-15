package com.tutorial;

// * this.name akan mengakses atribut name kalau ada di class ini, jika tidak ada maka akan mengakses atribut dari superclass
// * super.name akan selalu mengakses atribut superclass
public class HeroWarrior extends Hero {
    String name = "Class : Warrior";

    void display() {
        System.out.println("Ini adalah " + this.name);
        dummyMethod();
    }

    void displaySuperClass() {
        System.out.println("Ini adalah " + super.name);
        super.dummyMethod();
    }

    void dummyMethod() {
        System.out.println("Method ini ada di subclass");
    }
}
