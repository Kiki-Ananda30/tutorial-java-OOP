package com.tutorial;

// * Keyword import untuk package external
import com.terminal.Console;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Kiki");
        Player player2 = new Player("Dadang");
        Player player3 = new Player("Bujang");

        player1.display();
        player2.display();
        player3.display();

        Console.log("Apa kabar?"); // ! Akan error karena berada di package yang berbeda, tapi kalau package-nya di import maka akan bisa jalan
        Console.log("Baik aja");
    }
}
