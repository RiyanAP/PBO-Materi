/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructor;

public class Akun {
    
    //constructor, password
    private String username, password;
    
    //constructor non parameter (admin)
    public Akun(){
        username = "admin";
        password = "admin";
    }
    
    //constructor parameter (akun baru)
    public Akun(String u, String p){
        username = u;
        password = p;
    }
    
    /*
    public Akun(String p){
        password = p;
    }
    */

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
