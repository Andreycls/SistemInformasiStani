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

import model.Laporan;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class tbl_Laporan extends AbstractTableModel{
private  List<Laporan> daftarLaporan = new ArrayList<Laporan>();
    @Override
    public int getRowCount() {
        return daftarLaporan.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
                }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return daftarLaporan.get(rowIndex).getNamaPetugas();
            case 1:
                return daftarLaporan.get(rowIndex).getTanggalPublish();
            case 2:
                return daftarLaporan.get(rowIndex).getSubjek();
            case 3:
                return daftarLaporan.get(rowIndex).getLaporan();
                                     
            default:
                return null;
        }
    }
 
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nama pengirim";
            case 1:
                return "Tanggal";
            case 2:
                return "Subjek";
            case 3:
                return "Laporan";
            
            default:
                return null;
        }
    }
    
    public void add(Laporan kontak){
    daftarLaporan.add(kontak);
    fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    public void delete(int i, int baris){
    daftarLaporan.remove(i);
    fireTableRowsDeleted(i, baris);
}
    
    public Laporan get(int baris){
    return (Laporan) daftarLaporan.get(baris);
}
    
    
}
