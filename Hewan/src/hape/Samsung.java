/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hape;

/**
 *
 * @author Riyan AdPt
 */
public class Samsung {
    private int harga;
    private int jumlah;
    private int total;
    
    //setter

    public void setHarga(int h) {
        harga = h;
    }

    public void setJumlah(int j) {
        jumlah = j;
    }

    
    //getter
    public int getHarga() {
        return this.harga;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    
    //method
    public int getBeli(){
        total = getJumlah() * getHarga();
        return total;
    }
    
}
