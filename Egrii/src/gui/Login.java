/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import models.Controlador;
import models.users.Usuario;

/**
 *
 * @author sabela
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    Controlador controller;
    
    public Login() {
        initComponents();
    }
    
    public Login(Controlador controller){
        this.controller = controller;
        initComponents();
        
        falloInicioSesion.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoEmail = new javax.swing.JTextField();
        textoPassword = new javax.swing.JTextField();
        falloInicioSesion = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        entrarLb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        registroLb = new javax.swing.JLabel();
        callToActionLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Egrii - Log In");

        jPanel1.setBackground(new java.awt.Color(34, 82, 123));

        jLabel1.setFont(new java.awt.Font("FreeSans", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(234, 253, 254));
        jLabel1.setText("E-mail");

        jLabel2.setFont(jLabel1.getFont());
        jLabel2.setForeground(jLabel1.getForeground());
        jLabel2.setText("Password");

        textoEmail.setBackground(new java.awt.Color(234, 253, 254));
        textoEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 253, 254), 3, true));

        textoPassword.setBackground(new java.awt.Color(234, 253, 254));
        textoPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(234, 253, 254), 3, true));

        falloInicioSesion.setForeground(new java.awt.Color(229, 14, 14));
        falloInicioSesion.setText("Usuario o contraseña incorrectos");

        jLabel3.setFont(new java.awt.Font("FreeSans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(234, 253, 254));
        jLabel3.setText("LOG IN");

        entrarLb.setBackground(new java.awt.Color(51, 183, 112));
        entrarLb.setForeground(new java.awt.Color(234, 253, 254));
        entrarLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrarLb.setText("Entrar");
        entrarLb.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        entrarLb.setOpaque(true);
        entrarLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrarLbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                entrarLbMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                entrarLbMouseEntered(evt);
            }
        });

        registroLb.setBackground(new java.awt.Color(51, 122, 183));
        registroLb.setForeground(new java.awt.Color(234, 253, 254));
        registroLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registroLb.setText("¡Regístrate!");
        registroLb.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        registroLb.setOpaque(true);
        registroLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registroLbMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registroLbMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registroLbMouseEntered(evt);
            }
        });

        callToActionLb.setForeground(new java.awt.Color(234, 253, 254));
        callToActionLb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        callToActionLb.setText("Aún no tienes cuenta?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(callToActionLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registroLb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(textoEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(falloInicioSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entrarLb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(135, 135, 135))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(falloInicioSesion)
                .addGap(12, 12, 12)
                .addComponent(entrarLb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(callToActionLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registroLb, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLbMouseClicked
        falloInicioSesion.setVisible(false);
        Usuario user = new Usuario(null, null, textoEmail.getText(), textoPassword.getText(), null);
        if(controller.comprobarAutentificacion(user)){
            user = controller.obtenerUsuario(textoEmail.getText());
            
            controller.loggeado(user);
            this.dispose();
        }
        else falloInicioSesion.setVisible(true);
    }//GEN-LAST:event_entrarLbMouseClicked

    private void registroLbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroLbMouseClicked
       controller.nuevoRegistro();
    }//GEN-LAST:event_registroLbMouseClicked

    private void entrarLbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLbMouseEntered
        entrarLb.setBackground(new java.awt.Color(59, 200, 124));
    }//GEN-LAST:event_entrarLbMouseEntered

    private void entrarLbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrarLbMouseExited
        entrarLb.setBackground(new java.awt.Color(51, 183, 112));
    }//GEN-LAST:event_entrarLbMouseExited

    private void registroLbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroLbMouseEntered
        registroLb.setBackground(new java.awt.Color(59,135,200));
    }//GEN-LAST:event_registroLbMouseEntered

    private void registroLbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registroLbMouseExited
        registroLb.setBackground(new java.awt.Color(51, 122, 183));
    }//GEN-LAST:event_registroLbMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel callToActionLb;
    private javax.swing.JLabel entrarLb;
    private javax.swing.JLabel falloInicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel registroLb;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoPassword;
    // End of variables declaration//GEN-END:variables
}
