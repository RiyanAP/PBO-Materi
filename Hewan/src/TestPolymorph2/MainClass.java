/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestPolymorph2;
import java.io.*;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
       
        //object
        NilaiMK nmk = new NilaiMK(null,null);
        NilaiMK npbo = new NilaiPBO(null,null);
        
        //panggil method overloading getData
        nmk.getData();
        nmk.getData("Bu Ayuningtyas");
        
        //panggil method overriding
        System.out.println("Ini overriding method");
        npbo.getNilai();
        
    }
    
}
