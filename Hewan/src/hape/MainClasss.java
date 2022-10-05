/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hape;

import java.io.*;
public class MainClasss {

    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        Hape hp = new Hape();
        Samsung samsung = new Samsung();
        try {
            
            do{
                System.out.println("--PRO CELL--");
                System.out.println("1. Isi Data HP");
                System.out.println("2. Beli HP");
                System.out.println("3. Keluar Aplikasi");
                System.out.println("Pilih menu : ");
                int pilih = Integer.parseInt(inp.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("--ISI DATA--");
                        System.out.println("Tipe : ");
                        hp.setTipe(inp.readLine());
                        System.out.println("Warna : ");
                        hp.setWarna(inp.readLine());
                        System.out.println("Kapasitas : ");
                        hp.setKapasitas(inp.readLine());
                        System.out.println("Harga : ");
                        samsung.setHarga(Integer.parseInt(inp.readLine()));
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("--BELI HP--");
                        System.out.println("Jumlah beli : ");
                        samsung.setJumlah(Integer.parseInt(inp.readLine()));
                        System.out.println("Total bayar : " + samsung.getBeli());
                        
                        break;
                    case 3:
                        System.exit(0);
                        break;
                }
            }while(true);
 
            
        }catch(Exception e){
            System.out.println("Inputan salah/bukan angka");
        }
    }
    
}
