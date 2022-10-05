/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TesInheritance;

import java.io.*;

/**
 *
 * @author Riyan AdPt
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        //Employee emp[] = new Employee[2];
        
        String id, nama, adress, department, title;
        
        try {
            //jumlah data ditentukan user
            System.out.print("Masukkan jumlah data : ");
            int jumlah = Integer.parseInt(inp.readLine());
            Employee emp[] = new Employee[jumlah];
            
            //input data
            for(int i = 0; i < emp.length; i++){
                System.out.print("Entry ID : ");
                id = inp.readLine();
                System.out.print("Entry nama : ");
                nama = inp.readLine();
                System.out.print("Entry alamat : ");
                adress = inp.readLine();
                System.out.print("Entry gelar : ");
                title = inp.readLine();
                
                //masukkan variabel ke dalam parameter object
                emp[i] = new Employee(id, nama, adress, null, title);
                
            }
            
            for(int i = 0; i < emp.length; i++){
                emp[i].getData();
            }
            
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
        

