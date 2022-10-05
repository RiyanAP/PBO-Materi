/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

/**
 *
 * @author Riyan AdPt
 */
public class MainClass {

    public static void main(String[] args) {
        //agar bisa mengakses class hewan, burung, ikan perlu membuat object (instance of class)
        
        Hewan burung = new Hewan();
        Hewan ikan = new Hewan();
        
        //akses method dari burung dan ikan
        Burung b = new Burung();
        Ikan i = new Ikan();
        
        //cara isi dr suara, tipe dan usia
        burung.setTipe("Kakatua");
        burung.setSuara("kuk.. kukk.. kukk..");
        burung.setUsia(1);
        
        ikan.setTipe("Lumba-lumba");
        ikan.setSuara("blup.. blup.. blup..");
        ikan.setUsia(0);
        
        //cara ambil dr setter hewan, ikan dan burung
        System.out.println("Hi, aku " + burung.getTipe() + " suaraku " + burung.getSuara() + " usiaku " + burung.getUsia() + ", ");
        b.terbang();
        System.out.println("Hi, aku " + ikan.getTipe() + " suaraku " + ikan.getSuara() + " usiaku " + ikan.getUsia() + ", ");
        i.berenang();
    }
    
}
