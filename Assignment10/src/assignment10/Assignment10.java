
package assignment10;

/**
 *
 * @author cjd209
 */

import java.sql.*;

public class Assignment10 {
/*
    public static void main(String[] args) {
        
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/FirstDatabase", "cjd209", "HoldSteady20");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT FAC_ID, FNAME, SALARY FROM MODULE10.FACULTY WHERE SALARY > 80000");
            
            while(rs.next()){
                String id = rs.getString("FAC_ID");
                String name = rs.getString("FNAME");
                int salary = rs.getInt("SALARY");
               
                System.out.printf("Faculty ID: %-5s", id);
                System.out.printf("; Name: %17s", name);
                System.out.printf("; Salary: %6d\n", salary);
            }
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
 */   
}