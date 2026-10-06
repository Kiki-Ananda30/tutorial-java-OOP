package com.tutorial;

public class Main {
    public static void main(String[] args) throws Exception {
        // * Overloading pada constructor
        Player player1 = new Player("Ucup");
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player("Otong");

        player1.display();
        player2.display();
        player3.display();
        player4.display();

        // * Overloading method
        int hasil = Matematika.tambah(5, 2);
        System.out.println(hasil);

        double hasil2 = Matematika.tambah(5, 2.5);
        System.out.println(hasil2);
    }
}
