package com.tutorial;

import com.terminal.Console;

class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void display() {
        Console.log("Ini " + getName());
        Console.log("Halo " + getName() + ", Apa kabar?");
    }
}
