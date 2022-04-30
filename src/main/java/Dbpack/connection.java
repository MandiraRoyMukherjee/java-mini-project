package Dbpack;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {

    public static Connection getConnection(){
        Connection con = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##user1", "user1");
            System.out.println("");
        } catch(Exception e){
            System.out.println(e);
        }

//         catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        //catch (SQLException e) {
//            e.printStackTrace();
//        }

        return con;
    }

}
