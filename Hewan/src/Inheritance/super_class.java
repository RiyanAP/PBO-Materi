/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Riyan AdPt
 */
public class super_class {
    
    //atribut super class
    private String nama, keterangan;
    
    //constructor

    public super_class(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }
    
    //getter

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    
    public void Cetak(){
        System.out.println(getNama() + " " + getKeterangan());
    }
    
    public void halo(){
        System.out.println("Hallo");
    }
}
