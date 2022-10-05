/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesInheritance;

/**
 *
 * @author Riyan AdPt
 */
public class Employee extends Person{
    private String department, title;

    public Employee(String id, String nama, String adress, String department, String title) {
        super(id, nama, adress);
        this.department = "IT";
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }
    
    public void getData(){
        System.out.println("Id : " + super.getId() + " dengan nama " + super.getNama() + " tinggal di " + super.getAdress() + " bekerja di " + getDepartment() + " dan bergelar " + getTitle());
    }

    
    
}
