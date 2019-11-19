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
public class Dosen extends Orang {
    private KelasTugasAkhir KelasTA;
    private String KodeDosen;
    private String NID;
    private String Email;
    private String Topik;
    
    public Dosen(String Nama, String KodeDosen, String NID, String Email, String Topik){
        super(Nama);
        this.KodeDosen = KodeDosen;
        this.NID = NID;
        this.Email = Email;
        this.Topik = Topik;
    }
    //KodeDosen
    public void setKodeDosen(String KodeDosen){
        this.KodeDosen = KodeDosen;
    }
    public String KodeDosen(){
        return KodeDosen;
    }
    //NID
    public void setNID(String NID){
        this.NID = NID;
    }
    public String getNID(){
        return NID;
    }
    //Email
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }
    //Topik
    public void setTopik(String Topik){
        this.Topik = Topik;
    }
    public String getTopik(){
        return Topik;
    }
}
