/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlador.ControladorLogin;
import Model.Login;
import Utilitarios.Mensagem;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaCadastroLogin extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroLogin
     */
    public TelaCadastroLogin() {
        initComponents();
        jtfID.disable();
        jtfID.setBackground(Color.GRAY);
    }

    public void setposicao() {

        //pega a posição do internal e centraliza
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);

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
        jLabel1 = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jbuCadastra = new javax.swing.JButton();
        jtfRG = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbuPesquisa = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setTitle("Cadastrar Login");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book.png"))); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha");

        jbuCadastra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jbuCadastra.setText("Cadastrar");
        jbuCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuCadastraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("RG");

        jtfID.setForeground(new java.awt.Color(255, 255, 255));
        jtfID.setCaretColor(new java.awt.Color(255, 255, 255));
        jtfID.setDisabledTextColor(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID");

        jbuPesquisa.setText("Pesquisar");
        jbuPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jtfUsuario)
                        .addComponent(jpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbuPesquisa))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jbuCadastra)
                .addContainerGap(232, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbuPesquisa)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jbuCadastra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuPesquisaActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setRG(jtfRG.getText());
        if ("".equals(jtfRG.getText())) {
            Mensagem.exibirMensagem("Preencha o campo do RG");
        } else {
            try {
                jtfID.setText(replog.Pesquisar(login));
            } catch (SQLException ex) {
               Mensagem.exibirMensagem("Erro" + ex);
            }
        }
    }//GEN-LAST:event_jbuPesquisaActionPerformed

    private void jbuCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuCadastraActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setRG(jtfRG.getText());
        login.setCod_pk_pessoa(jtfID.getText());
        login.setSenha(jpfSenha.getText());
        login.setUsuario(jtfUsuario.getText());
        try {

            replog.Adiciona(login);
            jtfID.setText("");
            jtfRG.setText("");
            jtfUsuario.setText("");
            jpfSenha.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(TelaCadastroLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbuCadastraActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        TelaPrincipal.Login = true;
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        TelaPrincipal.Login = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:

        this.setDefaultCloseOperation(TelaCadastroLogin.DO_NOTHING_ON_CLOSE);
        if (Mensagem.exibirConfirm() == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbuCadastra;
    private javax.swing.JButton jbuPesquisa;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfRG;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
ControladorLogin replog = new ControladorLogin();
}