/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiliti;

import Connection.conectar;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gfernandez
 */
public class Lib {
    
    /**
     *
     * @param model
     * @param qry
     * @return DefaultTableModel
     */
    public static DefaultTableModel tblCargar(DefaultTableModel model,String qry){
         
         
         try {
             
            conectar co = new conectar();
            Connection conn = co.conexion();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(qry);
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int cant_colum = rsmd.getColumnCount();
            /*
            for(int i = 1;i < cant_colum;i++){
                model.addColumn(rsmd.getColumnLabel(i));
            }
            */    
            while(rs.next()){
                Object[] fila = new Object[cant_colum];
                for(int i = 0;i < cant_colum; i++){
                    fila[i] = rs.getObject(i+1);
                }
                model.addRow(fila);
            }
            rs.close();
            st.close();
            conn.close();
            
         }catch(SQLException esql){
            System.err.print(esql);
         }
         
         return model;
     }    
    public static DefaultTableModel tblCargar(DefaultTableModel model,ResultSet rs){
         
         
         try {
             
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            int cant_colum = rsmd.getColumnCount();
            /*
            for(int i = 1;i < cant_colum;i++){
                model.addColumn(rsmd.getColumnLabel(i));
            }
            */    
            while(rs.next()){
                Object[] fila = new Object[cant_colum];
                for(int i = 0;i < cant_colum; i++){
                    fila[i] = rs.getObject(i+1);
                }
                model.addRow(fila);
            }
            rs.close();
                        
         }catch(SQLException esql){
            System.err.print(esql);
         }
         
         return model;
     }    
    public static ResultSet queryArray(String select,String from){
     ResultSet rs = null;
        try {

            conectar co = new conectar();
            Connection conn = co.conexion();
            Statement st = conn.createStatement();
            rs = st.executeQuery("SELECT "+ select +" FROM "+ from );
            //System.out.println("SELECT "+ select +" FROM "+ from);

        } catch (SQLException ex) {
            Logger.getLogger(Lib.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rs;
    }     
    public static ResultSet queryArray(String select,String from,String where){
     ResultSet rs = null;
        try {

            conectar co = new conectar();
            Connection conn = co.conexion();
            Statement st = conn.createStatement();
            rs = st.executeQuery("SELECT "+ select +" FROM "+ from +" WHERE "+ where);

            conn.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Lib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }  
    public static ResultSet queryArray(String sql){
     ResultSet rs = null;
        try {

            conectar co = new conectar();
            Connection conn = co.conexion();
            Statement st = conn.createStatement();
            rs = st.executeQuery(sql);
            conn.close();
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Lib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public static int queryInsert(String[] col_name,String[] col_value,String tbl_name){
        int clave_generada = 0;
        try {
        
            Connection conn = new conectar().conexion();
            PreparedStatement psInsert;

            String sql = "INSERT INTO "+tbl_name+" ( ";
            String str_col_value ="";
            for(int i=0;i < col_name.length;i++){
                sql +=col_name[i]+",";
                str_col_value += "?,";
            }

            sql = sql.substring(0,sql.length()-1)+" ) values ( ";
            str_col_value = str_col_value.substring(0, str_col_value.length()-1);
            sql += str_col_value +" ) ";
            psInsert = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            for(int j=0;j < col_value.length;j++){
               psInsert.setString(j+1, col_value[j]); 
            }

            int fila = psInsert.executeUpdate();

            if (fila > 0){
                ResultSet rs = psInsert.getGeneratedKeys();

                if(rs.next()){

                    clave_generada = rs.getInt(1);

                }
                rs.close();
            }

            psInsert.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(Lib.class.getName()).log(Level.SEVERE, null, ex);
        }

    return clave_generada;
    }   
    public static boolean validaString(String[] str_valid){

        for (String str_valid1 : str_valid) {
            if (str_valid1.trim().isEmpty()) {
                return false;
            }
        }
        return true;
    }
    public static boolean validaString(String str_valid){

           return !str_valid.trim().isEmpty();
    }
    public static String strCedula(String cedula){

        cedula = cedula.replaceAll("-","");
        return cedula;
     }
    public static JComboBox cbCargar(JComboBox model,Map map){
        model.removeAll();
        map.keySet().forEach((value) -> {
            model.addItem(value);
        });
       
        return model;
    }
    public static Map mapCargar(String tbl_name){
        
        Map<String,String> map = new HashMap<>();
        try {

            ResultSet rs = queryArray("*",tbl_name);

            while(rs.next()){            
                
                map.put(rs.getString(2),rs.getString(1));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Lib.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;
    }
  
    
}
