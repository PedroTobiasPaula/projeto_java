
package gestao_ti2.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoMysql{

    public Connection conectaBD(){
        Connection conn = null;    
        try{
            String url = "jdbc:mysql://localhost:3306/gestao_ti?user=root&password=pedro1007";
            conn = DriverManager.getConnection(url);
        
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, erro.getMessage());
        
        }
        return conn;
    } 
}
