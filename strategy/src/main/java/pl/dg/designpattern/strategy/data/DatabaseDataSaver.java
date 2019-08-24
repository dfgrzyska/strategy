/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.dg.designpattern.strategy.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DatabaseDataSaver implements DataSaver {

    @Override
    public void save(String dataToSave) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/designpattern", "root", "f00pass");
            Statement stmt = con.createStatement();
            stmt.execute("insert into strategy (message) values('" + dataToSave + "')");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
