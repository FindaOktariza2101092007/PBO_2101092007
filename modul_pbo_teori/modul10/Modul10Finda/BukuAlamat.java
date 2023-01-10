/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul10Finda;

/**
 *
 * @author LENOVO
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String notlp;
    private String email;
 
    public BukuAlamat(){
        
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    public String getNotlpn(){
        return notlp;
    }
    
    public void setNotlp(String notlp){
        this.notlp=notlp;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
     public void setNilai(String nama, String alamat, String notlp, String email) {
        this.nama= nama;
        this.alamat = alamat;
        this.notlp = notlp;
        this.email=email;
    }
}
