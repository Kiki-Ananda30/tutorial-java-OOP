package com.tutorial;

// * Membuat class sebagai template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double ipk;
    int umur;
}

public class Main {
    public static void main(String[] args) {
        // * Instansiasi/membuat object 
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Ucup";
        mahasiswa1.NIM = "35412578";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.ipk = 3.00;
        mahasiswa1.umur = 21;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);

        System.out.println();

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Otong";
        mahasiswa2.NIM = "35413290";
        mahasiswa2.jurusan = "Teknik pengendali air";
        mahasiswa2.ipk = 4.00;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);
    }
}
