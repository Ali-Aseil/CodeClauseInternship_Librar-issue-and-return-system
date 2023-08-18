/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydatabase;
import attributes.adminattri;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class admindb {
    
       public static Connection connect() throws SQLException{
       return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
       }
       public static ArrayList<adminattri> get_userdata(){
    ArrayList<adminattri> list=new ArrayList<>();
           try (
                   Connection con=connect();
                   PreparedStatement ps=con.prepareStatement("select *from Admin");
                ){
               ResultSet s=ps.executeQuery();
               while(s.next()){
               list.add(new adminattri(s.getString("Admins"),s.getString("password")));
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
           return list;
}
       public static int check_libadmindata(String user_name,String pass_word){
    int x=0;
    ArrayList<adminattri> arr=new ArrayList<>();
    arr=get_userdata();
    for(int i=0;i<arr.size();i++){
        if(arr.get(i).getAdminname().equalsIgnoreCase(user_name)){
            if(arr.get(i).getPassword().equalsIgnoreCase(pass_word)){
                x=1;
                break;
            }else{
                x=2;
                break;
            }
        }else{
            x=0;
        }
            
    }
    return x;
}
}
