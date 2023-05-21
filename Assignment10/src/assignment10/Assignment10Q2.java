
package assignment10;

/**
 *
 * @author cjd209
 */

import java.sql.*;
public class Assignment10Q2 {
    
    public static void main(String[] args){
        try{
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/FirstDatabase", "cjd209", "HoldSteady20");
            
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM MODULE10.DEPARTMENT WHERE CODE = 'SWENG'");
            while(rs.next()){
                String code = rs.getString("CODE");
                String name = rs.getString("DNAME");
                String bldg = rs.getString("BUILDING");
                
                System.out.print("Dept Code: " + code);
                System.out.print("; Dept Name: " + name);
                System.out.println("; Building: "+ bldg);
            }
            
            String sq1 = "UPDATE MODULE10.DEPARTMENT SET CODE = 'SWING', DNAME = 'Software Ingineering' WHERE CODE = 'SWENG'";
            int num = stmt.executeUpdate(sq1);
            rs = stmt.executeQuery("SELECT * FROM MODULE10.DEPARTMENT WHERE CODE = 'SWING'");
            
            while(rs.next()){
                String code = rs.getString("CODE");
                String name = rs.getString("DNAME");
                String bldg = rs.getString("BUILDING");
                
                System.out.print("Dept Code: " + code);
                System.out.print("; Dept Name: " + name);
                System.out.println("; Building: "+ bldg);
            }                       
        }
        catch(SQLException e){
            System.err.print(e);
        }
    }
}
