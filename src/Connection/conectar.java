

package Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class conectar {
    public static Connection con = null;
    private final String user = "gerson";
    private final String pass = "gerson123";
    private final String host = "localhost";
    private final String db_name = "BigDealer";
    private final String url = "jdbc:mysql://"+host+"/"+db_name + "?useSSL=false";
    
    /**
    * Este metodo retorna una conexion de la base de datos de tipo connection.
    * 
    * 
    * @return      La conexion de la base de datos de mysql
    */
    public Connection conexion(){
       try{
       //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url,user,pass);
           //JOptionPane.showMessageDialog(null, "Conecxion Establecida.");
           //System.out.println("Conecxion Establecida.");
           
       }catch(ClassNotFoundException | SQLException e){
        System.err.println("Se a producido un error con la connecion de la base de datos!!!!!\n"+e.getMessage());
        
       }
     return con;
    }
    
}

