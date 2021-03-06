/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pessoa;
import Controlador.ControladorUsuario;

import Utilitarios.Mensagem;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class TelaVisualizarPessoa extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaVisualizarPessoa
     *
     * @throws java.sql.SQLException
     */
    public TelaVisualizarPessoa() throws SQLException {
        
        initComponents();
        jtfCodigo.enable(false);
        
        try {
            repp.obterTodos(jTable1);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jlbCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jbuAtualizar = new javax.swing.JButton();
        jcbNivel = new javax.swing.JComboBox<>();
        jcbCargo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfRg = new javax.swing.JTextField();
        jtfDocumento = new javax.swing.JTextField();
        jtfEnd = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jcbStatus = new javax.swing.JComboBox<>();
        jftNasc = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JTextField();
        jbuExcluir = new javax.swing.JButton();
        jtfPesquisa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcbOpcao = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(0, 153, 153));
        setClosable(true);
        setTitle("Admnistrar Usuário");
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

        jlbCodigo.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(51, 51, 51));
        jlbCodigo.setText("Código");

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("RG");

        jLabel3.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Status");

        jLabel5.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Documento");

        jLabel6.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Cargo");

        jLabel7.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Data de Nascimento");

        jLabel8.setText("Sexo");

        jLabel9.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Endereço");

        jLabel10.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Email");

        jLabel11.setText("Nivel");

        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.sexo}"), jcbSexo, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jbuAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atualizar.png"))); // NOI18N
        jbuAtualizar.setText("Atualizar");
        jbuAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuAtualizarActionPerformed(evt);
            }
        });

        jcbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Aluno", "Funcionario", " " }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nivel}"), jcbNivel, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Professor", "Diretor", "Vice-Diretor", "Coordenador", "Inspetor", "Auxiliar", "Administrativo", " " }));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTable1, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cargo}"), jcbCargo, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOME", "DOCUMENTO", "NIVEL", "SEXO", "RG", "STATUS", "DATANASC", "TELEFONE", "EMAIL", "CARGO", "ENDEREÇO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(4).setMinWidth(40);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(40);
        }

        jtfEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEndActionPerformed(evt);
            }
        });

        jtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailActionPerformed(evt);
            }
        });

        jcbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", " " }));

        try {
            javax.swing.text.MaskFormatter
            data = new javax.swing.text.MaskFormatter("##/##/####");
            jftNasc = new javax.swing.JFormattedTextField(data);

        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro na data");
        }

        jbuExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/if_Close_1891023.png"))); // NOI18N
        jbuExcluir.setText("Excluir");
        jbuExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbuExcluir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jbuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuExcluirActionPerformed(evt);
            }
        });

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

        jLabel12.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Pesquisar");

        jcbOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOME", "DOCUMENTO", "RG", " " }));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(jLabel12)
                        .add(18, 18, 18)
                        .add(jcbOpcao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(31, 31, 31)
                        .add(jtfPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jbuAtualizar)
                            .add(82, 82, 82)
                            .add(jbuExcluir))
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel10)
                                .add(jLabel9)
                                .add(jlbCodigo)
                                .add(jLabel1)
                                .add(jLabel3)
                                .add(layout.createSequentialGroup()
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel4)
                                        .add(jcbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(49, 49, 49)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(jLabel8))
                                    .add(33, 33, 33)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(jLabel11)
                                        .add(jcbNivel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(jLabel7)
                                .add(jLabel6)
                                .add(jcbCargo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jtfDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 139, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel5)
                                .add(jftNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 197, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jtfEnd)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jtfEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jtfRg)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jtfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 197, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(56, 56, 56))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(jlbCodigo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfCodigo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(13, 13, 13)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(62, 62, 62)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jtfPesquisa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12)
                            .add(jcbOpcao, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 546, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(96, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(jtfNome, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfRg, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(2, 2, 2)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfTelefone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(jLabel8)
                            .add(jLabel11))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jcbSexo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jcbNivel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jcbStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jcbCargo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(9, 9, 9)
                        .add(jLabel5)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfDocumento, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel7)
                        .add(8, 8, 8)
                        .add(jftNasc, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel9)
                        .add(8, 8, 8)
                        .add(jtfEnd, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel10)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jtfEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jbuAtualizar)
                            .add(jbuExcluir))
                        .add(0, 0, Short.MAX_VALUE))))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbuAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuAtualizarActionPerformed
        // TODO add your handling code here:
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(jtfNome.getText());
        pessoa.setRg(jtfRg.getText());
        pessoa.setDocumento(jtfDocumento.getText());
        pessoa.setTelefone(jtfTelefone.getText());
        pessoa.setEmail(jtfEmail.getText());
        pessoa.setEndereco(jtfEnd.getText());
        pessoa.setDataNasc(jftNasc.getText());
        pessoa.setNivel(jcbNivel.getSelectedItem().toString());
        pessoa.setCargo(jcbCargo.getSelectedItem().toString());
        pessoa.setSatus(jcbStatus.getSelectedItem().toString());
        pessoa.setSexo(jcbSexo.getSelectedItem().toString());
        pessoa.setTelefone(jtfTelefone.getText());
        if (("".equals(jtfRg.getText())) || ("".equals(jtfDocumento.getText())) || ("".equals(jtfEmail.getText()))
                || ("").equals(jtfEnd.getText()) || ("".equals(jtfNome.getText())) || ("".equals(jtfTelefone.getText()))
                || ("".equals(jftNasc.getText()))) {
            
            Mensagem.exibirMensagem("Preencha todos os campos");
            
        } else {
            try {
                ControladorUsuario rep = new ControladorUsuario();
                rep.Atualiza(pessoa);
                try {
                    rep.obterTodos(jTable1);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TelaVisualizarPessoa.class.getName()).log(Level.SEVERE, null, ex);
                }
                jtfRg.setText("");
                jtfDocumento.setText("");
                jtfEmail.setText("");
                jtfEnd.setText("");
                jftNasc.setText("");
                jtfNome.setText("");
                jtfTelefone.setText("");
                
            } catch (SQLException ex) {
                Mensagem.exibirMensagem("Erro" + ex);
            }
            
        }
    }//GEN-LAST:event_jbuAtualizarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int indiceLinha = jTable1.getSelectedRow();
        String aux1, aux2, aux3, aux4 = "";
        jtfCodigo.setText(jTable1.getValueAt(indiceLinha, 0).toString());
        jtfNome.setText(jTable1.getValueAt(indiceLinha, 1).toString());
        jtfDocumento.setText(jTable1.getValueAt(indiceLinha, 2).toString());
        
        jtfRg.setText(jTable1.getValueAt(indiceLinha, 5).toString());
        //Status = 6 Nivel = 3 Sexo = 4 Cargo = 10
        aux1 = jTable1.getValueAt(indiceLinha, 6).toString();
        aux2 = jTable1.getValueAt(indiceLinha, 4).toString();
        aux3 = jTable1.getValueAt(indiceLinha, 3).toString();
        aux4 = jTable1.getValueAt(indiceLinha, 10).toString();
        jftNasc.setText(jTable1.getValueAt(indiceLinha, 7).toString());
        jtfTelefone.setText(jTable1.getValueAt(indiceLinha, 8).toString());
        jtfEmail.setText(jTable1.getValueAt(indiceLinha, 9).toString());
        
        jtfEnd.setText(jTable1.getValueAt(indiceLinha, 11).toString());
        //Verificação do item para mandar pra combobox de Cargo
        if ("Aluno".equals(aux4)) {
            jcbCargo.setSelectedIndex(0);
        } else if ("Professor".equals(aux4)) {
            jcbCargo.setSelectedIndex(1);
        } else if ("Diretor".equals(aux4)) {
            jcbCargo.setSelectedIndex(2);
        } else if ("Vice-Diretor".equals(aux4)) {
            jcbCargo.setSelectedIndex(3);
        } else if ("Coordenador".equals(aux4)) {
            jcbCargo.setSelectedIndex(4);
        } else if ("Inspetor".equals(aux4)) {
            jcbCargo.setSelectedIndex(5);
        } else if ("Auxiliar".equals(aux4)) {
            jcbCargo.setSelectedIndex(6);
        } else {
            //Administrativo
            jcbCargo.setSelectedIndex(7);
        }
        //Verificação do item pra mandar pra combobox de Status
        if ("Ativo".equals(aux1)) {
            jcbStatus.setSelectedIndex(0);
        } else {
            jcbStatus.setSelectedIndex(1);
        }

        //Verificação do Item pra mandar pra combobox de Sexo
        if ("M".equals(aux2)) {
            jcbSexo.setSelectedIndex(0);
        } else {
            jcbSexo.setSelectedIndex(1);
        }
        //Verificação de itens pra mandar para a combobox de Nivel
        if ("Administrador".equals(aux3)) {
            jcbNivel.setSelectedIndex(0);
        } else if ("Aluno".equals(aux3)) {
            jcbNivel.setSelectedIndex(1);
        } else {
            jcbNivel.setSelectedIndex(2);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1KeyPressed

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped

    }//GEN-LAST:event_jTable1KeyTyped

    private void jtfEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEndActionPerformed

    private void jtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailActionPerformed

    private void jbuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuExcluirActionPerformed
        
        try {
            
            repp.Remove(jtfCodigo.getText());
            try {
                repp.obterTodos(jTable1);
                
            } catch (Exception ex) {
                Mensagem.exibirMensagem("Impossível buscar todos" + ex);
            }
        } catch (Exception ex) {
            Mensagem.exibirMensagem("Impossível remover cadastro" + ex);
        }
    }//GEN-LAST:event_jbuExcluirActionPerformed

    private void jtfPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisaKeyPressed
        // TODO add your handling code here:
        String opcao = "";
        opcao = jcbOpcao.getSelectedItem().toString();
        
        if ("".equals(jtfPesquisa.getText())) {
            try {
                repp.obterTodos(jTable1);
            } catch (SQLException ex) {
                Mensagem.exibirMensagem("Impossível buscar todos" + ex);
            }
        } else {
            try {
                
                repp.obterPesquisa(jTable1, jtfPesquisa.getText(), opcao);
            } catch (Exception ex) {
                Mensagem.exibirMensagem("Impossível buscar por critério" + ex);
            }
        }
    }//GEN-LAST:event_jtfPesquisaKeyPressed

    private void jtfPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtfPesquisaMouseClicked
        // TODO add your handling code here:
        jtfPesquisa.setText("");
    }//GEN-LAST:event_jtfPesquisaMouseClicked

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        TelaPrincipal.VisualizarPessoas = false;
        
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        TelaPrincipal.VisualizarPessoas = true;
    }//GEN-LAST:event_formInternalFrameOpened

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
         
        this.setDefaultCloseOperation(TelaVisualizarPessoa.DO_NOTHING_ON_CLOSE);  
        if(Mensagem.exibirConfirm() == JOptionPane.YES_OPTION)
        {
        this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbuAtualizar;
    private javax.swing.JButton jbuExcluir;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JComboBox<String> jcbNivel;
    private javax.swing.JComboBox<String> jcbOpcao;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JComboBox<String> jcbStatus;
    private javax.swing.JFormattedTextField jftNasc;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDocumento;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfEnd;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfRg;
    private javax.swing.JTextField jtfTelefone;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
 ControladorUsuario repp = new ControladorUsuario();
 
}
