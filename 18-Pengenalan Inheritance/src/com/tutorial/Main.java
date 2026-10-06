package com.tutorial;
// * Inheritance (pewarisan) pada Java adalah mekanisme di mana sebuah kelas baru dapat mewarisi atribut (variabel) dan metode (fungsi) dari kelas yang sudah ada

public class Main {
    public static void main(String[] args) throws Exception {
        Hero heroDefault = new Hero();
        heroDefault.name = "Otong";
        System.out.println("default hero : " + heroDefault.name);
        heroDefault.display();
        
        Hero hero1 = new Hero();
        hero1.name = "Bujang";
        System.out.println("Hero 1 : " + hero1.name);
        hero1.display();
        
        Hero hero2 = new Hero();
        hero2.name = "Maman";
        System.out.println("Hero 2 : " + hero2.name);
        hero2.display();
    }
}
