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
public class KelasTugasAkhir {
    private List<Dosen> timDosen;
    private List<Mahasiswa> DaftarMahasiswa;
    private List<Dosen> ketuaDosen;
    private String Name, topik;
    
    //constructor kelas tugas akhir dengan memasukkan object ketua dosen
    public KelasTugasAkhir(String topik){
        this.topik = topik;
    }
    
    //memasukkan objek mahasiswa ke dalam kelas TA
    public void addMahasiswa(Mahasiswa m){
        DaftarMahasiswa.add(m);
    }
    
    //memasukkan objek dosen ke dalam kelas TA
    public void addDosen(Dosen d){
        timDosen.add(d);
    }
    
    //menghapus mahasiswa dengan NIM tertentu dari kelas TA
    public void removeMahasiswa(String NIM){
        for (int i=0;i<DaftarMahasiswa.size();i++){
            if(DaftarMahasiswa.get(i).getNIM() == NIM){
                DaftarMahasiswa.remove(i);
            }
        }
    }
    
    //menghapus dosen dengan NID tertentu dari kelas TA
    public void removeDosen(String NID){
        for (int i=0;i<DaftarMahasiswa.size();i++){
            if(timDosen.get(i).getNID() == NID){
                timDosen.remove(i);
            }
        }
    }
    
    
    public String getTopik(){
        return this.topik;
    }
    
}
