package com.tutorial;

public class Player {
    private String nama;
    private static int jumlahPlayer;

    // * Overloading constructor
    Player(String nama) {
        Player.jumlahPlayer++;
        this.nama = nama;
    }

    Player() {
        this.jumlahPlayer++;
        this.nama = "AI_Player" + Player.jumlahPlayer;
    }

    void display() {
        System.out.println("Name : " + this.nama);
    }
}
