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

import model.hasilTani;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tbl_PetaniHasilTani extends AbstractTableModel {

    
private  List<hasilTani> daftarHT = new ArrayList<hasilTani>();
private  List<hasilTani> daftarDHT = new ArrayList<hasilTani>();
@Override    
public int getRowCount() {
        return daftarHT.size();
    }
public int getRowCount1() {
        return daftarDHT.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
                }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarHT.get(rowIndex).getKecamatan();
            case 1:
                return daftarHT.get(rowIndex).getJenisTani();
            case 2:
                return daftarHT.get(rowIndex).getBulan();
            case 3:
                return daftarHT.get(rowIndex).getJumlah();
                                     
            default:
                return null;
        }
    }
 
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kecamatan";
            case 1:
                return "Jenis Hasil Tani";
            case 2:
                return "Bulan";
            case 3:
                return "Jumlah";
            
            default:
                return null;
        }
    }
    
    public void add(hasilTani kontak){
    daftarHT.add(kontak);
    fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    public void delete(int i, int baris){
    daftarHT.remove(i);
    fireTableRowsDeleted(i, baris);
}
    
    public hasilTani get(int baris){
    return (hasilTani) daftarHT.get(baris);
}
    
}
