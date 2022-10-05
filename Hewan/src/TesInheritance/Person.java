/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesInheritance;

/**
 *
 * @author Riyan AdPt
 */
public class Person {
    
    private String id, nama, adress;
    
    public Person(String id, String nama, String adress){
        this.id = id;
        this.nama = nama;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAdress() {
        return adress;
    }
    
}
