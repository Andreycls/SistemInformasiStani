/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import model.Petani;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author AsemJr
 */
public class tbl_AkunPetani extends AbstractTableModel {
    
private  List<Petani> daftarPetani = new ArrayList<Petani>();
    @Override
    public int getRowCount() {
        return daftarPetani.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
                }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarPetani.get(rowIndex).getNama();
            case 1:
                return daftarPetani.get(rowIndex).getAlamat();
            case 2:
                return daftarPetani.get(rowIndex).getNomorTelephone();
            case 3:
                return daftarPetani.get(rowIndex).getUsername();
            case 4:
                return daftarPetani.get(rowIndex).getPassword();                          
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
    
    public void add(Petani kontak){
    daftarPetani.add(kontak);
    fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    public void delete(int i, int baris){
    daftarPetani.remove(i);
    fireTableRowsDeleted(i, baris);
}
    
    public Petani get(int baris){
    return (Petani) daftarPetani.get(baris);
}
    
    
}
