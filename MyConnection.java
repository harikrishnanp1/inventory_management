/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorymanagement;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author student
 */
public class MyConnection {
      public static Connection getConnection()
    {
        Connection con=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/inventory_management","root","");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
    
}
