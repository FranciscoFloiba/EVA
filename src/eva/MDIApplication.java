/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eva;

import Catalogos.Academias;
import Catalogos.Asignaturas;
import Catalogos.Asignaturas_Temas;
import Catalogos.Carreras;
import Catalogos.Conaic_Area;
import Catalogos.Conaic_Areas;
import Catalogos.Contactos;
import Catalogos.Egels;
import Catalogos.Estados;
import Catalogos.Instituciones;
import Catalogos.Instrumentos;
import Catalogos.Municipios;
import Datos.Conexion;
import Seguridad.Administradores;
import Seguridad.Administradores_Modulos;
import Seguridad.Modulos;
import Seguridad.Permisos;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu.Separator;

/**
 *
 * @author RubenPaul
 */
public class MDIApplication extends javax.swing.JFrame {

    /**
     * Creates new form MDIApplication
     */
    
    // Esta será la única conexión para toda la aplicación
    public static Conexion database;
    
    public MDIApplication() {
        initComponents();
        this.setExtendedState(MDIApplication.MAXIMIZED_BOTH);
        this.setTitle("Sistema de Evaluación");          
        // Se determina el tama�o en pixeles de la pantalla
        Dimension dim = super.getToolkit().getScreenSize();
        // Se establece el tama�o maximo para el frame y el escritorio
        this.setSize(dim);
        escritorio.setSize(dim);
        setLogo();
        // Conectar a la BD
        database = new Conexion();
        if (!database.conectar())
           {
             JOptionPane.showMessageDialog(null, "Error de enlace a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);   
             System.exit(0);
           }
        else
        {         
           // Para habilitar autentificación ponga el valor en true
           activarPermisos(false);         
        }
    }
    
    public void activarPermisos(boolean estado)
    {
       if (estado)
       {
          if (database.conectar(database))
          {
             Permisos.setPermisos(menuBar);
             Permisos p = new Permisos();
             p.definirMenu(Conexion.idUser); 
             timer.start();              
          }
          else
          {
             System.exit(0); 
          }
       }
       else
       {
          Permisos.setPermisos(menuBar);
          Permisos p = new Permisos();
          p.renewMenu();
       }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer = new org.netbeans.examples.lib.timerbean.Timer();
        escritorio = new javax.swing.JDesktopPane();
        logo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        catalogos = new javax.swing.JMenu();
        estados = new javax.swing.JMenuItem();
        municipios = new javax.swing.JMenuItem();
        instituciones = new javax.swing.JMenuItem();
        egels = new javax.swing.JMenuItem();
        contactos = new javax.swing.JMenuItem();
        carreras = new javax.swing.JMenuItem();
        academias = new javax.swing.JMenuItem();
        areas_conaic = new javax.swing.JMenuItem();
        asignaturas = new javax.swing.JMenuItem();
        asignaturas_temas = new javax.swing.JMenuItem();
        Instrumentos = new javax.swing.JMenuItem();
        seguridad = new javax.swing.JMenu();
        administradores = new javax.swing.JMenuItem();
        modulos = new javax.swing.JMenuItem();
        administradores_modulos = new javax.swing.JMenuItem();
        window = new javax.swing.JMenu();
        acercade = new javax.swing.JMenuItem();

        timer.setDelay(30000L);
        timer.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timerOnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Reserva");
        setName("menu"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(0, 204, 255));
        escritorio.setAutoscrolls(true);

        logo.setLabelFor(escritorio);
        logo.setText("logo");
        escritorio.add(logo);

        catalogos.setMnemonic('f');
        catalogos.setText("Catalogos");
        catalogos.setName("catalogos"); // NOI18N

        estados.setText("Estados");
        estados.setName("estados"); // NOI18N
        estados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadosActionPerformed(evt);
            }
        });
        catalogos.add(estados);

        municipios.setText("Municipios");
        municipios.setName("municipios"); // NOI18N
        municipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipiosActionPerformed(evt);
            }
        });
        catalogos.add(municipios);

        instituciones.setMnemonic('p');
        instituciones.setText("Instituciones");
        instituciones.setName("instituciones"); // NOI18N
        instituciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                institucionesActionPerformed(evt);
            }
        });
        catalogos.add(instituciones);

        egels.setText("Tipos de Egel");
        egels.setName("tipos_egels"); // NOI18N
        egels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egelsActionPerformed(evt);
            }
        });
        catalogos.add(egels);

        contactos.setText("Contactos");
        contactos.setName("contactos"); // NOI18N
        contactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactosActionPerformed(evt);
            }
        });
        catalogos.add(contactos);

        carreras.setText("Carreras");
        carreras.setName("carreras"); // NOI18N
        carreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrerasActionPerformed(evt);
            }
        });
        catalogos.add(carreras);

        academias.setText("Academias");
        academias.setName("academias"); // NOI18N
        academias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academiasActionPerformed(evt);
            }
        });
        catalogos.add(academias);

        areas_conaic.setText("Areas Conaic");
        areas_conaic.setName("areas_conaic"); // NOI18N
        areas_conaic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areas_conaicActionPerformed(evt);
            }
        });
        catalogos.add(areas_conaic);

        asignaturas.setText("Asignaturas");
        asignaturas.setName("asignaturas"); // NOI18N
        asignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturasActionPerformed(evt);
            }
        });
        catalogos.add(asignaturas);

        asignaturas_temas.setText("Asignaturas y temas");
        asignaturas_temas.setName("asignaturas_temas"); // NOI18N
        asignaturas_temas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturas_temasActionPerformed(evt);
            }
        });
        catalogos.add(asignaturas_temas);

        Instrumentos.setText("Instrumentos");
        Instrumentos.setName("instrumentos"); // NOI18N
        Instrumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstrumentosActionPerformed(evt);
            }
        });
        catalogos.add(Instrumentos);

        menuBar.add(catalogos);

        seguridad.setText("Seguridad");
        seguridad.setName("seguridad"); // NOI18N

        administradores.setText("Administradores");
        administradores.setName("administradores"); // NOI18N
        administradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradoresActionPerformed(evt);
            }
        });
        seguridad.add(administradores);

        modulos.setText("Módulos");
        modulos.setName("modulos"); // NOI18N
        modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modulosActionPerformed(evt);
            }
        });
        seguridad.add(modulos);

        administradores_modulos.setText("Gestión de permisos");
        administradores_modulos.setName("permisos"); // NOI18N
        administradores_modulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                administradores_modulosActionPerformed(evt);
            }
        });
        seguridad.add(administradores_modulos);

        menuBar.add(seguridad);

        window.setMnemonic('W');
        window.setText("Window");
        window.setName("window"); // NOI18N
        window.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                windowMenuSelected(evt);
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
        });

        acercade.setMnemonic('a');
        acercade.setText("Acerca de ...");
        acercade.setName("acercade"); // NOI18N
        acercade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercadeActionPerformed(evt);
            }
        });
        window.add(acercade);

        menuBar.add(window);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1600, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void institucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_institucionesActionPerformed
        Instituciones dlg = new Instituciones();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();
    }//GEN-LAST:event_institucionesActionPerformed

    public void setLogo()
    {
        // Ponemos un logo centrado
        String path = "/Imagenes/logo.png";  
        URL url = this.getClass().getResource(path);  
        ImageIcon icon = new ImageIcon(url);         
        logo.setText("");
        logo.setIcon(icon);      
        logo.setSize(icon.getIconWidth(), icon.getIconHeight());        
        logo.setLocation((escritorio.getWidth()-icon.getIconWidth())/2, (escritorio.getHeight()-icon.getIconHeight())/2);
    }
    
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // Se redimensiona el escritorio al cambiar tama�o de ventana
        escritorio.setSize(this.getWidth()-20, this.getHeight()-20);
        // Forzamos el despliegue del escritorio al maximo de la ventana
        escritorio.setMinimumSize(new Dimension(this.getWidth()-20,this.getHeight()-20)); 
        setLogo();
    }//GEN-LAST:event_formComponentResized

    private void acercadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercadeActionPerformed
        // Llamada a Acerca de ...        
    }//GEN-LAST:event_acercadeActionPerformed

    private void windowMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_windowMenuSelected
        // Al oprimir el menu window refrescamos ventanas
        updateWindows();
    }//GEN-LAST:event_windowMenuSelected

    private void estadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadosActionPerformed
        Estados dlg = new Estados();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();
    }//GEN-LAST:event_estadosActionPerformed

    private void municipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipiosActionPerformed
        Municipios dlg = new Municipios();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();
    }//GEN-LAST:event_municipiosActionPerformed

    private void egelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egelsActionPerformed
        Egels dlg = new Egels();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();        
        dlg.setVisible(true);
        updateWindows();        
    }//GEN-LAST:event_egelsActionPerformed

    private void contactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactosActionPerformed
        Contactos dlg = new Contactos();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();   
    }//GEN-LAST:event_contactosActionPerformed

    private void carrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrerasActionPerformed
        Carreras dlg = new Carreras();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();  
    }//GEN-LAST:event_carrerasActionPerformed

    private void asignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturasActionPerformed
        Asignaturas dlg = new Asignaturas();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);              
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        try {
            dlg.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MDIApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        dlg.setVisible(true);
        updateWindows();  
    }//GEN-LAST:event_asignaturasActionPerformed

    private void academiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academiasActionPerformed
        Academias dlg = new Academias();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows();  
    }//GEN-LAST:event_academiasActionPerformed

    private void InstrumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstrumentosActionPerformed
        Instrumentos dlg = new Instrumentos();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows(); 
    }//GEN-LAST:event_InstrumentosActionPerformed

    private void asignaturas_temasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturas_temasActionPerformed
        Asignaturas_Temas dlg = new Asignaturas_Temas();        
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        try {
            dlg.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MDIApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
        dlg.setVisible(true);
        updateWindows(); 
    }//GEN-LAST:event_asignaturas_temasActionPerformed

    private void administradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradoresActionPerformed
        Administradores dlg = new Administradores();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();        
        dlg.setVisible(true);
    }//GEN-LAST:event_administradoresActionPerformed

    private void modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modulosActionPerformed
        Modulos dlg = new Modulos();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();        
        dlg.setVisible(true);
    }//GEN-LAST:event_modulosActionPerformed

    private void administradores_modulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_administradores_modulosActionPerformed
        Administradores_Modulos dlg = new Administradores_Modulos();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();        
        dlg.setVisible(true);
    }//GEN-LAST:event_administradores_modulosActionPerformed

    private void timerOnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerOnTime
        if (Permisos.isWorking())
        {
            Permisos p = new Permisos();
            p.renewMenu();
            p.definirMenu(Conexion.idUser);
        }
    }//GEN-LAST:event_timerOnTime

    private void areas_conaicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areas_conaicActionPerformed
        Conaic_Areas dlg = new Conaic_Areas();
        // Se agrega la ventana al escritorio
        escritorio.add(dlg);      
        dlg.toFront();
        // Se ubica la ventana en cascada
        dlg.setLocation(escritorio.getAllFrames().length*20, escritorio.getAllFrames().length*20);
        dlg.repaint();
        dlg.setVisible(true);
        updateWindows(); 
    }//GEN-LAST:event_areas_conaicActionPerformed

    public void updateWindows()
    {
        window.removeAll();
        for (int i=0; i<= escritorio.getAllFrames().length-1; i++)
        {
            JMenuItem item = new JMenuItem();
            item.setText(escritorio.getAllFrames()[i].getTitle()+"-"+(i+1));
            item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowsActionPerformed(evt);
            }
        });
            window.add(item);
        }
        // Introducimos un separador
        Separator separador = new javax.swing.JPopupMenu.Separator();
        window.add(separador);
        
        JMenuItem itemAlinear = new JMenuItem();
        itemAlinear.setText("Alinear ventanas");
        itemAlinear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alignWindowsActionPerformed(evt);
            }
        });
        window.add(itemAlinear);

        JMenuItem itemResetear = new JMenuItem();
        itemResetear.setText("Resetear ventanas");
        itemResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetWindowsActionPerformed(evt);
            }
        });
        window.add(itemResetear);
        
        JMenuItem itemSwap = new JMenuItem();
        itemSwap.setText("Intercambiar ventanas");
        itemSwap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapWindowsActionPerformed(evt);
            }
        });
        window.add(itemSwap);
        itemSwap.enable(escritorio.getAllFrames().length==2); 
        
        JMenuItem itemCloseAll = new JMenuItem();
        itemCloseAll.setText("Cerrar ventanas");
        itemCloseAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarWindowsActionPerformed(evt);
            }
        });
        window.add(itemCloseAll);
    }
    
    public void windowsActionPerformed(ActionEvent e) 
    {     
      // Rastreamos la ventana seleccionada
      for (int i=0; i<=escritorio.getAllFrames().length-1; i++)
        {
            if (e.getActionCommand().equals(escritorio.getAllFrames()[i].getTitle()+"-"+(i+1)))
            {
                try {
                    //JOptionPane.showMessageDialog(null, escritorio.getAllFrames()[i].getName());
                    escritorio.getAllFrames()[i].setSelected(true);
                    break;
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(MDIApplication.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void resetWindowsActionPerformed(ActionEvent e)
    {
        for (int i=0; i<= escritorio.getAllFrames().length-1; i++)
        {
            // Las regresamos a sus dimensiones originales
            int xsize, ysize;
            xsize = escritorio.getAllFrames()[i].getPreferredSize().width;
            ysize = escritorio.getAllFrames()[i].getPreferredSize().height;
            // Las ponemos en cascada y orden de aparici�n
            escritorio.getAllFrames()[i].setSize(new Dimension(xsize,ysize));
            escritorio.getAllFrames()[i].setLocation(i*20, i*20);
        }        
    }
    
    public static void alignWindowsActionPerformed(ActionEvent e)
    {
        int xscreen  = escritorio.getWidth();
        int yscreen  = escritorio.getHeight();
        int numero = escritorio.getAllFrames().length;
        int xsize = 0; 
        int ysize = 0; 
        
        // Si no hay ventanas, vamos para atras
        if (numero == 0) {
            return;
        }
            
        switch(numero)
        {
            case 1: {
                xsize = xscreen;
                ysize = yscreen;
                break;
            }
                
            case 2: {
                xsize = (int)xscreen/2;
                ysize = yscreen;
                break;
            }
                
            case 3: {                
                xsize = xscreen;
                ysize = (int)yscreen/3;
                break;                
            }
            default: {
                // Organización de ventanas temporal. Esto puede mejorar
                xsize = (int) Math.ceil( (double)xscreen / (double)((numero/2)+(numero%2)));
                ysize = (int) Math.ceil( (double)yscreen / (double)(numero/(numero/2)));
            }
        }    
        
        int posx=0, posy=0;
        //for (int i=0; i<= escritorio.getAllFrames().length-1; i++)
        for (int i=escritorio.getAllFrames().length-1; i>= 0; i--)
        {
            escritorio.getAllFrames()[i].setSize(new Dimension(xsize,ysize));
            //escritorio.getAllFrames()[i].setMinimumSize(new Dimension(xsize,ysize));            
            escritorio.getAllFrames()[i].setLocation(posx, posy);
            posx+=xsize; 
            if (posx >= xscreen)
            {
                posx=0;
                posy+=ysize;
            }
        }        
    }
    
    public void cerrarWindowsActionPerformed(ActionEvent e)
    {
        while (escritorio.getAllFrames().length!=0)
        {            
            escritorio.getAllFrames()[0].dispose();            
        }       
        updateWindows();
    }
    
    public void swapWindowsActionPerformed(ActionEvent e)
    {
       if (escritorio.getAllFrames().length==2)
       {
          Point w1, w2; 
          w1 = escritorio.getAllFrames()[0].getLocation(); 
          w2 = escritorio.getAllFrames()[1].getLocation(); 
          escritorio.getAllFrames()[0].setLocation(w2);
          escritorio.getAllFrames()[1].setLocation(w1);
       }
    }
           
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //MDIApplication principal = new MDIApplication();
                new MDIApplication().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Instrumentos;
    private javax.swing.JMenuItem academias;
    private javax.swing.JMenuItem acercade;
    private javax.swing.JMenuItem administradores;
    private javax.swing.JMenuItem administradores_modulos;
    private javax.swing.JMenuItem areas_conaic;
    private javax.swing.JMenuItem asignaturas;
    private javax.swing.JMenuItem asignaturas_temas;
    private javax.swing.JMenuItem carreras;
    private javax.swing.JMenu catalogos;
    private javax.swing.JMenuItem contactos;
    private javax.swing.JMenuItem egels;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem estados;
    private javax.swing.JMenuItem instituciones;
    public static javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem modulos;
    private javax.swing.JMenuItem municipios;
    private javax.swing.JMenu seguridad;
    public org.netbeans.examples.lib.timerbean.Timer timer;
    public javax.swing.JMenu window;
    // End of variables declaration//GEN-END:variables
}