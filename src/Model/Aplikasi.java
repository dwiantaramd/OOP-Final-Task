/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.*;
/**
 *
 * @author MSI
 */
public class Aplikasi {
    private List<Dosen> daftarDosen = new ArrayList();
    private List<Mahasiswa> daftarMahasiswa = new ArrayList();
    
    public void addMahasiswa(Mahasiswa M){
        if(getMahasiswa(M.getNIM()) != -1)
            daftarMahasiswa.add(M);
    }
    
    public int getMahasiswa(String NIM){
        int i;
        boolean found = false;
        for (i = 0; i < daftarMahasiswa.size(); i++) {
            if(daftarMahasiswa.get(i).getNIM() == NIM){
                found = true;
                break;
            }
        }
        if(found)
            return i;
        else
            return -1;
    }
    
    public void DeleteMahasiswa(String NIM){
        if(getMahasiswa(NIM) != -1)
            daftarMahasiswa.remove(getMahasiswa(NIM));  
    }
    
    public void UpdateNamaMahasiswa(String Nama_baru, String NIM){
        if(getMahasiswa(NIM) != -1)
            daftarMahasiswa.get(getMahasiswa(NIM)).setNama(Nama_baru);
    }
    
    public void UpdateNIMMahasiswa(String NIM_baru, String NIM){
        if(getMahasiswa(NIM) != -1){
            if(getMahasiswa(NIM_baru) == -1)
                daftarMahasiswa.get(getMahasiswa(NIM)).setNIM(NIM_baru);
        }
    }
    
    public void UpdateGenderMahasiswa(String Gender_baru, String NIM){
        if(getMahasiswa(NIM) != -1)
            daftarMahasiswa.get(getMahasiswa(NIM)).setGender(Gender_baru);
    }
    
    public void UpdateUsernameMahasiswa(String Username_baru, String NIM){
        if(getMahasiswa(NIM) != -1)
            daftarMahasiswa.get(getMahasiswa(NIM)).setUsername(Username_baru);
    }
    
    public void UpdatePasswordMahasiswa(String Password_baru, String NIM){
        if(getMahasiswa(NIM) != -1)
            daftarMahasiswa.get(getMahasiswa(NIM)).setPassword(Password_baru);
    }
    
    public void UpdateEmailMahasiswa(String Email_baru, String NIM){
        if(getMahasiswa(NIM) != -1){
            daftarMahasiswa.get(getMahasiswa(NIM)).setEmail(Email_baru);
        }
    }
    
    public void addDosen(Dosen D){
        if(getDosen(D.getNID()) != -1)
            daftarDosen.add(D);
    }
    
    public int getDosen(String NID){
        int j;
        boolean found = false;
        for (j = 0; j <daftarDosen.size(); j++) {
            if(daftarDosen.get(j).getNID() == NID)
                found = true;
                break;
        }
        
        if(found)
            return j;
        else
            return -1;
    }
    
    public void DeleteDosen(String NID){
        if(getDosen(NID) != -1)
            daftarDosen.remove(getDosen(NID));
    }
        
    public void UpdateNamaDosen(String Nama_baru, String NID){
        if(getDosen(NID) != -1)
            daftarDosen.get(getDosen(NID)).setNama(Nama_baru);
    }
    
    public void UpdateNIDDosen(String NID_baru, String NID){
        if(getDosen(NID) != -1){
            if(getDosen(NID_baru) == -1)
                daftarDosen.get(getDosen(NID)).setNID(NID_baru);
        }
    }
    
    public void UpdateKodeDosen(String Kode_baru, String NID){
        if(getDosen(NID) != -1){
            boolean found = false;
            int i;
            for (i = 0; i < daftarDosen.size(); i++) {
                if(daftarDosen.get(i).getKodeDosen() == Kode_baru){
                    found = true;
                    break;
                }
            }
            if(!found)
                daftarDosen.get(getDosen(NID)).setKodeDosen(Kode_baru);
        }
    }
    
    public void UpdateGenderDosen(String Gender_baru, String NID){
        if(getMahasiswa(NID) != -1)
            daftarDosen.get(getDosen(NID)).setGender(Gender_baru);
    }
    
    public void UpdateUsernameDosen(String Username_baru, String NID){
        if(getDosen(NID) != -1)
            daftarDosen.get(getDosen(NID)).setUsername(Username_baru);
    }
    
    public void UpdatePasswordDosen(String Password_baru, String NID){
        if(getMahasiswa(NID) != -1)
            daftarDosen.get(getDosen(NID)).setPassword(Password_baru);
    } 
    
    public void UpdateEmailDosen(String Email_baru, String NID){
        if(getDosen(NID) != -1)
            daftarDosen.get(getDosen(NID)).setEmail(Email_baru);
    }
    
    
}
