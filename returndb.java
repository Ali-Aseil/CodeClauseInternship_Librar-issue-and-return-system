/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarydatabase;

import attributes.studentattri;
import attributes.issuedbookattri;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import library.managment.system.returnbook;
public class returndb {
     public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
    }
       public static void insert_issuedataofbook(int bookid,int studentid,String issuedate,String duedate){
         try(
             Connection con=connect();
             PreparedStatement ps=con.prepareStatement("insert into Returnedbooks values(?,?,?,?)");){
             ps.setInt(1, bookid);
             ps.setInt(2, studentid);
             ps.setString(3, issuedate);
             ps.setString(4, duedate);
             ps.execute();
         }catch(SQLException ex){
             System.out.println(ex.getMessage());
         }
     }
       public static ArrayList<issuedbookattri> get_bookissueddata(){
           ArrayList<issuedbookattri> issuedlist=new ArrayList<>();
           try(
               Connection con=connect();
                PreparedStatement ps=con.prepareStatement("select book_id,student_id,issue_date,due_date from issuebook");   )
          {
              ResultSet rs=ps.executeQuery();
              
              while(rs.next()){
             issuedlist.add(new issuedbookattri(rs.getInt("book_id"),rs.getInt("student_id"), rs.getString("issue_date"), rs.getString("due_date")));
             
                      }
               
           }catch(SQLException se){
               System.out.println(se.getMessage());
           }
           return issuedlist;
       }
       public static int checkifbookissued(int studid,int bookid){
           int x=0;
           ArrayList<issuedbookattri> arr=get_bookissueddata();
           int i=0;
           while(i<arr.size()){
               if(arr.get(i).getStudentid()!=studid && arr.get(i).getBookid()!=bookid){
                   i++;
               }
               x=1;
               break;
           }
           return x;
       }
//           for(int i=0;i<arr.size();i++){
//               if(arr.get(i).getStudentid()==studid){
//                   if(arr.get(i).getBookid()==bookid){
//                       x=1;
//                       break;
//                   }
//                   else{
//                       x=2;
//                       break;
//                   }
//               }else {
//                   x=0;
//               }
//           }
//           return x;
//       }
       public static void update_returntable(int stid,int bookid){
           try (
                Connection con = connect(); 
               PreparedStatement st = con.prepareStatement("update issuebook set returnstatus='YES' where student_id=? and book_id=?");) {
               st.setInt(1, stid);
               st.setInt(2, bookid);
           
            st.executeUpdate();
      }catch(SQLException se){
               System.out.println(se.getMessage());
      }
       }
       public static String get_issueduedate(int stuid,int bookid,String issue,String due) throws SQLException{
       try( Connection con=connect();
        PreparedStatement ps=con.prepareStatement("select issue_date and due_date from issuebook  where student_id=? and book_id=?");){
        ps.setInt(1, stuid);
        ps.setInt(2, bookid);
        ResultSet rs=ps.executeQuery();
     
        rs.getString(issue);
        rs.getString(due);
    }catch(SQLException ee){
           System.out.println(ee.getMessage());
    }
     return null;  
}
//       public static String get_issueddate(int stuid){
//           try{
//               Connection con=connect();
//               PreparedStatement ps=con.prepareStatement("select issue_date from issuebook where student_id=? ");
//               ps.setInt(1, stuid);
//               ResultSet rs=ps.executeQuery();
//            return   rs.getString("issue_date");
//       }catch(SQLException se){
//               System.out.println(se.getMessage() );
//       }
//           return null;
//    
//}
}