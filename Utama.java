/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_pertemuanketiga;

/**
 *
 * @author win 10
 */
public class Utama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasar PasarTradisional = new PasarTradisional();
        Pasar PasarModern = new PasarModern();
        
        //print informasi pasar tradisional(Override)
        PasarTradisional.tampilkanJenisBarang();
        PasarModern.tampilkanJenisBarang();
        
        //print informasi pasar (Overload)
        System.out.println("");
        System.out.println("informasi Pasar Tradisional :");
        PasarTradisional.tampilkanInformasiPasar();
        PasarTradisional.tampilkanInformasiPasar(5000);
        
        //print informasi pasar (Overload)
        System.out.println("");
        System.out.println("informasi Pasar Modern :");
        PasarModern.tampilkanInformasiPasar();
        PasarModern.tampilkanInformasiPasar(22000);
    }
    
}

