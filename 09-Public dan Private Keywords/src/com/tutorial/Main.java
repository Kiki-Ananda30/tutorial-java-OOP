package com.tutorial;

class Player {
    String name; // ? default, akan bisa dibaca dan ditulis dari luar class
    public int exp; // ? public, akan bisa dibaca dan ditulis dari luar class
    private int health; // ? private, akan bisa dibaca dan ditulis di dalam class saja
    
    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // * Default modifier access
    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("exp : " + this.exp);
        System.out.println("health : " + this.health); // ? Membaca, tapi di dalam class
        
        addExp(); // ? Contoh mengakses private method
        System.out.println("exp : " + this.exp);
    }

    // * Public modifier access
    public void editName(String newName) {
        this.name = newName;
    }

    // * Private modifier access
    private void addExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {       
        // * Default
        // Player player1 = new Player("Ucup");

        // System.out.println(player1.name); // ? Membaca data
        // player1.name = "Mario"; // ? Menulis data
        // System.out.println(player1.name);

        // * Public
        // Player player2 = new Player("Budiman", 20);

        // System.out.println(player2.exp); // ? Membaca data
        // player2.exp = 50; // ? Menulis data
        // System.out.println(player2.exp);

        // * Private ---> Tidak bisa diakses
        Player player3 = new Player("Maman", 80, 85);

        // System.out.println(player3.health);
        // player3.health = 95;
        // System.out.println(player3.health);

        // * Method default
        player3.display();
        
        // * Method public
        player3.editName("Momon");
        player3.display();

        // * Method private (Tidak dapat diakses)
        // player3.addExp();
        // player3.display();

        player3.display();
    }
}