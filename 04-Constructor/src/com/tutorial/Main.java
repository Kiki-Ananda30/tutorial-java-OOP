package com.tutorial;

// * Class tanpa constructor/class polos
class Polos {
    String dataString;
    int dataInteger;
}

// * Class dengan constructor ---> Constructor di Java adalah method khusus yang dipanggil secara otomatis saat sebuah objek dari kelas dibuat (diinstansiasi).
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    // Mahasiswa() {
    //     System.out.println("Ini adalah constructor dari class Mahasiswa");
    // }

    // * Constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}


public class Main {
    public static void main(String[] args)throws Exception {
        // Polos objectPolos = new Polos();
        // objectPolos.dataString = "Ini adalah string";
        // objectPolos.dataInteger = 7;

        // System.out.println(objectPolos.dataString);
        // System.out.println(objectPolos.dataInteger);

        Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "3459085", "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Otong", "3459086", "Sistem informasi");

        // new Mahasiswa();
    }
}