/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_21410100017;
import java.io.*;

public class Minuman extends Barang{
    String jenis;
    int jmlBeli, total, subTotal, diskon;

    public Minuman() {
    }
    
    public Minuman(String jenis, String kdBrg, String nmBrg, int harga, int stok) {
        super(kdBrg, nmBrg, harga, stok);
        this.jenis = jenis;    
    }

    public Minuman(String jenis, int jmlBeli, int total) {
        this.jenis = jenis;
        this.jmlBeli = jmlBeli;
        this.total = total;
    }


    public String getJenis() {
        return jenis;
    }

    public int getJmlBeli() {
        return jmlBeli;
    }

    public int stokUpdate() throws IOException {
        int x = getStok();
        if (x>0){
            x = stok - jmlBeli;
        }else{
            System.out.println("Barang tidak tersedia");
        }
        return x;
    }
    
    public int subTotal(){
        return this.subTotal = getJmlBeli() * getHarga();
    }
    
    public int getDiskon() throws IOException{
        int d = 0;
        if(subTotal() > 200000){
            diskon = 10/100;
            d = 10/100 * subTotal();
        }
        else{
            d = 0;
        }
        return d;
    }    
    
    public int total()throws IOException{
        return this.total = subTotal() - getDiskon();
    }

    @Override
    void entriData(Barang p) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Kode barang : ");
        kdBrg = inp.readLine();
        System.out.print("Nama barang : ");
        nmBrg = inp.readLine();
        System.out.print("Jenis Barang : ");
        jenis = inp.readLine();
        System.out.print("Harga : ");
        harga = Integer.parseInt(inp.readLine());
        System.out.print("Stok saat ini : ");
        stok = Integer.parseInt(inp.readLine());
    }
    
    void entriData() throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Kode barang : ");
        kdBrg = inp.readLine();
        if(kdBrg.equalsIgnoreCase(super.kdBrg)){
            System.out.println("Nama barang : " + getNmBrg());
            System.out.println("Jenis Barang : " + getJenis());
            System.out.println("Harga : " + getHarga());
            System.out.println("Stok saat ini : " + getStok());
            System.out.print("Jumlah yang ingin dibeli : ");
            jmlBeli = Integer.parseInt(inp.readLine());
            System.out.println("Stok tersisa : " + stokUpdate());
            System.out.print("Ingin cetak struk? Ya/tidak :");
            String cetak = inp.readLine();
            if(cetak.equalsIgnoreCase("ya")){
                cetak();
            }else if (cetak.equalsIgnoreCase("tidak")){
                System.out.println("Terimakasih telah berbelanja");
            }
        }else{
            System.out.println("Kode barang salah");
        }
    }
    
    void cetak() throws IOException{
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-------------------------");
        System.out.println("        TOKO KITA        ");
        System.out.println("Kasir = Admin");
        System.out.println("-------------------------");
        System.out.println(getNmBrg());
        System.out.println(getJmlBeli() + "x" + getHarga() + " = " + subTotal());
        System.out.println("-------------------------");
        System.out.println("Subtotal = " + subTotal());
        System.out.println("Diskon = " + getDiskon());
        System.out.println("Total = " + total());
        System.out.println("-------------------------");
        System.out.println("Maaf barang yang dibeli tidak bisa dikembalikan");
        System.out.println("Terimakasih telah berbelanja");
    }
    }
        
    
   