package com.tutorial;

// * Player
class Player {
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health) {
        this.name = name;
        this.health = health;
    }

    void displayPlayer() {
        System.out.println("Name : " + this.name);
        System.out.println("Health : " + this.health);
    }

    void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void equipArmor(Armor armor) {
        this.armor = armor;
    }
}

// * Weapon
class Weapon {
    String name;
    double weaponDamage;

    Weapon(String name, double weaponDamage) {
        this.name = name;
        this.weaponDamage = weaponDamage;
    }

    void display() {
        System.out.println("Weapon : " + this.name + ", damage : " + this.weaponDamage);
    }
}

// * Armor
class Armor {
    String name;
    double armor;

    Armor(String name, double armor) {
        this.name = name;
        this.armor = armor;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", total defence : " + this.armor);
    }
}

public class Main {
    public static void main(String[] args) {
        // * Membuat object player
        Player player1 = new Player("Kiki", 60);
        Player player2 = new Player("Otong", 100);

        // * Membuat object weapon
        Weapon pedang = new Weapon("Sword", 10);
        Weapon kapak = new Weapon("Axe", 13);

        // * Membuat object armor
        Armor helmet = new Armor("Bascinet",5);
        Armor chestArmor = new Armor("Cuirass", 15);

        // * Equip weapon dan armor
        player1.displayPlayer();

        player1.equipWeapon(pedang);
        player1.weapon.display();

        player1.equipArmor(helmet);
        player1.armor.display();

        System.out.println();

        player2.displayPlayer();

        player2.equipWeapon(kapak);
        player2.weapon.display();

        player2.equipArmor(chestArmor);
        player2.armor.display();
    }
}
