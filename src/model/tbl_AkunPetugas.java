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

import model.Petugas;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tbl_AkunPetugas extends AbstractTableModel{

   private  List<Petugas> daftarPetugas = new ArrayList<Petugas>();
    @Override
    public int getRowCount() {
        return daftarPetugas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
                }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarPetugas.get(rowIndex).getNama();
            case 1:
                return daftarPetugas.get(rowIndex).getAlamat();
            case 2:
                return daftarPetugas.get(rowIndex).getNomorTelephone();
            case 3:
                return daftarPetugas.get(rowIndex).getUsername();
            case 4:
                return daftarPetugas.get(rowIndex).getPassword();                          
            default:
                return null;
        }
    }
 
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nama";
            case 1:
                return "Alamat";
            case 2:
                return "Nomor Telephone";
            case 3:
                return "Username";
            case 4:
                return "Password";
            default:
                return null;
        }
    }
    
    public void add(Petugas kontak){
    daftarPetugas.add(kontak);
    fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    public void delete(int i, int baris){
    daftarPetugas.remove(i);
    fireTableRowsDeleted(i, baris);
}
    
    public Petugas get(int baris){
    return (Petugas) daftarPetugas.get(baris);
}
     
}
