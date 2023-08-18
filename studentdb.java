/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class studentdb {
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
        
    }
    public static  void insert_studentdata(int id,String name,String department,String course){
    try(
        Connection n=connect();
        PreparedStatement ps=n.prepareStatement("insert into Student values(?,?,?,?)");){
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, department);
        ps.setString(4, course);
        ps.execute();
    }
    catch(SQLException ex){
        System.out.println(ex.getMessage());
    }
    }
}
