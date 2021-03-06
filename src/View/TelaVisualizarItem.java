/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controlador.ControladorItem;
import Model.Item;
import Utilitarios.Mensagem;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaVisualizarItem extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaVisualizarItem
     */
    public TelaVisualizarItem() throws SQLException {
        initComponents();
        jtfCodigo.enable(false);
        try {
            repi.obterTodos(jTable1);
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Impossível obter todos os dados na inicialização" + ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbOpcao = new javax.swing.JComboBox<>();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jlbCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtfEditora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfIdioma = new javax.swing.JTextField();
        jtfGenero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfCodExterno = new javax.swing.JTextField();
        jcbTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jbuAtualizar = new javax.swing.JButton();
        jbuExcluir = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setTitle("Administrar Itens");
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD ITEM", "COD EXTERNO", "NOME", "EDITORA", "IDIOMA", "GÊNERO", "TIPO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setMinimumSize(new java.awt.Dimension(205, 0));
        jTable1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 790, 560));

        jtfPesquisa.setText("Digite aqui ");
        jtfPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtfPesquisaMouseClicked(evt);
            }
        });
        jtfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfPesquisaKeyPressed(evt);
            }
        });
        getContentPane().add(jtfPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 162, -1));

        jLabel12.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Pesquisar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jcbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "EDITORA", "GÊNERO", "TIPO", "CODIGO EXTERNO" }));
        getContentPane().add(jcbOpcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));
        getContentPane().add(jtfCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 66, -1));
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 197, -1));

        jlbCodigo.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jlbCodigo.setText("Código");
        getContentPane().add(jlbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, -1, -1));
        getContentPane().add(jtfEditora, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, 130, -1));

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Editora");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Idioma");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Gênero");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));
        getContentPane().add(jtfIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 130, -1));
        getContentPane().add(jtfGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 360, 130, -1));

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Código Externo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, -1, -1));
        getContentPane().add(jtfCodExterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 92, -1));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livro", "Revista", "Quadrinhos", "Mangás", "Enciclopédia" }));
        getContentPane().add(jcbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Tipo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, -1, -1));

        jbuAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jbuAtualizar.setText("Atualizar");
        jbuAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbuAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, -1, -1));

        jbuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Close_1891023.png"))); // NOI18N
        jbuExcluir.setText("Excluir");
        jbuExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbuExcluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jbuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jbuExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        // TODO add your handling code here:
        String opcao, aux = "";
        opcao = jcbOpcao.getSelectedItem().toString();
        if ("NOME".equals(opcao)) {
            aux = "nome_item";
        } else if ("EDITORA".equals(opcao)) {
            aux = "editora";
        } else if ("GÊNERO".equals(opcao)) {
            aux = "genero";
        } else if ("TIPO".equals(opcao)) {
            aux = "tipo";
        } else {
            aux = "cod_externo";
        }
        if ("".equals(jtfPesquisa.getText())) {
            try {
                repi.obterTodos(jTable1);
            } catch (SQLException ex) {
                Mensagem.exibirMensagem("Impossível buscar todos" + ex);
            }
        } else {
            try {

                repi.obterPesquisa(jTable1, jtfPesquisa.getText(), aux);
            } catch (Exception ex) {
                Mensagem.exibirMensagem("Impossível buscar por critério" + ex);
            }
        }
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jtfPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPesquisaMouseClicked
        // TODO add your handling code here:
        jtfPesquisa.setText("");
    }//GEN-LAST:event_jtfPesquisaMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int indiceLinha = jTable1.getSelectedRow();
        String aux1 = "";
        jtfCodigo.setText(jTable1.getValueAt(indiceLinha, 0).toString());
        jtfCodExterno.setText(jTable1.getValueAt(indiceLinha, 1).toString());
        jtfNome.setText(jTable1.getValueAt(indiceLinha, 2).toString());
        jtfEditora.setText(jTable1.getValueAt(indiceLinha, 3).toString());
        jtfIdioma.setText(jTable1.getValueAt(indiceLinha, 4).toString());
        jtfGenero.setText(jTable1.getValueAt(indiceLinha, 5).toString());
        aux1 = jTable1.getValueAt(indiceLinha, 6).toString();
        if ("Livro".equals(aux1)) {
            jcbTipo.setSelectedIndex(0);
        } else if ("Revista".equals(aux1)) {
            jcbTipo.setSelectedIndex(1);
        } else if ("Quadrinhos".equals(aux1)) {
            jcbTipo.setSelectedIndex(2);
        } else if ("Mangás".equals(aux1)) {
            jcbTipo.setSelectedIndex(3);
        } else {
            jcbTipo.setSelectedIndex(4);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuExcluirActionPerformed

        int cod = 0;
        cod = Integer.parseInt(jtfCodigo.getText());

        try {
            repi.Remove(cod, jTable1);
            Mensagem.exibirMensagem("Item deletado com sucesso");
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Impossível remover cadastro do item" + ex);
        }
    }//GEN-LAST:event_jbuExcluirActionPerformed

    private void jbuAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAtualizarActionPerformed
        // TODO add your handling code here:

        int codigo = 0;
        codigo = Integer.parseInt(jtfCodigo.getText());
        item.setCodigo(jtfCodigo.getText());
        item.setCod_externo(jtfCodExterno.getText());
        item.setEditora(jtfEditora.getText());
        item.setNome_item(jtfNome.getText());
        item.setIdioma(jtfIdioma.getText());
        item.setGenero(jtfGenero.getText());
        item.setTipo(jcbTipo.getSelectedItem().toString());
        if (("".equals(jtfCodExterno.getText())) || ("".equals(jtfEditora.getText())) || ("".equals(jtfIdioma.getText()))
                || ("").equals(jtfGenero.getText()) || ("".equals(jtfNome.getText()))) {

            Mensagem.exibirMensagem("Preencha todos os campos");

        } else {
            try {

                repi.Atualiza(item, jTable1);

                jtfCodExterno.setText("");
                jtfCodigo.setText("");
                jtfEditora.setText("");
                jtfGenero.setText("");
                jtfIdioma.setText("");
                jtfNome.setText("");
                jtfPesquisa.setText("");

            } catch (SQLException ex) {
                Mensagem.exibirMensagem("Erro" + ex);
            }

        }
    }//GEN-LAST:event_jbuAtualizarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:

        this.setDefaultCloseOperation(TelaVisualizarItem.DO_NOTHING_ON_CLOSE);
        if (Mensagem.exibirConfirm() == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        TelaPrincipal.VisualizarItem = false;
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        TelaPrincipal.VisualizarItem = true;
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbuAtualizar;
    private javax.swing.JButton jbuExcluir;
    private javax.swing.JComboBox<String> jcbOpcao;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JTextField jtfCodExterno;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfEditora;
    private javax.swing.JTextField jtfGenero;
    private javax.swing.JTextField jtfIdioma;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    // End of variables declaration//GEN-END:variables
    ControladorItem repi = new ControladorItem();
    Item item = new Item();
}
