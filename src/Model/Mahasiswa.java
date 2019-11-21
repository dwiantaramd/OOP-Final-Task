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
public class Mahasiswa extends Orang {
    private String NIM;
    private String Gender;
    private String Email;
    private TugasAkhir tugasAkhir;
    
    public Mahasiswa(String Nama, String NIM, String Gender, String Email){
        super(Nama);
        this.NIM = NIM;
        this.Gender = Gender;
        this.Email = Email;
        super.setUsername(NIM);
        super.setPassword(NIM);
    }
    //NIM
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public String getNIM(){
        return NIM;
    }
    //Gender
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    public String getGender(){
        return Gender;
    }
    //Email
    public void setEmail(String Email){
        this.Email = Email;
    }
    public String getEmail(){
        return Email;
    }
    //Create TugasAkhir
    public void CreateTA(String Judul){
        tugasAkhir = new TugasAkhir(Judul);
    }
    //Update TugasAkhir
    public void UpdateTA(String Judul){
        tugasAkhir.setJudul(Judul);
    }
    //Delete TugasAkhir
    public void DeleteTa(){
        tugasAkhir = null;
    }
    
}
