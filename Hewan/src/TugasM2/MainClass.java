/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TugasM2;

import java.io.*;
public class MainClass {

    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        Undika undika = new Undika();
        Mahasiswa mhs = new Mahasiswa();
        Karyawan kar = new Karyawan();
        try {
            
            do{
                System.out.println("--Universitas Dinamika--");
                System.out.println("1. Cek SPP Mahasiswa");
                System.out.println("2. Cek Gaji Karyawan");
                System.out.println("3. Keluar Aplikasi");
                System.out.println("Pilih menu : ");
                int pilih = Integer.parseInt(inp.readLine());
                
                switch(pilih){
                    case 1:
                        System.out.println("--Cek SPP Mahasiswa--");
                        System.out.println("NIM : ");
                        mhs.setNim(inp.readLine());
                        System.out.println("Nama : ");
                        undika.setNama(inp.readLine());
                        System.out.println("Alamat : ");
                        undika.setAlamat(inp.readLine());
                        System.out.println("Prodi : ");
                        mhs.setProdi(inp.readLine());
                        System.out.println("Angkatan : ");
                        mhs.setAngkatan(Integer.parseInt(inp.readLine()));
                        System.out.println("Semester : ");
                        mhs.setSemester(Integer.parseInt(inp.readLine()));
                        System.out.println("Biaya SPP : " + mhs.getSpp());
                        System.out.println("Total SPP yang perlu dibayar : " + mhs.getBayarSPP());
                        System.out.println("");
                        
                        break;
                    case 2:
                        System.out.println("--Cek Gaji Karyawan--");
                        System.out.println("NIK : ");
                        kar.setNik(inp.readLine());
                        System.out.println("Nama : ");
                        undika.setNama(inp.readLine());
                        System.out.println("Alamat : ");
                        undika.setAlamat(inp.readLine());
                        System.out.println("Bagian : ");
                        kar.setBagian(inp.readLine());
                        System.out.println("Kehadiran : ");
                        kar.setKehadiran(Integer.parseInt(inp.readLine()));
                        System.out.println("Gaji per hari : ");
                        kar.setGaji_per_hari(Integer.parseInt(inp.readLine()));
                        System.out.println("Gaji total yang di dapat : " + kar.getTotalGaji());
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
