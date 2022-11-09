/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_21410100017;


import java.io.*;

public class Barang {
    String kdBrg, nmBrg;
    int harga, stok;
    
    public Barang() {
    }

    public Barang(String kdBrg, String nmBrg, int harga, int stok) {
        this.kdBrg = kdBrg;
        this.nmBrg = nmBrg;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKdBrg() {
        return kdBrg;
    }

    public String getNmBrg() {
        return nmBrg;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public int stokUpdate() throws IOException{
        return 0;
    }
    
    
    void entriData(Barang p) throws IOException {

    }
    
    void entriData() throws IOException {

    }
   
}
