/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestPolymorph2;

/**
 *
 * @author Riyan AdPt
 */
public class NilaiPBO extends NilaiMK{

    public NilaiPBO(String nim, String nama) {
        super(nim, nama);
    }

    @Override
    public int hitungNilai(int uts, int uas, int tugas) {
        return ((uts * 25/100) + (uas * 25/100) + (tugas * 50/100));
    }
    
    
}
