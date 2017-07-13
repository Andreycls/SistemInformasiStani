/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author AsemJr
 */
public class Laporan extends Data {
   public int idLaporan;
   public String namaPetugas;
   public int nomorLaporan;
   public String namaPetani;
   public int tanggalPublish;
   public String Laporan;
   public String Subjek;

    public String getLaporan() {
        return Laporan;
    }

    public void setLaporan(String Laporan) {
        this.Laporan = Laporan;
    }

    public String getSubjek() {
        return Subjek;
    }

    public void setSubjek(String Subjek) {
        this.Subjek = Subjek;
    }

    public int getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(int idLaporan) {
        this.idLaporan = idLaporan;
    }

    public String getNamaPetugas() {
        return namaPetugas;
    }

    public void setNamaPetugas(String namaPetugas) {
        this.namaPetugas = namaPetugas;
    }

    public int getNomorLaporan() {
        return nomorLaporan;
    }

    public void setNomorLaporan(int nomorLaporan) {
        this.nomorLaporan = nomorLaporan;
    }

    public String getNamaPetani() {
        return namaPetani;
    }

    public void setNamaPetani(String namaPetani) {
        this.namaPetani = namaPetani;
    }

    public int getTanggalPublish() {
        return tanggalPublish;
    }

    public void setTanggalPublish(int tanggalPublish) {
        this.tanggalPublish = tanggalPublish;
    }

    @Override
    public void tampilData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
