package JV2_Session6;

//Buoc 1: import package
import java.sql.*;

public class Main {
    public static void main(String args[]){
       try {
           // Buoc 2: dang ky driver -- nap driver vao neu chua co
           Class.forName("com.mysql.jdbc.Driver");

           //Buoc 3: Tao ket noi DB
           String URL = "jdbc:mysql://localhost:8889/t1807m";
           Connection conn = DriverManager.getConnection(URL,"t1807m","t1807m123");

           //Buoc 4: Truy van du lieu
           Statement statement = conn.createStatement();

           String insert_sql = "INSERT INTO student (name,age,mark) VALUES('Le van minh',19,2)";

           statement.executeUpdate(insert_sql);

           String sql = "SELECT * FROM student";

           ResultSet rs = statement.executeQuery(sql);

           while (rs.next()){
               System.out.println("ID: "+rs.getInt("id"));
               System.out.println("Name: "+rs.getString("name"));
               System.out.println("Age: "+rs.getInt("age"));
               System.out.println("Mark: "+rs.getInt("mark"));
               System.out.println("--------------------------------");
           }
           // END

       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
