package onlinequiz;



import java.sql.Connection;

import java.sql.DriverManager;



public class MyConnnect {
    
        
        public static Connection getConnect(){
 
    
        Connection c = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/allquestion","root","java");
        }
        catch(Exception ex){
            System.out.println(ex);
           
        }
        return c;

    }
    
}
