package librarydatabase;
import attributes.studentattri;
import attributes.bookattri;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class issuedb {
     public static Connection connect() throws SQLException{
        return DriverManager.getConnection("jdbc:sqlite:librarydb.db");
    }
     public static void insert_issuedataofbook(int bookid,int studentid,String issuedate,String duedate){
         try(
             Connection con=connect();
             PreparedStatement ps=con.prepareStatement("insert into issuebook values(?,?,?,?)");){
             ps.setInt(1, bookid);
             ps.setInt(2, studentid);
             ps.setString(3, issuedate);
             ps.setString(4, duedate);
             ps.execute();
         }catch(SQLException ex){
             System.out.println(ex.getMessage());
         }
     }
     public static ArrayList<studentattri> getstudent_id(){
         ArrayList<studentattri> list=new ArrayList<>();
         try(
                 Connection con=connect();
                 PreparedStatement ps=con.prepareStatement("select id from Student");)
         {
             ResultSet rs=ps.executeQuery();
             if(rs.next()){
                 list.add(new studentattri(rs.getInt("id")));
             }
             
         }catch(SQLException se){
             System.out.println(se.getMessage());
         }
         return list;
     }
     public static ArrayList<bookattri> getbook_id(){
         ArrayList<bookattri> booklist=new ArrayList<>();
         try(
               Connection con=connect();
                 PreparedStatement ps=con.prepareStatement("select newbookid from newbook ");){
             ResultSet rs=ps.executeQuery();
             if(rs.next()){
                 booklist.add(new bookattri(rs.getInt("newbookid")));
             }
         }
         catch(SQLException se){
             System.out.println(se.getMessage());
     }
         return booklist;
     }
     public static int check_bookstudentId(int stuid,int bookid){
         int x=0;
         ArrayList<studentattri> stu=getstudent_id();
         ArrayList<bookattri> book=getbook_id();
        int i=0;
        int k=0;
        while(i<stu.size())
        {
            if(stu.get(i).getId()!=stuid){
                i++;
            }
        }
        while(k<book.size()){
            if(book.get(k).getBookid()!=bookid){
                k++;
            }
            x=1;
            break;
        }
        return x;
         }
}

         
     

