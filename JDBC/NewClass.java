//for runnning new.java path->C:\Users\HP\Desktop\JAVA PROGRAMMING\JDBC\new.java
//lib :C:\Users\HP\Desktop\JAVA PROGRAMMING\JDBC\lib\mysql-connector-java-8.0.30.jar
//javac -cp ".;lib\mysql-connector-java-8.0.30.jar" new.java
import java.sql.*;
public class NewClass {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        //  READ
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
        Statement st =con.createStatement();
        ResultSet rs=st.executeQuery("select * from students");
        while(rs.next()){
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3));
        }
        //CREATE 
        String sql="INSERT INTO students (name,roll,sec) VALUES (?,?,?)";
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setString(1, "VIVEK TALAGAUTRI");
        ps.setInt(2, 14);
        ps.setString(3, "E");
        ps.executeUpdate();
        //UPDATE 
        String sql2="UPDATE Students set sec= ? where name='VIVEK TALAGAUTRI'";
        PreparedStatement ps2=con.prepareStatement(sql2);
        ps2.setString(1, "Q");
        ps2.executeUpdate();
        System.out.println("Updated successfully");
        //DELETE
        String sql3="DELETE from students where name=?";
        PreparedStatement ps3=con.prepareStatement(sql3);
        ps3.setString(1, "raju");
        ps3.executeUpdate();
        System.out.println("DELETED SUCCESFLLY");
        rs.close();
        st.close();
        ps.close();
        con.close();
    }
    
}