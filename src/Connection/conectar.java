

package Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class conectar {
    Connection con=null;
    
    public Connection conexion(){
       try{
       //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/BigDealer","gerson","gerson123");
           //JOptionPane.showMessageDialog(null, "Conecxion Establecida.");
           System.out.println("Conecxion Establecida.");
           
       }catch(ClassNotFoundException | SQLException e){
        System.out.println("error conexion");
        
       }
     return con;
    }
    
    public static void main(String[] args ) {
                
            conectar c = new conectar();
            c.conexion();
            
            
        }
}

