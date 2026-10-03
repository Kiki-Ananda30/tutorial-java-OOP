package com.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<>();

    private String name;

    Player(String name) {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void display() {
        System.out.println("Name : " + this.name);
    }

    // * Static method
    static void getShowNumberOfPlayer() {
        System.out.println("Number of player : " + Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Ucup");
        Player player2 = new Player("Otong");
        Player player3 = new Player("Maman");

        player1.display();
        player2.display();
        player3.display();

        // System.out.println("Number of player : " + Player.numberOfPlayer);
        Player.getShowNumberOfPlayer();

        // * ArrayList
        System.out.println(Player.getNames());
        // System.out.println(player1.getNames()); // ! Bisa seperti ini tapi tidak disarankan, lebih baik panggil lewat classnya bukan instance-nya
    }
}
