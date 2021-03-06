/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;


import Datos.Conexion;
import Utilerias.ModeloTabla;
import eva.MDIApplication;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Paul Benitez
 */
public final class Municipios extends javax.swing.JInternalFrame {

    /**
     * Creates new form Municipios
     */

    // Variables de la clase
    Conexion database;
    ResultSet registros;
    boolean filtrar=false;   
    Catalogos.Municipio dlg;

    public Municipios() {
        initComponents();
        database = MDIApplication.database;
        //database = new Conexion();
        //database.conectar();
        cargarTabla();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JToolBar();
        BotonNuevo = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonBaja = new javax.swing.JButton();
        BotonReporte = new javax.swing.JButton();
        cuerpo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        pie = new javax.swing.JPanel();
        campo = new javax.swing.JComboBox();
        CajaBusqueda = new javax.swing.JTextField();
        btn_Buscar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Municipios");
        setMinimumSize(new java.awt.Dimension(820, 400));
        setName("Lineas"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 600));

        menu.setFloatable(false);
        menu.setRollover(true);

        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Nuevo.png"))); // NOI18N
        BotonNuevo.setToolTipText("Nuevo");
        BotonNuevo.setFocusable(false);
        BotonNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });
        menu.add(BotonNuevo);

        BotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar.png"))); // NOI18N
        BotonEditar.setToolTipText("Editar");
        BotonEditar.setFocusable(false);
        BotonEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });
        menu.add(BotonEditar);

        BotonBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Baja.png"))); // NOI18N
        BotonBaja.setToolTipText("Eliminar ");
        BotonBaja.setFocusable(false);
        BotonBaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonBaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajaActionPerformed(evt);
            }
        });
        menu.add(BotonBaja);

        BotonReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Print.png"))); // NOI18N
        BotonReporte.setToolTipText("Imprimir ");
        BotonReporte.setFocusable(false);
        BotonReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonReporteActionPerformed(evt);
            }
        });
        menu.add(BotonReporte);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);

        tabla.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setNextFocusableComponent(campo);
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout cuerpoLayout = new javax.swing.GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 884, Short.MAX_VALUE)
            .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE))
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
            .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );

        campo.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        campo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID", "Nombre", "Estado" }));
        campo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoActionPerformed(evt);
            }
        });

        CajaBusqueda.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        CajaBusqueda.setNextFocusableComponent(btn_Buscar);

        btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar.png"))); // NOI18N
        btn_Buscar.setToolTipText("Buscar");
        btn_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Buscar.setNextFocusableComponent(campo);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pieLayout = new javax.swing.GroupLayout(pie);
        pie.setLayout(pieLayout);
        pieLayout.setHorizontalGroup(
            pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CajaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
        );
        pieLayout.setVerticalGroup(
            pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CajaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(900, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        // Aquí vamos a capturar uno nuevo        
        dlg = new Municipio();
        dlg.enlace=database;
        dlg.configurarPara("NUEVO");
        dlg.setTitle("Nuevo Municipio");
        dlg.padre = this;    
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);   
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
        // Busqueda por patron de caracteres.
         if (CajaBusqueda.getText().isEmpty())
           filtrar = false;
         else
           filtrar = true;
         cargarTabla();
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void BotonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajaActionPerformed
        // Primeramente vemos si está seleccionado un registro
        int registroActivo;
        registroActivo = tabla.getSelectedRow();

        if (registroActivo == -1)
        {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún Municipio",
                                          "Mensaje", JOptionPane.WARNING_MESSAGE);
            return;
        }       
        
        dlg = new Municipio();
        dlg.enlace=database;
        dlg.configurarPara("ELIMINAR");
        dlg.setTitle("Eliminar Municipio");
        dlg.padre = this;
        
        int idx; 
        idx = tabla.convertRowIndexToModel(registroActivo);
        idx = (int)((ModeloTabla)tabla.getModel()).getValueAt(idx, 0);
        //idx = (int)((ModeloTabla)tabla.getModel()).getValueAt(registroActivo, 0);
        dlg.cargarCampos(idx);
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);          
    }//GEN-LAST:event_BotonBajaActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed
        // Primeramente vemos si está seleccionado un registro
        int registroActivo = tabla.getSelectedRow();

        if (registroActivo == -1)
        {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado ningún Municipio",
                                          "Mensaje", JOptionPane.WARNING_MESSAGE);
            return;
        }        
        
        // Aquí vamos a editar el registro seleccionado
        dlg = new Municipio();
        dlg.enlace=database;
        dlg.configurarPara("EDITAR");        
        dlg.setTitle("Actualizar Municipio");
        dlg.padre = this;        
        int idx; 
        idx = tabla.convertRowIndexToModel(registroActivo);
        idx = (int)((ModeloTabla)tabla.getModel()).getValueAt(idx, 0);
        //idx = (int)((ModeloTabla)tabla.getModel()).getValueAt(registroActivo, 0);
        dlg.cargarCampos(idx);
        dlg.setLocationRelativeTo(this);
        dlg.setVisible(true);        
    }//GEN-LAST:event_BotonEditarActionPerformed

    private void campoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoActionPerformed
        
    }//GEN-LAST:event_campoActionPerformed

    private void BotonReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonReporteActionPerformed
        
    }//GEN-LAST:event_BotonReporteActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //database.desconectar();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Egels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {                 
                    new Municipios().setVisible(true);                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBaja;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JButton BotonReporte;
    private javax.swing.JTextField CajaBusqueda;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JComboBox campo;
    private javax.swing.JPanel cuerpo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar menu;
    private javax.swing.JPanel pie;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla()
    {
       // Ejecutar metodo para recuperar los registros de la tabla de Municipio
      Datos.Municipio oMunicipio = new Datos.Municipio(database);
      
      try {
          
          if (filtrar) 
          {
            // Validamos en campo de id              
            if (campo.getSelectedIndex()==0)
            {
                try
                {
                   Integer.parseInt(CajaBusqueda.getText());
                }
                catch (NumberFormatException error)
                {
                   JOptionPane.showMessageDialog(this, "Patrón de búsqueda incorrecto, se esperaban números", "Error", JOptionPane.ERROR_MESSAGE);
                   filtrar = false; // Esto corrige el bug
                   CajaBusqueda.setText(""); btn_Buscar.doClick();
                   return;     
                }                             
            }            
            registros = oMunicipio.DataSetMunicipio(CajaBusqueda.getText(), campo.getSelectedIndex()); 
          }  
          else
          {
            registros = oMunicipio.DataSetMunicipio();
          }
      } catch (SQLException ex) {
          Logger.getLogger(Municipios.class.getName()).log(Level.SEVERE, null, ex);
      }
       
      // Se crea una manejador para los datos que van a recuperarse
      ModeloTabla modelo = new ModeloTabla();   
      modelo.rs = registros;
 
      try 
        {
         modelo.rsmd=registros.getMetaData();
        } 
      catch (SQLException ex) 
        {
         Logger.getLogger(Municipios.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      tabla.setModel(modelo);  
      tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      tabla.getColumnModel().getColumn(0).setPreferredWidth(70);      
      tabla.getColumnModel().getColumn(1).setPreferredWidth(300);
      tabla.getColumnModel().getColumn(2).setPreferredWidth(300);
    }}// Fin de la clase

