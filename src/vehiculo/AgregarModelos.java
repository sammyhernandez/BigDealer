package vehiculo;


import Connection.conectar;
import Utiliti.Lib;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
        comboMarca();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_veh_marca = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        btn_mostrar_todo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_modelo = new javax.swing.JTable();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("ID:");

        lbl_id.setText("...");
        lbl_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Modelo:");

        jLabel3.setText("Marca:");

        cb_veh_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_veh_marcaActionPerformed(evt);
            }
        });

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
                            .addComponent(txt_modelo)
                            .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_veh_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_veh_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_mostrar_todo.setText("Mostrar todo");
        btn_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_todoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btn_mostrar_todo)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mostrar_todo)
                    .addComponent(btn_buscar)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_guardar)
                .addGap(31, 31, 31)
                .addComponent(btn_actualizar)
                .addGap(45, 45, 45)
                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        tbl_modelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Modelo", "Marca", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_modeloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_modelo);

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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        agregarModelo();
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        txt_modelo.setText("");
        lbl_id.setText("...");
        cb_veh_marca.setSelectedIndex(0);
        cargar(txt_buscar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tbl_modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_modeloMouseClicked
        seleccionarModelo();
    }//GEN-LAST:event_tbl_modeloMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizarModelo();
       
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarModelo();
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
      dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void cb_veh_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_veh_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_veh_marcaActionPerformed

    private void btn_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_todoActionPerformed
        
        cargar("");
       
    }//GEN-LAST:event_btn_mostrar_todoActionPerformed

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        int key = (char)evt.getKeyCode();
        if(KeyEvent.VK_ENTER == key){
            cargar(txt_buscar.getText());
        }
    }//GEN-LAST:event_txt_buscarKeyPressed


    private Map mp_cb_marca;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_mostrar_todo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cb_veh_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JTable tbl_modelo;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_modelo;
    // End of variables declaration//GEN-END:variables
    
    private void cargar(String valor) {
    
            String col_name = " mo.id_veh_modelo , ma.descripcion , mo.descripcion ";
            String tbl_name = " veh_modelo mo LEFT JOIN veh_marca ma ON mo.id_veh_marca = ma.id_veh_marca ";
            String orden = " mo.id_veh_modelo ";
            //Lib.queryArray(col_name, tbl_name," cedula = '"+ valor + "'");
            tbl_modelo = Lib.limpiarTabla(tbl_modelo);
            if(valor.trim().equals("")){


                tbl_modelo.setModel(Lib.tblCargar((DefaultTableModel)tbl_modelo.getModel(),Lib.queryArray(col_name, tbl_name,orden)));
                //System.out.println("valor = "+valor);
            }else {
                //System.out.println("hola: " +valor);
                tbl_modelo.setModel(Lib.tblCargar((DefaultTableModel)tbl_modelo.getModel(),Lib.queryArrayW(col_name, tbl_name," UPPER(mo.descripcion) LIKE UPPER('"+ valor + "%') ORDER BY "+orden)));
                //tbl_cliente.setModel(Lib.tblCargar((DefaultTableModel)tbl_cliente.getModel(),"SELECT  id_cliente , nombre , apellido , cedula , sexo  FROM  cliente  WHERE cedula = '"+ valor+ "'"));

            }
    }
 
    private void comboMarca() {
    
        mp_cb_marca = Lib.mapCargar("veh_marca","descripcion");    
        cb_veh_marca = Lib.cbCargar(cb_veh_marca, mp_cb_marca);
    }  
    private void agregarModelo(){
        String mod_name = txt_modelo.getText();
        String id_marca = mp_cb_marca.get(cb_veh_marca.getSelectedItem()).toString();
        if(Lib.validaString(mod_name)){
            
            
            
            if(Lib.existeRegistro("*","veh_modelo"," id_veh_marca = "+id_marca + " AND UPPER(descripcion) = UPPER( '"+mod_name+"' )") == 0){
                int id_ins_marca = Lib.queryInsert(new String[]{"id_veh_marca" , "descripcion"}, new String[]{id_marca,mod_name},"veh_modelo");
                if (id_ins_marca == 0){
                    JOptionPane.showMessageDialog(this,"No se Inserto ningun registro","Error no se guardaron datos",JOptionPane.ERROR_MESSAGE);
                    System.err.println("No se insertaron registro");

                }else{
                    cargar("");
                    limpiar();
                }
            }else{
                JOptionPane.showMessageDialog(this,"El modelo ya se encuentra registrado","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                System.err.println("El Modelo ya existe");
            }
        }else{
            
           JOptionPane.showMessageDialog(this,"Escriba el nombre del modelo","Dato Invalido",JOptionPane.ERROR_MESSAGE);
           System.err.println("Dato invalido");
            
        }
    }
    private void actualizarModelo(){
        String mod_name = txt_modelo.getText();
        String id_marca = mp_cb_marca.get(cb_veh_marca.getSelectedItem()).toString();

            if(Lib.validaString(mod_name) && Lib.validaString(lbl_id.getText()) && lbl_id.getText() != "..."){

                if(Lib.existeRegistro("*","veh_modelo"," id_veh_marca = "+id_marca + " AND UPPER(descripcion) = UPPER( '"+mod_name+"' )") == 0){
                    
                    int ok = JOptionPane.showConfirmDialog(this, "Se actualizara el registro con el id: "+lbl_id.getText(),"Actualizar registro",JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(ok == JOptionPane.YES_OPTION){
                        int id_ins_marca = Lib.queryUpdate(new String[]{"id_veh_marca" , "descripcion"}, new String[]{id_marca,mod_name},"veh_modelo","id_veh_modelo = '"+lbl_id.getText()+" '");
                        if (id_ins_marca == 0){
                            JOptionPane.showMessageDialog(this,"No se actualizo ningun registro","Error no se guardaron datos",JOptionPane.ERROR_MESSAGE);
                            System.err.println("No se actualizo registro");

                        }else{
                            cargar("");
                            limpiar();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"El modelo ya se encuentra registrado","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                    System.err.println("El Nombre del modelo existe");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Los datos suministrado no son valido o no a selecionado ningun valor","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                System.err.println("Datos invalidos");
            }

            
    }
    private void eliminarModelo(){

            if(Lib.validaString(lbl_id.getText()) && lbl_id.getText() != "..."){
                int ok = JOptionPane.showConfirmDialog(this, "Se eliminara el registro con el id: "+lbl_id.getText(),"Eliminar registro",JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
                if(ok == JOptionPane.YES_OPTION){    
                    int id_ins_marca = Lib.queryDelete("veh_modelo","id_veh_modelo",lbl_id.getText());
                    if (id_ins_marca == 0){
                        JOptionPane.showMessageDialog(this,"No se elimino ningun registro","Error",JOptionPane.ERROR_MESSAGE);
                        System.err.println("No se elimino ningun registro");

                    }else{
                        cargar("");
                        limpiar();
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this,"Selecione un registro  a borrar","Error",JOptionPane.ERROR_MESSAGE);
                System.err.println("No se a selecionado ningun registro");
            }        
        
        
    }
    private void limpiar() {
        //Boton limpiar
        lbl_id.setText("...");
        txt_buscar.setText(null);
        cb_veh_marca.setSelectedIndex(0);
        txt_modelo.setText(null);

    }
    private void seleccionarModelo() {
    
         
        int fila =  tbl_modelo.getSelectedRow();
      
        if(fila ==-1) {
            JOptionPane.showMessageDialog(this,"Debes Seleccionar una Registro.");
        } else{    
      
       lbl_id.setText(tbl_modelo.getValueAt(fila, 0).toString());
       txt_modelo.setText(tbl_modelo.getValueAt(fila, 2).toString());
       cb_veh_marca.setSelectedItem(tbl_modelo.getValueAt(fila, 1).toString());
       
      }
       
    }
}
