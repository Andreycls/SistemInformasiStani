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
public enum jenisKelamin {
    lelaki,perempuan;

    @Override
    public String toString() {
        switch(this){
                case lelaki : return "Laki-Laki";
                case perempuan : return "Perempuan";
                default :return "Data Tidak Ada";
            
    }
    
    
}
}
