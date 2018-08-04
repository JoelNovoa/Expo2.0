/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

//Importo la libreria de las animaciones
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author panay
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFondologin = new javax.swing.JPanel();
        Login = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jtxtContraseña = new javax.swing.JPasswordField();
        jbtnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPalo = new javax.swing.JLabel();
        jPalo1 = new javax.swing.JLabel();
        jPublic = new javax.swing.JLabel();
        jPublic1 = new javax.swing.JLabel();
        jbtnSiguiente = new javax.swing.JButton();
        jbtnRegresar = new javax.swing.JButton();
        jbtnMinimizar = new javax.swing.JLabel();
        jbtnCerrar = new javax.swing.JLabel();
        jFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jFondologinLayout = new javax.swing.GroupLayout(jFondologin);
        jFondologin.setLayout(jFondologinLayout);
        jFondologinLayout.setHorizontalGroup(
            jFondologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jFondologinLayout.setVerticalGroup(
            jFondologinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setOpaque(false);
        Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(110, 15, 27));
        jLabel5.setText("Contraseña:");
        Login.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bodoni MT Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(110, 15, 27));
        jLabel3.setText("Usuario:");
        Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(110, 15, 27));
        jLabel4.setText("INICIAR SESION");
        Login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario (6).png"))); // NOI18N
        Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 70, 80));

        jtxtUsuario.setBackground(new java.awt.Color(51, 51, 51));
        jtxtUsuario.setFont(new java.awt.Font("Bodoni MT Black", 0, 18)); // NOI18N
        jtxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        Login.add(jtxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 210, 30));

        jtxtContraseña.setBackground(new java.awt.Color(51, 51, 51));
        jtxtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jtxtContraseña.setText("jPasswordField1");
        jtxtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(110, 15, 27), 2));
        Login.add(jtxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, 30));

        jbtnEntrar.setBackground(new java.awt.Color(51, 51, 51));
        jbtnEntrar.setFont(new java.awt.Font("Bodoni MT Black", 1, 18)); // NOI18N
        jbtnEntrar.setForeground(new java.awt.Color(110, 15, 27));
        jbtnEntrar.setText("IR");
        jbtnEntrar.setBorder(null);
        jbtnEntrar.setContentAreaFilled(false);
        jbtnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnEntrarMouseClicked(evt);
            }
        });
        jbtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEntrarActionPerformed(evt);
            }
        });
        Login.add(jbtnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/loginfont.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 310));

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -240, 470, 310));

        jPalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea.PNG"))); // NOI18N
        getContentPane().add(jPalo, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 1000, 10));

        jPalo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/linea.PNG"))); // NOI18N
        getContentPane().add(jPalo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 1000, 10));

        jPublic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/publi1.jpg"))); // NOI18N
        jPublic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jPublic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        jPublic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/public2.jpg"))); // NOI18N
        getContentPane().add(jPublic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        jbtnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-izquierda (1).png"))); // NOI18N
        jbtnSiguiente.setBorder(null);
        jbtnSiguiente.setBorderPainted(false);
        jbtnSiguiente.setContentAreaFilled(false);
        jbtnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnSiguienteMouseClicked(evt);
            }
        });
        jbtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 40, 30));

        jbtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha-punta-apuntando-a-la-derecha (1).png"))); // NOI18N
        jbtnRegresar.setBorder(null);
        jbtnRegresar.setBorderPainted(false);
        jbtnRegresar.setContentAreaFilled(false);
        jbtnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnRegresarMouseClicked(evt);
            }
        });
        jbtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 40, 30));

        jbtnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar (4).png"))); // NOI18N
        jbtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnMinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(jbtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 30, 30));

        jbtnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/boton-cerrar (1).png"))); // NOI18N
        jbtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(jbtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 0, -1, 30));

        jFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegresarActionPerformed

    private void jbtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSiguienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnSiguienteActionPerformed

    private void jbtnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnSiguienteMouseClicked
        // TODO add your handling code here:
        //Slider para que pase a la siguiente imagen
        
        AnimationClass ac= new AnimationClass();
        ac.jLabelXRight(-1000, 0, 25, 5, jPublic);
        
        AnimationClass acc= new AnimationClass();
        acc.jLabelXRight(0, 1000, 25, 5, jPublic1);
    }//GEN-LAST:event_jbtnSiguienteMouseClicked

    private void jbtnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnRegresarMouseClicked
        // TODO add your handling code here:
        AnimationClass ac= new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, jPublic);
        
        AnimationClass acc= new AnimationClass();
        acc.jLabelXRight(1000, 0, 25, 5, jPublic1);
    }//GEN-LAST:event_jbtnRegresarMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         AnimationClass ac= new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, jPublic);
        
        AnimationClass acc= new AnimationClass();
        acc.jLabelXRight(1000, 0, 25, 5, jPublic1);
        
    }//GEN-LAST:event_formWindowOpened
public void jPanelYUp(final int start, final int stop, final int delay, final int increment, final JPanel jPanel)
  {
    if (jPanel.getY() == start) {
      new Thread()
      {

        public void run()
        {
          while (jPanel.getY() > stop) {
            for (int i = start; i >= stop; i -= increment) {
              try
              {
                Thread.sleep(delay);
                jPanel.setLocation(jPanel.getX(), i);
              }
              catch (InterruptedException e)
              {
                System.out.println("Error Thread Interrupted: " + e);
              }
            }
          }
          jPanel.setLocation(jPanel.getX(), stop);
        }
      }.start();
    }
  }

public void jPanelYDown(final int start, final int stop, final int delay, final int increment, final JPanel jPanel)
  {
    if (jPanel.getY() == start) {
      new Thread()
      {

        public void run()
        {
          while (jPanel.getY() <= start) {
            for (int i = start; i <= stop; i += increment) {
              try
              {
                Thread.sleep(delay);
                
                jPanel.setLocation(jPanel.getX(), i);
              }
              catch (InterruptedException e)
              {
                System.out.println("Error Thread Interrupted: " + e);
              }
            }
          }
          jPanel.setLocation(jPanel.getX(), stop);
        }
      }.start();
    }
  }
    private void jbtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCerrarMouseClicked
        // TODO add your handling code here:
                //Cerrar el programa
        try{
          int dialogButton=JOptionPane.YES_NO_OPTION;
          int result= JOptionPane.showConfirmDialog(this, "Seguro que desea salir","EXIT",dialogButton);
          if(result==0){
              System.exit(0);
          }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jbtnCerrarMouseClicked

    private void jbtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnMinimizarMouseClicked
        // TODO add your handling code here:
        //Para poder minimizar el programa
        this.setState(Formularios.Login.ICONIFIED);
    }//GEN-LAST:event_jbtnMinimizarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //Para el slider del panel que suba y baje
        jPanelYDown(-240,0,25,5,Login);
        jPanelYUp(0,-240,25,5,Login);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jbtnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnEntrarMouseClicked
        // TODO add your handling code here:
        //para que me mande a la principal
        if(jtxtUsuario.getText() == "" && jtxtContraseña.getText()== ""){
               
        JOptionPane.showMessageDialog(this, "Usuario invalido");
        }else{
        
            Principal Principal= new Principal();
            dispose();
            Principal.setVisible(true);
        }
    }//GEN-LAST:event_jbtnEntrarMouseClicked

    private void jbtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnEntrarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JLabel jFondo;
    private javax.swing.JPanel jFondologin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jPalo;
    private javax.swing.JLabel jPalo1;
    private javax.swing.JLabel jPublic;
    private javax.swing.JLabel jPublic1;
    private javax.swing.JLabel jbtnCerrar;
    private javax.swing.JButton jbtnEntrar;
    private javax.swing.JLabel jbtnMinimizar;
    private javax.swing.JButton jbtnRegresar;
    private javax.swing.JButton jbtnSiguiente;
    private javax.swing.JPasswordField jtxtContraseña;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
