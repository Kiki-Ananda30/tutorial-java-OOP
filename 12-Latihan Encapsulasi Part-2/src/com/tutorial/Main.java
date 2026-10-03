package com.tutorial;

class Player {
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int level;
    private int healthIncrement;
    private int attackIncrement;
    private int totalDamage;
    private boolean isAlive;

    // * Object member
    private Armor armor;
    private Weapon weapon;

    Player(String name) {
        this.name = name;
        this.baseHealth = 20;
        this.baseAttack = 20;
        this.level = 1;
        this.healthIncrement = 5;
        this.attackIncrement = 5;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.totalHealth() - this.totalDamage;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int totalHealth() {
        return this.baseHealth + this.level * this.healthIncrement + this.armor.getTotalHealth();
    }

    public void attack(Player opponent) {
        // * Hitung damage
        int damage = getAttackPower();

        // * Print event
        System.out.println("\n" + this.name + " is attacking " + opponent.getName() + " " + damage + " damage");

        // * Attack opponent
        opponent.defense(damage);

        this.levelUp();
    }
    
    public void defense(int damage) {
        // * Receive damage
        int defensePower = this.armor.getDefensePower();
        int deltaDamage;

        System.out.println("Defense power : " + defensePower);
        if (damage > defensePower) {
            deltaDamage = damage - defensePower;
        } else {
            deltaDamage = 0;
        }
        
        // * Total damage
        System.out.println("Damage sustained : " + deltaDamage);
        this.totalDamage += deltaDamage;

        // * Check is alive
        if (this.getHealth() < 0) {
            this.isAlive = false;
            this.totalDamage = this.totalHealth();
        } 

        this.display();
    }

    private int getAttackPower() {
        return this.baseAttack + attackIncrement + this.weapon.getAttack();
    }

    private void levelUp() {
        this.level++;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void display() {
        System.out.println("\nName : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("health : " + totalHealth() + "/" + getHealth());

        if (!this.isAlive) {
            System.out.println(this.name + " is dead.");
        }
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

    public int getDefensePower() {
        return this.strength * 2;
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
        Armor armor1 = new Armor("baju besi", 5, 10);
        Weapon weapon1 = new Weapon("Pedang", 10);
        player1.setArmor(armor1);
        player1.setWeapon(weapon1);

        Player player2 = new Player("Maman");
        Armor armor2 = new Armor("baju kulit", 3, 5);
        Weapon weapon2 = new Weapon("kapak", 13);
        player2.setArmor(armor2);
        player2.setWeapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
        player2.attack(player1);
        player1.attack(player2);
    }
}
