
import Connection.conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy
 */
public class AgregarModelos extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarModelos
     */
    public AgregarModelos() {
        initComponents();
        cargar("");
        nextID();
        comboMarca();
    }
    
    private void limpiar() {
                    //Boton limpiar
                        lblID.setText(null);
                        txtBuscar.setText(null);
                        comboMarca.setSelectedItem("Seleccionar");
                        txtModelo.setText(null);
                        
                       

                }

        void cargar(String valor) {
    
            DefaultTableModel model;
            
            String [] titulos = {"ID","Modelo","Marca"};
            String [] registros = new String[10];
            
            String sql ="";
            
            if(valor.equals("")){
            
                       sql = "SELECT id_modelo,Descripcion,marcas "
                           + " FROM modelos";
            } else{
                    
                       sql = "SELECT id_modelo,Descripcion,marcas "
                           + "  FROM modelos"
                           + " WHERE Descripcion LIKE'"+txtBuscar.getText()+"%'";
            
            }
            model = new DefaultTableModel(null,titulos);
            conectar conect = new conectar();
            Connection cn = conect.conexion();

           try {  
            Statement st = cn.createStatement();   
            ResultSet rs = st.executeQuery(sql);
            
                while(rs.next()) {
                    
                    registros[0] = rs.getString("id_modelo"); 
                    registros[1] = rs.getString("Descripcion");  
                    registros[2] = rs.getString("marcas");
                    
             
                    model.addRow(registros);
                    tabla.setModel(model);
                    
                }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al Cargar la lista de Modelos");
           ex.printStackTrace();
        }
    }
        
        
        public void buscarModelo() {
    
        String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
        
      try{  
         
        
                String sql = "SELECT id_modelo,Descripcion,marcas "
                           + "  FROM modelos"
                           + " WHERE Descripcion LIKE '"+txtBuscar.getText()+"%' or Descripcion LIKE '"+txtBuscar.getText()+"%'";
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(url, usuario, pass);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        
        if(rs.next()){
        
        lblID.setText(rs.getString("id_modelo"));
        txtModelo.setText(rs.getString("Descripcion"));
        comboMarca.setSelectedItem(rs.getString("marcas"));
        
        
        
        }else {
        
            JOptionPane.showMessageDialog(this,"El Modelo no esta Registrado");
        }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
        
    }   
        public void seleccionarModelo() {
    
         
        int fila =  tabla.getSelectedRow();
      
        if(fila ==-1) {
            JOptionPane.showMessageDialog(this,"Debes Seleccionar una Registro.");
        } else{    
      
       lblID.setText(tabla.getValueAt(fila, 0).toString());
       txtModelo.setText(tabla.getValueAt(fila, 1).toString());
       comboMarca.setSelectedItem(tabla.getValueAt(fila, 2).toString());
       
      }
       
    }
        
    public void nextID() {
    

                   try {
                       
                     conectar conect = new conectar();
                     Connection cn = conect.conexion();

                    
                    String sql =" Select MAX(id_modelo)+1 as id FROM modelos ";
                    
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    
                    if(rs.next()){
        
                    lblID.setText(rs.getString("id"));
        
        
                    }else {
        
                           JOptionPane.showMessageDialog(this,"El modelo no esta Registrado");
                    }
                    
                } catch(Exception ex) {
                      ex.printStackTrace();
                }
            }
    
    public void comboMarca() {
        
      String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
       
        
      try{  
         
          
        
                            String sql = "Select marcas "
                                    + "     FROM list_marca";


                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    conn = DriverManager.getConnection(url, usuario, pass);
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                

                    while(rs.next()){

                   comboMarca.addItem(rs.getString("marcas"));
                   
                   

                     System.out.println(rs.getString("marcas"));


                    }   
                
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
      
    }   
    
    public void AgregarModelo() {
    
        String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;

        String id = lblID.getText();
        System.out.print(id);
        String modelo = txtModelo.getText();
        String marca = comboMarca.getSelectedItem().toString();
       
  // hacemos una conexion a la base de datos y creamos un objeto de esa conexion para Insertar los datos en la base de datos.`  
                        try{
                              Class.forName("com.mysql.jdbc.Driver").newInstance();
                              conn = DriverManager.getConnection(url, usuario, pass);
                              Statement st = conn.createStatement();

                              int mostrar = JOptionPane.showConfirmDialog(null,"Desea Guardar este Usuario?");


                              if(mostrar == JOptionPane.YES_NO_OPTION) {

                             st.executeUpdate("INSERT INTO modelos (Descripcion, marcas) VALUES('"+modelo+"','"+marca+"')");
                             
                             
                              st.close();
                              JOptionPane.showMessageDialog(null, "Modelo Registrado!");

                              System.out.print(st);
                              } 
                          }catch(Exception e){
                              e.printStackTrace();
                              JOptionPane.showMessageDialog(null,e.toString());
                          }

    }
    
    public void actualizarModelo(){
    
        String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
        
      try{  
          
        String id = lblID.getText();
        String modelo = txtModelo.getText();
        String marca = comboMarca.getSelectedItem().toString();
        
        
        String sql = "UPDATE modelos SET Descripcion = '"+modelo+"',marcas = '"+marca+"' "
                + "    WHERE id_modelo = '"+id+"'";
        
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(url, usuario, pass);
        Statement st = conn.createStatement();
        
        int mensaje = JOptionPane.showConfirmDialog(this, "Desea Guardar los cambios Actualizados?");
        
            if(mensaje == JOptionPane.YES_NO_OPTION) {
                st.executeUpdate(sql);
                 st.close();
                JOptionPane.showMessageDialog(null,"Registro actualizado");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
    }
      
      public void eliminarModelo(){
    
        String usuario = "root";
        String pass = "";
        String url = "jdbc:mysql://localhost/BigDealer";
        Connection conn = null;
        
      try{  
        String id = lblID.getText();
        String nombre = txtModelo.getText();
        String marca = comboMarca.getSelectedItem().toString();
        
        
        String sql  = "DELETE FROM modelos WHERE id_modelo = '"+id+"'";
      
        
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        conn = DriverManager.getConnection(url, usuario, pass);
        Statement st = conn.createStatement();
        
         int mensaje = JOptionPane.showConfirmDialog(this, "Desea Eliminar este Modelo?");
        
            if(mensaje == JOptionPane.YES_NO_OPTION){
              
              st.executeUpdate(sql);
              
              st.close();
              JOptionPane.showMessageDialog(null,"Modelo Eliminado");
            } 
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btnMostrarTodo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID:");

        lblID.setText("...");
        lblID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Modelo:");

        jLabel3.setText("Marca:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtModelo)
                            .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnMostrarTodo.setText("Mostrar todo");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnMostrarTodo)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarTodo)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnGuardar)
                .addGap(31, 31, 31)
                .addComponent(btnActualizar)
                .addGap(45, 45, 45)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        AgregarModelo();
        limpiar();
        cargar("");
        nextID();
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarModelo();
        cargar(txtModelo.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        seleccionarModelo();
    }//GEN-LAST:event_tablaMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarModelo();
        limpiar();
        nextID();
        cargar("");
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarModelo();
        limpiar();
        nextID();
        cargar("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrarTodo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox comboMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
