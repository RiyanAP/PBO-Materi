/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hape;

/**
 *
 * @author Riyan AdPt
 */
public class Hape {
    private String tipe;
    private String warna;
    private String kapasitas;

    //setter
    public void setTipe(String t) {
        tipe = t;
    }

    public void setWarna(String w) {
        warna = w;
    }

    public void setKapasitas(String k) {
        kapasitas = k;
    }

    //getter
    public String getTipe() {
        return this.tipe;
    }

    public String getWarna() {
        return this.warna;
    }

    public String getKapasitas() {
        return this.kapasitas;
    }
    
}
