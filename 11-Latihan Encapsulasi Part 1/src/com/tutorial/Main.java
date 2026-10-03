package com.tutorial;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private Armor armor;
    private Weapon weapon;
    private int level;
    private int healthIncrement;
    private int attackIncrement;

    Player(String name) {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 20;
        this.level = 1;
        this.healthIncrement = 5;
        this.attackIncrement = 5;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int totalHealth() {
        return this.baseHealth + this.level * this.healthIncrement + this.armor.getTotalHealth();
    }

    public void levelUp() {
        this.level++;
        this.attackIncrement += 5;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAttackPower() {
        return this.baseAttack + attackIncrement + this.weapon.getAttack();
    }

    public void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("Max health : " + totalHealth());
        System.out.println("Attack : " + this.getAttackPower());
    }
}

class Armor {
    private String name;
    private int strength;
    private int health;

    public Armor(String name, int strength, int health) {
        this.name = name;
        this.strength = strength;
        this.health = health;
    }

    public int getTotalHealth() {
        return this.strength * 10 + this.health;
    }
}

class Weapon {
    private String name;
    private int attack;

    public Weapon(String name, int attack) {
        this.name = name;
        this.attack = attack;
    }

    public int getAttack() {
        return this.attack;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Otong");
        Armor armor1 = new Armor("baju besi", 5, 100);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Maman");
        Armor armor2 = new Armor("baju kulit", 3, 100);
        Weapon weapon2 = new Weapon("kapak", 13);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player1.levelUp();
        player1.display();

        player2.display();
        player2.levelUp();
        player2.display();
    }
}
