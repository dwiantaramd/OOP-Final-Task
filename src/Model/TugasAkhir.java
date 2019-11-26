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
public class TugasAkhir {
    private List<Dosen> Pembimbing;
    private String Judul;
    
    public TugasAkhir(String Judul){
        this.Judul = Judul;
        Pembimbing = new ArrayList(2);
    }
    //Judul
    public void setJudul(String Judul){
        this.Judul = Judul;
    }
    public String getJudul(){
        return Judul;
    }
    
    public void setPembimbing(Dosen dosen, int index){
        Pembimbing.set(index,dosen);
    }
    
    public Dosen getPembimbing(int i){
        return Pembimbing.get(i);
    }
    
    public void addPembimbing(Dosen d){
        Pembimbing.add(d);
    }
}
