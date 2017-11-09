
import Clases.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.*;
import java.text.*;
import javax.swing.ImageIcon;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy
 */
public class MantenimientoADMIN extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos;
    Thread hilos;

    /**
     * Creates new form NewJFrame
     */
    public MantenimientoADMIN() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        this.setLocationRelativeTo(null);
        lblFecha.setText(fecha());
        hilos = new Thread(this);
        hilos.start();
        setVisible(true);
        punteros();
       
       
    }
    
    public void punteros() {
                        btnAdministrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                        
    }
    
    public void hora() {
    
        Calendar calendario = new GregorianCalendar();
        Date horaActual = new Date();
        calendario.setTime(horaActual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }

    public void run () {
        
        //WHILE
        
        Thread current = Thread.currentThread();
        
        while (current==hilos) {

            hora();
            lblHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    public void frame () {
        /*
        AdministrarUsuarios n = new AdministrarUsuarios();
        jDesktopPane.add(n);
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension FrameSize = n.getSize();
        n.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        n.show();
        */

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        p_fondo = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnCliente = new javax.swing.JMenu();
        btnClientes = new javax.swing.JMenuItem();
        btnUsuarios = new javax.swing.JMenu();
        btnAdministrarUsuario = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.gray, null, null));

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsuario.setText(Usuario.Usuario);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Fecha:");

        lblFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblFecha.setText("jLabel3");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Hora:");

        lblHora.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHora.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHora)
                        .addComponent(jLabel3)
                        .addComponent(lblFecha)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario)
                        .addComponent(jLabel4))))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        p_fondo.setMaximumSize(new java.awt.Dimension(850, 650));
        p_fondo.setMinimumSize(new java.awt.Dimension(850, 650));

        javax.swing.GroupLayout p_fondoLayout = new javax.swing.GroupLayout(p_fondo);
        p_fondo.setLayout(p_fondoLayout);
        p_fondoLayout.setHorizontalGroup(
            p_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        p_fondoLayout.setVerticalGroup(
            p_fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(p_fondo, java.awt.BorderLayout.CENTER);

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Clients-icon.png"))); // NOI18N
        btnCliente.setText("Clientes");

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Client-icon.png"))); // NOI18N
        btnClientes.setText("Agregar Cliente");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnCliente.add(btnClientes);

        jMenuBar1.add(btnCliente);

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Admin-icon.png"))); // NOI18N
        btnUsuarios.setText("Administrar Usuarios");

        btnAdministrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new.png"))); // NOI18N
        btnAdministrarUsuario.setText("Usuarios");
        btnAdministrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrarUsuarioActionPerformed(evt);
            }
        });
        btnUsuarios.add(btnAdministrarUsuario);

        jMenuBar1.add(btnUsuarios);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor-icon.png"))); // NOI18N
        jMenu1.setText("Proveedores");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/proveedor add-icon.png"))); // NOI18N
        jMenuItem1.setText("Agregar Proveedor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Almacen");

        jMenuItem2.setText("Almacen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrarUsuarioActionPerformed
        /*
        AdministrarUsuarios n = new AdministrarUsuarios();
        jDesktopPane.add(n);
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension FrameSize = n.getSize();
        n.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        n.show();
        */
    }//GEN-LAST:event_btnAdministrarUsuarioActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        /*
        AgregarClientes ac = new AgregarClientes();
        jDesktopPane.add(ac);
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension FrameSize = ac.getSize();
        ac.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ac.show();
        */
        p_AgregarClientes ag = new p_AgregarClientes();
        mostrarPanel(ag);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       /*
        Proveedor p = new Proveedor();
        jDesktopPane.add(p);
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension FrameSize = p.getSize();
        p.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        p.show();
        */
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        /*Vehiculos v = new Vehiculos();
        jDesktopPane.add(v);
        Dimension desktopSize = jDesktopPane.getSize();
        Dimension FrameSize = v.getSize();
        v.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        v.show();
        */
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static String fecha () {
    
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantenimientoADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAdministrarUsuario;
    private javax.swing.JMenu btnCliente;
    private javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenu btnUsuarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblUsuario;
    private static javax.swing.JPanel p_fondo;
    // End of variables declaration//GEN-END:variables
    public static void mostrarPanel(javax.swing.JPanel p_mostrar){

        p_mostrar.setSize(p_fondo.getSize());
        p_mostrar.setLocation(p_fondo.getLocation());
        p_fondo.removeAll();
        p_fondo.add(p_mostrar,BorderLayout.CENTER);
        p_fondo.revalidate();
        p_fondo.repaint();

    }


}
