/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuanketiga;

/**
 *
 * @author win 10
 */
public abstract class Pasar {
   // abstract method yang harus di-override oleh subclass
    public abstract void tampilkanJenisBarang();

    // overload method tanpa parameter
    public void tampilkanInformasiPasar() {
        System.out.println("Ini adalah informasi Pasar");
    }

    // overload method dengan parameter
    public void tampilkanInformasiPasar(int luas) {
        System.out.println("Luas pasar: " + luas + " meter persegi");
    }
}
