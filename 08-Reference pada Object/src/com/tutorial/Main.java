package com.tutorial;

class Buku{
    String judul;
    String penulis;

    Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("Judul : " + this.judul + "\nPenulis : " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Cerita Kita", "Kang Dadang");
        buku1.display();

        String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
        System.out.println("Address buku1 : " + addressBuku1);

        // * Assignment object
        Buku buku2 = buku1;
        buku2.display();

        String addressBuku2 = Integer.toHexString(System.identityHashCode(buku2));
        System.out.println("Address buku2 : " + addressBuku2);

        System.out.println();
        // * Karena buku1 dan buku2 memiliki address atau reference yang sama maka -->
        buku1.judul = "Cerita Kalian";

        buku1.display();
        System.out.println("Address buku1 : " + addressBuku1);

        buku2.display();
        System.out.println("Address buku2 : " + addressBuku2);

        System.err.println();

        // * Buku3 memiliki address yang berbeda dengan buku1 dan buku2 karena buku3 object sendiri
        Buku buku3 = new Buku("Cerita Kita", "Kang Dadang");
        buku1.display();
        String addressBuku3 = Integer.toHexString(System.identityHashCode(buku3));
        System.out.println(addressBuku3);

        System.out.println();
        // * Memasukkan object ke dalam method
        fungsi(buku2);

        buku1.display();
        buku2.display();
    }

    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi : " + addressDataBuku);

        dataBuku.penulis = "Kang Dudung";
        dataBuku.display();
    }
}
