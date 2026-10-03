package com.tutorial;

import com.terminal.Console;
// * Import static
import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Bujang");
        
        player1.display();

        Console.log("\nhalo " + player1.getName() + ", Apa kabar kamu?");

        log(player1.getName());
    }
}
