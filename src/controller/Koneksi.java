/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Asemjr
 */
public class Koneksi {
    
    private static Connection koneksi;

    public static Connection GetConnection() throws SQLException {
        if (koneksi == null) {
            new Driver();

            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pbomenujua", "root", "");
        }
        return koneksi;
    }
}
