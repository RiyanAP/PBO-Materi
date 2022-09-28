/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Constructor;


import java.io.*;
public class MainClass {

    
    public static void main(String[] args) throws IOException {
       BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
       
       
       //object(instace of class)
       //kkarena ada 2 constructor, maka dibuat 2 object
       //1. admin
       //2. akun baru
       Akun admin = new Akun();
       Akun akunBaru = new Akun("","");
       
       
       //variabel
       String username,password;
       
       //menu
       do {
           System.out.println("---Login---");
           System.out.println("1. Login Admin");
           System.out.println("2. Buat Akun Baru");
           System.out.println("3. Lihat Akun");
           System.out.println("4. Ubah Password");
           System.out.println("5. Keluar");
           System.out.println("Pilih menu :");
           int menu = Integer.parseInt(inp.readLine());
           switch(menu){
               case 1:
                   System.out.println("--Login Admin--");
                   System.out.print("Masukkan username : ");
                   username = inp.readLine();
                   System.out.print("Masukkan password : ");
                   password = inp.readLine();
                   
                   //mencocokan username dan password
                   if(username.equalsIgnoreCase(admin.getUsername()) && password.equals(admin.getPassword())){
                       System.out.println("Sukses");
                   }else{
                       System.out.println("Gagal");
                   }
                   break;
               case 2:
                   System.out.println("--Buat Akun--");
                   System.out.println("--Login Admin--");
                   System.out.print("Masukkan username : ");
                   username = inp.readLine();
                   System.out.print("Masukkan password : ");
                   password = inp.readLine();
                   
                   //memasukkan variabel ke dlm constructor
                   akunBaru = new Akun(username, password);
                   System.out.println("");
                   break;
               case 3:
                   System.out.println("--Lihat Akun--");
                   System.out.println("1. Admin");
                   System.out.println("Username : " + admin.getUsername());
                   System.out.println("Password : " + admin.getPassword());
                   System.out.println("");
                   System.out.println("2. Akun baru");
                   System.out.println("Username : " + akunBaru.getUsername());
                   System.out.println("Password : " + akunBaru.getPassword() + "\n");
                   break;
               case 4:
                   System.out.println("--Ubah Password--");
                   //masukkan pass lama
                   System.out.print("Masukkan password lama: ");
                   String pass_lama = inp.readLine();
                   //masukkan pass baru
                   System.out.print("Masukkan password baru: ");
                   String pass_baru = inp.readLine();
                   //cocokan pass lama dg data yg sudah ada
                   if(pass_lama.equals(akunBaru.getPassword())){
                        akunBaru.setPassword(pass_baru);
                        System.out.println("Password berhasil diubah");
                   }else{
                        System.out.println("Password lama tidak ditemukan");
                   }
                   break;
               case 5:
                   System.exit(0);
                   break;
           }
       }while(true);
          
    }
    
}
