/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_21410100017;
import java.io.*;

public class MainClass {

    
    public static void main(String[] args) throws IOException{
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Minuman mnm = new Minuman(null,null,null,0,0);
        
        int jmlBeli;
        do {
           System.out.println("---Menu Toko Kita---");
           System.out.println("1. Entri Data Barang");
           System.out.println("2. Entri Data Penjualan");
           System.out.println("3. Keluar");
           System.out.print("Pilih menu :");
           int menu = Integer.parseInt(inp.readLine());
           switch(menu){
               case 1:
                   System.out.println("---Data Minuman---");
                   System.out.println("");
                   mnm.entriData(mnm);
                   break;
               case 2:
                   System.out.println("--Data Penjualan--");
                   mnm.entriData();
                   break;
               case 3:
                   System.exit(0);
                   break;
           }
       }while(true);
    }
    
}
