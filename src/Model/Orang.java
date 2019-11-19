/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSI
 */
public abstract class Orang {
    private String Nama;
    private String Username;
    private String Password;
    
    public Orang(String Nama){
        this.Nama = Nama;
    }
    //Nama
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public String getNama(){
        return Nama;
    }
    //Username
    public void setUsername(String Username){
        this.Username = Username;
    }
    
    public String getUsername(){
        return Username;
    }
    //Password
    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public String getPassword(){
        return Password;
    }
}
