package com.tutorial;

class Display {
    static String type = "display";
    private String name;

    Display(String name) {
        this.name = name;
    }

    void setType(String type) {
        Display.type = type; // ! className = name; Cara ini direkomendasikan, bukan, this.name = name;
    }

    void show() {
        System.out.println("Menampilkan nama : " + this.name);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Display userName1 = new Display("Kiki");
        Display userName2 = new Display("Ananda");

        userName1.show();
        userName2.show();

        // * Static variable atau class variable
        System.out.println("\nMenampilkan static variable atau class variable");
        System.out.println(userName1.type);
        System.out.println(userName2.type);
        System.out.println(Display.type);
        
        // * Mengganti variable staticnya
        Display.type = "Menampilkan";
        System.out.println("\n" + userName1.type);
        System.out.println(userName2.type);
        System.out.println(Display.type);
        
        System.out.println();
        
        userName1.setType("Tampilkan");
        System.out.println(userName1.type);
        System.out.println(userName2.type);
        System.out.println(Display.type);
    }
}
