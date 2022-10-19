/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPolymorph2;

import java.io.*;

/**
 *
 * @author Riyan AdPt
 */
public class NilaiPBO extends NilaiMK{

    

    public NilaiPBO(String nim, String nama) {
        super(nim, nama);

    }

    @Override
    public int hitungNilai(int uts, int uas, int tugas) throws IOException{
        return ((uts * 25/100) + (uas * 25/100) + (tugas * 50/100));
    }

    @Override
    void getNilai() throws IOException {
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
