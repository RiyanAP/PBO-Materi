/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;
import java.io.*;
/**
 *
 * @author Riyan AdPt
 */
public class MainClass {
    
    public static void main(String[] args) {
         BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        //object sub class
        sub_class sub = new sub_class("","",0);
        
        try {
            //input data
            System.out.print("Isi nama : ");
            String n = inp.readLine();
            System.out.print("Isi keterangan : ");
            String k = inp.readLine();
            System.out.print("Isi tinggi : ");
            int t = Integer.parseInt(inp.readLine());
            
            //masukkan variabel ke dalam parameter object
            sub = new sub_class(n, k, t);
            
            //cetak data lengkap
            sub.dataLengkap();
            
            //panggil cetak dan halo
            sub.Cetak();
            sub.halo();
        }catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
