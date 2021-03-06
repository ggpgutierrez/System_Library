/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlador.ControladorLogar;
import Utilitarios.Cores;
import Model.Logar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriel
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        
        this.setSize(400, 400);
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

        jtfUsuario = new javax.swing.JTextField();
        jbuEntrar = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jtfUsuario.setForeground(new java.awt.Color(51, 51, 51));
        jtfUsuario.setText("Usuário");
        jtfUsuario.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jtfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfUsuarioMouseClicked(evt);
            }
        });
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyPressed(evt);
            }
        });

        jbuEntrar.setText("Entrar");
        jbuEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuEntrarActionPerformed(evt);
            }
        });

        jpfSenha.setForeground(new java.awt.Color(51, 51, 51));
        jpfSenha.setText("Senha");
        jpfSenha.setMargin(new java.awt.Insets(2, 10, 2, 2));
        jpfSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpfSenhaMouseClicked(evt);
            }
        });
        jpfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfSenhaActionPerformed(evt);
            }
        });
        jpfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyTyped(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/depositphotos_26558067-stock-illustration-pattern-for-girls-with-books.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jbuEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jbuEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfSenhaActionPerformed

    }//GEN-LAST:event_jpfSenhaActionPerformed

    private void jtfUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfUsuarioMouseClicked
        jtfUsuario.setText("");
        jtfUsuario.setBackground(Cores.AmareloClaro());
        

    }//GEN-LAST:event_jtfUsuarioMouseClicked

    private void jpfSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpfSenhaMouseClicked
        jpfSenha.setText("");
        jpfSenha.setBackground(Cores.AmareloClaro());
        if("".equals(jtfUsuario))
        {
            
        }

    }//GEN-LAST:event_jpfSenhaMouseClicked

    private void jpfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyPressed
        
        
        jpfSenha.setBackground(Cores.AmareloClaro());
        
    }//GEN-LAST:event_jpfSenhaKeyPressed

    private void jpfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyTyped

    }//GEN-LAST:event_jpfSenhaKeyTyped

    private void jtfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyPressed
        
        jtfUsuario.setBackground(Cores.AmareloClaro());
        
    }//GEN-LAST:event_jtfUsuarioKeyPressed

    private void jbuEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuEntrarActionPerformed
        // TODO add your handling code here:

        Logar log = new Logar();
        log.setUsuario(jtfUsuario.getText());
        log.setSenha(jpfSenha.getText());
        boolean auxtela = false;
        try {
            ControladorLogar replogar = new ControladorLogar();
            
            if (replogar.autenticar(log) == true) {
                this.hide();
                if ("Administrativo".equals(replogar.filtrar(log))) {
                    
                    auxtela = true;
                    TelaPrincipal tela = new TelaPrincipal(auxtela);
                    tela.setVisible(true);
                } else {
                    auxtela = false;
                    TelaPrincipal tela = new TelaPrincipal(auxtela);
                    tela.setVisible(true);
                }
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbuEntrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbuEntrar;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables

}
