package com.tutorial;

class Mahasiswa {
    // * Data member
    String nama;
    String jurusan;

    // * Constructor
    Mahasiswa(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // * Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Jurusan : " + this.jurusan);
    }

    // * Method tanpa return dan dengan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // * Method dengan return dan tanpa parameter
    String getNama() {
        return this.nama;
    }
    String getJurusan() {
        return this.jurusan;
    }

    // * Method dengan return dan parameter
    String getID(String nama, String jurusan) {
        this.nama = nama;
        this.jurusan = jurusan;

        return this.nama + " " + this.jurusan;
    }
}

class Dosen {
    String nama;

    Dosen(String nama) {
        this.nama = nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "Akuntansi");
        mahasiswa1.show();

        mahasiswa1.setNama("Atung");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getJurusan());

        System.out.println(mahasiswa1.getID("Otong", "Sistem informasi"));

        Dosen dosen1 = new Dosen("Udin");
        
    }
}
