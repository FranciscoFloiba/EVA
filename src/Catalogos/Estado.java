/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Catalogos;

import Datos.Conexion;

/**
 *
 * @author Paul
 */
public class Estado extends javax.swing.JDialog {
    private String accion;
    public Conexion enlace;
    public Estados padre;
    
    /**
     * Creates new form Estado
     */
    public Estado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lcodigo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ldescri = new javax.swing.JLabel();
        boton_guardar = new javax.swing.JButton();
        boton_cancelar = new javax.swing.JButton();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estado");
        setMinimumSize(new java.awt.Dimension(580, 200));
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setPreferredSize(new java.awt.Dimension(580, 200));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        lcodigo.setText("ID");
        getContentPane().add(lcodigo);
        lcodigo.setBounds(40, 40, 120, 14);

        nombre.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        nombre.setMinimumSize(new java.awt.Dimension(8, 24));
        nombre.setPreferredSize(new java.awt.Dimension(8, 24));
        getContentPane().add(nombre);
        nombre.setBounds(230, 60, 310, 28);

        ldescri.setText("Nombre");
        getContentPane().add(ldescri);
        ldescri.setBounds(230, 40, 310, 14);

        boton_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarTodo.png"))); // NOI18N
        boton_guardar.setMnemonic('G');
        boton_guardar.setText("OK");
        boton_guardar.setToolTipText("Guardar registro");
        boton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_guardar);
        boton_guardar.setBounds(270, 130, 130, 40);

        boton_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        boton_cancelar.setMnemonic('C');
        boton_cancelar.setText("Cancelar");
        boton_cancelar.setToolTipText("Cancelar actualización");
        boton_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(boton_cancelar);
        boton_cancelar.setBounds(410, 130, 130, 40);

        id.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        id.setMinimumSize(new java.awt.Dimension(8, 24));
        id.setPreferredSize(new java.awt.Dimension(8, 24));
        getContentPane().add(id);
        id.setBounds(40, 60, 120, 28);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-602)/2, (screenSize.height-256)/2, 602, 256);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_guardarActionPerformed
      Datos.Estado oEstado = new Datos.Estado(enlace);    
        
      // El ID lo genera automáticamente la base de datos cuando el registro es nuevo
      int idx;
      idx = (id.getText().isEmpty())?0:Integer.valueOf(id.getText());
      oEstado.setEstado(idx,nombre.getText()); 
      
      if (this.accion.equals("NUEVO"))
      {
        // Se manda escribir a la base de datos
        if (!oEstado.Nuevo())
        {
          nombre.requestFocus();
          return;
        }
      }
      
      if (this.accion.equals("EDITAR"))
      {
        // Se manda escribir a la base de datos
        if (!oEstado.Editar())
        {
          nombre.requestFocus();
          return;
        }
      }      
    
      if (this.accion.equals("ELIMINAR"))
      {
        // Se manda escribir a la base de datos
        if (!oEstado.Eliminar())
        {
          boton_guardar.requestFocus();
          return;
        }
      }
      
      this.dispose();
      padre.cargarTabla();
    }//GEN-LAST:event_boton_guardarActionPerformed

    private void boton_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_boton_cancelarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Egel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estado().setVisible(true);                               
            }
        });
    }
    
    public void configurarPara(String accion)
    {
        this.accion = accion;
        if (accion.equals("NUEVO"))
        {            
           // limpiarCampos();
           id.setEnabled(false);
        }

        if (accion.equals("EDITAR"))
        {
            habilitarCampos(true);
            id.setEnabled(false);
        }
        
         if (accion.equals("ELIMINAR"))
        {
            habilitarCampos(false);
            id.setEnabled(false);
        }
    }
    
    public void habilitarCampos(boolean estado)
    {
        id.setEditable(estado);
        nombre.setEditable(estado);        
   }
    
   public void cargarCampos(int idx)
    {
        Datos.Estado oEstado = new Datos.Estado(enlace);
        oEstado.Buscar(idx);
        id.setText(Integer.toString(oEstado.getID()));        
        nombre.setText(oEstado.getNombre());        
   } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar;
    private javax.swing.JButton boton_guardar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel lcodigo;
    private javax.swing.JLabel ldescri;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
