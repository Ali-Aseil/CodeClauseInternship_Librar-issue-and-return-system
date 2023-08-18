/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydatabase;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bookdb {
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
    }
    public static void insert_bookdata(int id,String name,String publisher,String year){
        try{
            Connection con=connect();
            PreparedStatement ps=con.prepareStatement("insert into newbook values(?,?,?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, publisher);
            ps.setString(4,year );
            ps.execute();
        }catch(SQLException se){
            System.out.println(se.getMessage());
        }
    }
}
