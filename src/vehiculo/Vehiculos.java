package vehiculo;


import Connection.conectar;
import Utiliti.Lib;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
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
public class Vehiculos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vehiculos
     */
    public Vehiculos() {
        initComponents();
        //comboMarca();
        //comboModelo();
        
    }
    
   

    public void comboMarca() {

   
        
      try{  
         
          
        
                            String sql = "Select * "
                                    + "     FROM list_marca";


                    conectar conect = new conectar();
                    Connection conn = conect.conexion();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);

                

                    while(rs.next()){
                        
                        int id = rs.getInt("id_marca");
                        

                   comboMarca.addItem(rs.getString("marcas"));
                   
                   

                    System.out.println(rs.getInt("id_marca"));


                    }   
                
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.toString());
                e.printStackTrace();

            }
      
    }   
    
    
    
     public void comboModelo() {

        comboModelo.removeAllItems();
        

      try{  
          
         
         

                    String sql = "SELECT list_marca.id_marca, modelos.Descripcion, modelos.id_marca \n" +
                                 "  FROM list_marca, modelos\n" +
                                 " WHERE list_marca.id_marca = modelos.id_marca";

                    String sql2 = "Select * "
                                + "FROM list_marca";            

                    
                    
                    conectar conect = new conectar();
                    Connection conn = conect.conexion();
                    Statement st = conn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                   
                     

                  
                

                    while(rs.next()){

                       
                   comboModelo.addItem(rs.getString("Descripcion"));
                   
                   
                   
                        //System.out.print(rs.getString("Descripcion"));


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
        jPanel3 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        btn_mostrar_todo = new javax.swing.JButton();
        cb_filtro = new javax.swing.JComboBox<>();
        txt_buscar = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        cb_modelo = new javax.swing.JComboBox();
        cb_transmision = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_color = new javax.swing.JComboBox();
        cb_combustible = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cb_carroceria = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        sp_year = new com.toedter.calendar.JYearChooser();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_limpiar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblFecha1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_veh_dato = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_veh_dato1 = new javax.swing.JTable();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar dato vehiculo"));

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_mostrar_todo.setText("Mostrar todo");
        btn_mostrar_todo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrar_todoActionPerformed(evt);
            }
        });

        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btn_mostrar_todo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_buscar)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(btn_mostrar_todo)
                    .addComponent(cb_filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del vehiculo"));

        jLabel13.setText("ID:");

        lbl_id.setText("...");
        lbl_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setText("Marca:");

        cb_marca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_marcaItemStateChanged(evt);
            }
        });
        cb_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_marcaActionPerformed(evt);
            }
        });

        jLabel15.setText("Modelo:");

        cb_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_modeloActionPerformed(evt);
            }
        });

        cb_transmision.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_transmisionItemStateChanged(evt);
            }
        });
        cb_transmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_transmisionActionPerformed(evt);
            }
        });

        jLabel16.setText("Transmision:");

        jLabel17.setText("Color:");

        cb_color.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_colorItemStateChanged(evt);
            }
        });
        cb_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_colorActionPerformed(evt);
            }
        });

        cb_combustible.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_combustibleItemStateChanged(evt);
            }
        });
        cb_combustible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_combustibleActionPerformed(evt);
            }
        });

        jLabel18.setText("Combustible:");

        jLabel19.setText("Carroceria:");

        cb_carroceria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_carroceriaItemStateChanged(evt);
            }
        });
        cb_carroceria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_carroceriaActionPerformed(evt);
            }
        });

        jLabel20.setText("Year:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel19)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_carroceria, 0, 158, Short.MAX_VALUE)
                                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel20))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(cb_transmision, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sp_year, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cb_modelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_combustible, 0, 158, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(164, 164, 164)))
                .addGap(205, 205, 205))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(cb_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cb_carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cb_transmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cb_combustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(sp_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel4))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Accion"));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clear-icon.png"))); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update-icon.png"))); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash-icon.png"))); // NOI18N
        btn_eliminar.setText("Eiminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Log-Out-icon.png"))); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Save-icon.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_guardar)
                .addGap(47, 47, 47)
                .addComponent(btn_limpiar)
                .addGap(50, 50, 50)
                .addComponent(btn_actualizar)
                .addGap(57, 57, 57)
                .addComponent(btn_eliminar)
                .addGap(54, 54, 54)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(btn_guardar)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir))
                        .addGap(12, 12, 12))))
        );

        jPanel6.setBackground(new java.awt.Color(255, 102, 51));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel21.setText("ENTRADA VEHICULOS");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Fecha:");

        lblFecha1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFecha1.setText("00/00/0000");
        lblFecha1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblFecha1))
                .addGap(20, 20, 20))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_veh_dato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Color", "Carroceria", "Transmision", "Combustible", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_veh_dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veh_datoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_veh_dato);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricula: ");

        jLabel2.setText("Estado:");

        jLabel3.setText("Kilometraje:");

        jCheckBox1.setText("Disponible");

        jLabel5.setText("Precio Compra:");

        jLabel6.setText("Porciento Venta:");

        jLabel7.setText("Precio Venta:");

        jLabel8.setText("Provedor:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jComboBox1, 0, 165, Short.MAX_VALUE))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_veh_dato1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Color", "Carroceria", "Transmision", "Combustible", "Year"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_veh_dato1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veh_dato1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_veh_dato1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        cargar(txt_buscar.getText());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_mostrar_todoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrar_todoActionPerformed
        cargar("");
        limpiar();

    }//GEN-LAST:event_btn_mostrar_todoActionPerformed

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void cb_marcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_marcaItemStateChanged
        //if(cb_marca.get){
            //con = con +1;
            //System.out.println("EStado "+con);
            //}
    }//GEN-LAST:event_cb_marcaItemStateChanged

    private void cb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_marcaActionPerformed

        cb_modelo = Lib.cbCargar(cb_modelo, Lib.queryArray("descripcion"," veh_modelo "," id_veh_marca = "
            + mp_cb_marca.get(cb_marca.getSelectedItem()) ," descripcion "));

    }//GEN-LAST:event_cb_marcaActionPerformed

    private void cb_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_modeloActionPerformed
        //comboModelo();
    }//GEN-LAST:event_cb_modeloActionPerformed

    private void cb_transmisionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_transmisionItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_transmisionItemStateChanged

    private void cb_transmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_transmisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_transmisionActionPerformed

    private void cb_colorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_colorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_colorItemStateChanged

    private void cb_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_colorActionPerformed

    private void cb_combustibleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_combustibleItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_combustibleItemStateChanged

    private void cb_combustibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_combustibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_combustibleActionPerformed

    private void cb_carroceriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_carroceriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_carroceriaItemStateChanged

    private void cb_carroceriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_carroceriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_carroceriaActionPerformed

    private void tbl_veh_datoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veh_datoMouseClicked
        selecionarDato();
    }//GEN-LAST:event_tbl_veh_datoMouseClicked

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed

        actualizarVehiculo();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        eliminarVehiculo();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        //int mensaje = JOptionPane.showConfirmDialog(this, "Salir?");

        //if(mensaje == JOptionPane.YES_NO_OPTION) {
            dispose();
            //}
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        agregarVehiculo();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tbl_veh_dato1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veh_dato1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_veh_dato1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscar4;
    private javax.swing.JButton btn_buscar5;
    private javax.swing.JButton btn_buscar6;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_mostrar_todo;
    private javax.swing.JButton btn_mostrar_todo4;
    private javax.swing.JButton btn_mostrar_todo5;
    private javax.swing.JButton btn_mostrar_todo6;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox cb_carroceria;
    private javax.swing.JComboBox cb_color;
    private javax.swing.JComboBox cb_combustible;
    private javax.swing.JComboBox<String> cb_filtro;
    private javax.swing.JComboBox<String> cb_filtro4;
    private javax.swing.JComboBox<String> cb_filtro5;
    private javax.swing.JComboBox<String> cb_filtro6;
    private javax.swing.JComboBox cb_marca;
    private javax.swing.JComboBox cb_modelo;
    private javax.swing.JComboBox cb_transmision;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lbl_id;
    private com.toedter.calendar.JYearChooser sp_year;
    private javax.swing.JTable tbl_veh_dato;
    private javax.swing.JTable tbl_veh_dato1;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_buscar4;
    private javax.swing.JTextField txt_buscar5;
    private javax.swing.JTextField txt_buscar6;
    // End of variables declaration//GEN-END:variables
    private Map mp_cb_marca;
    private Map mp_cb_modelo;
    private Map mp_cb_color;
    private Map mp_cb_carroceria;
    private Map mp_cb_transmision;
    private Map mp_cb_combustible;
    private Map mp_cb_filtro;
    private Map mp_cb_marca_modelo;    
    
    private void cargar(String filtro){
        
        String col_name = " da.id_veh_dato as ID ,ma.descripcion as Marca,mo.descripcion as Modelo, " +
                          " co.descripcion as Color,ca.descripcion as Carroceria, " +
                          " tr.descripcion as Transmision,com.descripcion as Combustible,da.veh_year as 'Year'";
        String tbl_name = " veh_dato da " +
                          " LEFT JOIN veh_modelo mo ON da.id_veh_modelo = mo.id_veh_modelo " +
                          " LEFT JOIN veh_marca ma ON ma.id_veh_marca = mo.id_veh_marca  " +
                          " LEFT JOIN veh_color co ON co.id_veh_color = da.id_veh_color " +
                          " LEFT JOIN veh_tipo_carroceria ca ON ca.id_veh_tipo_carroceria = da.id_veh_tipo_carroceria " +
                          " LEFT JOIN veh_transmision tr ON tr.id_veh_transmision = da.id_veh_transmision " +
                          " LEFT JOIN veh_combustible com ON com.id_veh_combustible = da.id_veh_combustible ";
        String orden =    " da.id_veh_dato ";

        tbl_veh_dato = Lib.limpiarTabla(tbl_veh_dato);
        if(filtro.trim().equals("")){

            tbl_veh_dato.setModel(Lib.tblCargarDatosVehiculos((DefaultTableModel)tbl_veh_dato.getModel(),Lib.queryArray(col_name, tbl_name,orden)));

        }else {
            
            tbl_veh_dato.setModel(Lib.tblCargarDatosVehiculos((DefaultTableModel)tbl_veh_dato.getModel(),Lib.queryArrayW(col_name, tbl_name," UPPER( "+mp_cb_filtro.get(cb_filtro.getSelectedItem())+ " ) LIKE UPPER('"+ filtro + "%') ORDER BY "+orden)));

        }

    }
   
    private void tbl_prueba(MouseEvent evt){
        JOptionPane.showConfirmDialog(this, "hola");
    }
    private void limpiar(){
        
        lbl_id.setText("...");
        cb_marca.setSelectedIndex(0);
        cb_carroceria.setSelectedIndex(0);
        cb_color.setSelectedIndex(0);
        cb_combustible.setSelectedIndex(0);
        cb_transmision.setSelectedIndex(0);
        cb_filtro.setSelectedIndex(0);
        txt_buscar.setText("");
        
    }

    private void selecionarDato(){
         
        int fila =  tbl_veh_dato.getSelectedRow();
      
        if(fila ==-1) {
            JOptionPane.showMessageDialog(this,"Debes Seleccionar una Registro.");
        } else{    
      
            lbl_id.setText(tbl_veh_dato.getValueAt(fila, 0).toString());
            cb_marca.setSelectedItem(tbl_veh_dato.getValueAt(fila, 1).toString());
            cb_modelo.setSelectedItem(tbl_veh_dato.getValueAt(fila, 2).toString());
            cb_color.setSelectedItem(tbl_veh_dato.getValueAt(fila, 3).toString());
            cb_carroceria.setSelectedItem(tbl_veh_dato.getValueAt(fila, 4).toString());
            cb_transmision.setSelectedItem(tbl_veh_dato.getValueAt(fila, 5).toString());
            cb_combustible.setSelectedItem(tbl_veh_dato.getValueAt(fila, 6).toString());
            sp_year.setValue(Integer.valueOf(tbl_veh_dato.getValueAt(fila, 7).toString()));
            
            //txt_carroceria.setText(tbl_veh_dato.getValueAt(fila, 1).toString());
       
      }
        
    }
    
    private void comboBoxCargar() {
        
        //cargar marca
        mp_cb_marca = Lib.mapCargar("veh_marca","descripcion");    
        cb_marca = Lib.cbCargar(cb_marca, mp_cb_marca);
        //cargar modelo
        mp_cb_modelo = Lib.mapCargar(" id_veh_modelo,descripcion "," veh_modelo "," descripcion ");    

        //cargar color
        mp_cb_color = Lib.mapCargar("veh_color","descripcion");    
        cb_color = Lib.cbCargar(cb_color, mp_cb_color);
        //cargar carroceria
        mp_cb_carroceria = Lib.mapCargar("veh_tipo_carroceria","descripcion");    
        cb_carroceria = Lib.cbCargar(cb_carroceria, mp_cb_carroceria);
        //cargar transmision
        mp_cb_transmision = Lib.mapCargar("veh_transmision","descripcion");    
        cb_transmision = Lib.cbCargar(cb_transmision, mp_cb_transmision);
        //cargar combustible
        mp_cb_combustible = Lib.mapCargar("veh_combustible","descripcion");    
        cb_combustible = Lib.cbCargar(cb_combustible, mp_cb_combustible);
        //cargar filtro
        mp_cb_filtro = new HashMap<>();   
        mp_cb_filtro.put("ID", "da.id_veh_dato");
        mp_cb_filtro.put("Marca", "ma.descripcion");
        mp_cb_filtro.put("Modelo", "mo.descripcion");
        mp_cb_filtro.put("Color", "co.descripcion");
        mp_cb_filtro.put("Carroceria", "ca.descripcion");
        mp_cb_filtro.put("Transmision", "tr.descripcion");
        mp_cb_filtro.put("Combustible", "com.descripcion");
        mp_cb_filtro.put("Year", "da.veh_year");
        cb_filtro = Lib.cbCargar(cb_filtro, mp_cb_filtro);
        
   
    }
    
    private void agregarVehiculo(){
        //String mod_name = txt_modelo.getText();
        //String id_marca = mp_cb_marca.get(cb_marca.getSelectedItem()).toString();
        if( cb_modelo.getSelectedIndex()!= -1 && 
            cb_marca.getSelectedIndex()!= -1  &&
            cb_carroceria.getSelectedIndex()!= -1 && 
            cb_transmision.getSelectedIndex()!= -1 &&
            cb_combustible.getSelectedIndex()!= -1  &&
            cb_color.getSelectedIndex()!= -1){
            

            String id_modelo = mp_cb_modelo.get(cb_modelo.getSelectedItem()).toString();
            String id_carroceria = mp_cb_carroceria.get(cb_carroceria.getSelectedItem()).toString();
            String id_transmision = mp_cb_transmision.get(cb_transmision.getSelectedItem()).toString();
            String id_combustible = mp_cb_combustible.get(cb_combustible.getSelectedItem()).toString();
            String id_color = mp_cb_color.get(cb_color.getSelectedItem()).toString();
            int year = sp_year.getValue();

            if(Lib.existeRegistro("*","veh_dato"," id_veh_modelo = "+ id_modelo +" AND id_veh_color = "+ id_color
                                  +" AND id_veh_tipo_carroceria = "+ id_carroceria + " AND id_veh_transmision = "+ id_transmision
                                  +" AND id_veh_combustible = "+ id_combustible + " AND veh_year = "+ year ) == 0){
                int id_ins_marca = Lib.queryInsert(  new String[]{"id_veh_modelo" , "id_veh_color","id_veh_tipo_carroceria","id_veh_transmision","id_veh_combustible","veh_year"}
                                                   , new String[]{id_modelo,id_color,id_carroceria,id_transmision,id_combustible,String.valueOf(year)},"veh_dato");
                if (id_ins_marca == 0){
                    JOptionPane.showMessageDialog(this,"No se Inserto ningun registro","Error no se guardaron datos",JOptionPane.ERROR_MESSAGE);
                    System.err.println("No se insertaron registro");

                }else{
                    cargar("");
                    limpiar();
                }
            }else{
                JOptionPane.showMessageDialog(this,"El Vehiculo ya se encuentra registrado","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                System.err.println("El vehiculo ya existe");
            }
        }else{
        
            JOptionPane.showMessageDialog(this,"Los datos suministrado no son valido o no a selecionado ningun valor","Dato duplicado",JOptionPane.ERROR_MESSAGE);
            System.err.println("Datos invalidos");
        }
        
    }
    private void actualizarVehiculo(){
       
        
            if(Lib.validaString(lbl_id.getText()) && lbl_id.getText() != "..."){
                String id_modelo = mp_cb_modelo.get(cb_modelo.getSelectedItem()).toString();
                String id_carroceria = mp_cb_carroceria.get(cb_carroceria.getSelectedItem()).toString();
                String id_transmision = mp_cb_transmision.get(cb_transmision.getSelectedItem()).toString();
                String id_combustible = mp_cb_combustible.get(cb_combustible.getSelectedItem()).toString();
                String id_color = mp_cb_color.get(cb_color.getSelectedItem()).toString();
                int year = sp_year.getValue();

                if(Lib.existeRegistro("*","veh_dato"," id_veh_modelo = "+ id_modelo +" AND id_veh_color = "+ id_color
                                      +" AND id_veh_tipo_carroceria = "+ id_carroceria + " AND id_veh_transmision = "+ id_transmision
                                      +" AND id_veh_combustible = "+ id_combustible + " AND veh_year = "+ year ) == 0){
                    int ok = JOptionPane.showConfirmDialog(this, "Se actualizara el registro con el id: "+lbl_id.getText(),"Actualizar registro",JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(ok == JOptionPane.YES_OPTION){
                        int id_ins_marca = Lib.queryUpdate(   new String[]{"id_veh_modelo" , "id_veh_color","id_veh_tipo_carroceria","id_veh_transmision","id_veh_combustible","veh_year"}
                                                            , new String[]{id_modelo,id_color,id_carroceria,id_transmision,id_combustible,String.valueOf(year)}
                                                            ,"veh_dato","id_veh_dato = '"+lbl_id.getText()+" '");
                        if (id_ins_marca == 0){
                            JOptionPane.showMessageDialog(this,"No se actualizo ningun registro","Error no se guardaron datos",JOptionPane.ERROR_MESSAGE);
                            System.err.println("No se actualizo registro");

                        }else{
                            cargar("");
                            limpiar();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"El vehiculo ya se encuentra registrado","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                    System.err.println("El Nombre del vehiculo existe");
                }
            }else{
                JOptionPane.showMessageDialog(this,"Los datos suministrado no son valido o no a selecionado ningun valor","Dato duplicado",JOptionPane.ERROR_MESSAGE);
                System.err.println("Datos invalidos");
            }

            
    }
    private void eliminarVehiculo(){

            if(Lib.validaString(lbl_id.getText()) && lbl_id.getText() != "..."){
                int ok = JOptionPane.showConfirmDialog(this, "Se eliminara el registro con el id: "+lbl_id.getText(),"Eliminar registro",JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
                if(ok == JOptionPane.YES_OPTION){    
                    int id_ins_marca = Lib.queryDelete("veh_dato","id_veh_dato",lbl_id.getText());
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
    

}
