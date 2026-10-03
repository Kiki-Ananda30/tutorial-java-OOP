package com.tutorial;

public class Player {
    private String name;

    Player(String name) {
        this.name = name;
    }

    void setName(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Username : " + this.name);
    }
}
