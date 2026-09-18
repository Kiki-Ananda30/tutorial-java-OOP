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

    void attack(Player opponent) {
        double weaponDamage = this.weapon.weaponDamage;

        System.out.println(this.name + " attacking " + opponent.name + ", weapon damage : " + this.weapon.weaponDamage);
        opponent.defense(weaponDamage);
    }

    void defense(double attackDamage) {
        // * Damage yang diterima
        double damage;

        if (this.armor.protection < attackDamage) {
            damage = attackDamage - this.armor.protection;
            System.out.println("Hit!");
        } else {
            damage = 0;
            System.out.println("Failed to penetrate the opponent's armor!");
        }

        System.out.println(this.name + " receive damage : " + damage);

        this.health -= damage;
        System.out.println("Total health : " + this.health);
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
    double protection;

    Armor(String name, double armor) {
        this.name = name;
        this.protection = armor;
    }

    void display() {
        System.out.println("Armor : " + this.name + ", total defense : " + this.protection);
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

        System.out.println("\nPertarungan!");
        player1.attack(player2);
        player2.attack(player1);
    }
}
