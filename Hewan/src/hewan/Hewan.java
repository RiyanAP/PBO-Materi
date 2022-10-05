/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;
    
    
/**
 *
 * @author Riyan AdPt
 */
public class Hewan {
    private String tipe, suara;
    private int usia;

    //setter
    public void setTipe(String t){
        tipe = t;
    }
    public void setSuara(String suara){
        this.suara = suara;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }

    //getter biasanya tdk memiliki parameter krn lgsg mengambil data dr setter
    public String getTipe(){
        return this.tipe;
    }
    public String getSuara(){
        return this.suara;
    }
    public int getUsia(){
        return this.usia;
    }
}
