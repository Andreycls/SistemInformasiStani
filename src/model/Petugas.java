/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;
import views.aplikasiStatistikTaniPetugas;
/**
 *
 * @author AsemJr
 */
public class Petugas implements user{
    public aplikasiStatistikTaniPetugas ASTPetugas;
    private akun akunPetugas;
    private String nama;
    private String alamat;
    private int nomorTelephone;
    
     public String username;
    public String password;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getNomorTelephone() {
        return nomorTelephone;
    }

    public void setNomorTelephone(int nomorTelephone) {
        this.nomorTelephone = nomorTelephone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
   

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateAkun() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
