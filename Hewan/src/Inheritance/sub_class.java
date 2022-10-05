/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Riyan AdPt
 */
public class sub_class extends super_class {

    //atribut sub class
    private int tinggi;
    
    public sub_class(String nama, String keterangan, int tinggi) {
        super(nama, keterangan);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }
    
    //custom method
    public void dataLengkap(){
        System.out.println(super.getNama() + " " + super.getKeterangan() + " " + getTinggi());
    }
    
    @Override
    public void Cetak() {
        super.Cetak(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    

    @Override
    public void halo() {
        super.halo(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
