package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    Data() {
        this.intPublic = 0;
        this.intPrivate = 0;
    }

    void display() {
        System.out.println(this.intPublic);
        System.out.println(this.intPrivate);
        System.out.println(this.doublePrivate);
    }

    // * Getter
    public int getIntPrivate() {
        return this.intPrivate;
    }

    // * Setter
    public void setDoublePrivate(double num) {
        this.doublePrivate = num;
    }
}

// * Contoh menggabungkan setter dan getter
class Lingkaran {
    private double diameter;

    Lingkaran(double diameter) {
        this.diameter = diameter;
    }

    // * setter
    public void setJariJari(double jariJari) {
        this.diameter = jariJari * 2;
    }

    // * getter
    public double getJariJari() {
        return this.diameter / 2;
    }

    // * getter Luas
    public double getLuas() {
        return 3.14*this.diameter*this.diameter/4;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Data object = new Data();

        // * Public
        object.intPublic = 10; // ? write
        System.out.println("Public : " + object.intPublic); // ? read

        // * Read only, bisa menggunakan GETTER
        int privateInt = object.getIntPrivate();
        System.out.println("Private : " + privateInt);

        // System.out.println("Private : " +object.getIntPrivate());

        // * Write only, bisa menggunakan SETTER
        object.setDoublePrivate(3.5);

        // * Display
        object.display();

        System.out.println();
        // * Gabunggkan read only dan write only dengan getter dan setter
        Lingkaran kecil = new Lingkaran(5);
        System.out.println(kecil.getJariJari());

        kecil.setJariJari(14);
        double getKecil = kecil.getJariJari();
        System.out.println(getKecil);

        double getKecilLuas = kecil.getLuas();
        System.out.println(getKecilLuas);
    }
}
