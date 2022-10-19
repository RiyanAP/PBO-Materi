/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPolymorph2;
import java.io.*;

public class NilaiMK {
    private String nim, nama;

    public NilaiMK(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }
    
    //fungsi berparameter
    public int hitungNilai(int uts, int uas, int tugas) throws IOException{
        return ((uts * 30/100) + (uas * 30/100) + (tugas * 40/100));
    }
    
    //overloading method
    //inputan user
    void getData() throws IOException{
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        //input
        System.out.print("NIM : ");
        nim = inp.readLine();
        System.out.print("Nama : ");
        nama = inp.readLine();
        System.out.println("Ini adalah method getData tanpa parameter : " + nim + ", " + nama);
    }
    
    void getData(String namaDosen){
        System.out.println("NIM mahasiswa : " + nim);
        System.out.println("Nama mahasiswa : " + nama);
        System.out.println("Nama dosen wali : " + namaDosen);
        System.out.println("Ini adalah method getData dengan parameter : " + nim + ", " + nama + ", " + namaDosen);
    }
    
    void getNilai() throws IOException{
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nilai UTS : ");
        int uts = Integer.parseInt(inp.readLine());
        System.out.print("Nilai UAS : ");
        int uas = Integer.parseInt(inp.readLine());
        System.out.print("Nilai tugas : ");
        int tugas = Integer.parseInt(inp.readLine());
        System.out.println("Nilai PBO-nya : " + hitungNilai(uts,uas,tugas));
    }
    
}
