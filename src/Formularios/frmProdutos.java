/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;
import Classes.Produtos;
import Classes.Utilidades;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OBEL
 */
public class frmProdutos extends javax.swing.JInternalFrame {
private Dados clsdados;
private int Produtoatual = 0;
private boolean cmdNovo = false;
private DefaultTableModel Usertable;


public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    public frmProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbtaxa = new javax.swing.JComboBox<>();
        txtcodproduto = new javax.swing.JTextField();
        txtpreco = new javax.swing.JTextField();
        txtdescricao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmdproximo = new javax.swing.JButton();
        cmdultimo = new javax.swing.JButton();
        cmdprimeiro = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdalterar = new javax.swing.JButton();
        cmdnovo = new javax.swing.JButton();
        cmdsalvar = new javax.swing.JButton();
        cmddeletar = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        cmdpesquisar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mtable = new javax.swing.JTable();
        txtobservacao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Produtos ");
        setToolTipText("");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel1.setText("Cod. Produto:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("   Descri????o:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Observa????o");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Pre??o:");

        cmbtaxa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Taxa", "10%", "15%", "20%" }));
        cmbtaxa.setEnabled(false);
        cmbtaxa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbtaxaActionPerformed(evt);
            }
        });

        txtcodproduto.setEnabled(false);
        txtcodproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodprodutoActionPerformed(evt);
            }
        });

        txtpreco.setEnabled(false);
        txtpreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecoActionPerformed(evt);
            }
        });

        txtdescricao.setEnabled(false);
        txtdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescricaoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Cadastro de Produtos");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        cmdproximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ir32x32.png"))); // NOI18N
        cmdproximo.setToolTipText("Proximo Cadastro");
        cmdproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdproximoActionPerformed(evt);
            }
        });

        cmdultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/duploir32x32.png"))); // NOI18N
        cmdultimo.setToolTipText("Ultimo Cadastro");
        cmdultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdultimoActionPerformed(evt);
            }
        });

        cmdprimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/duplovoltar32x32.png"))); // NOI18N
        cmdprimeiro.setToolTipText("Primeiro Cadastro");
        cmdprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprimeiroActionPerformed(evt);
            }
        });

        cmdanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar32x32.png"))); // NOI18N
        cmdanterior.setToolTipText("Cadastro Anterior");
        cmdanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdanteriorActionPerformed(evt);
            }
        });

        cmdalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/escrever32x32.png"))); // NOI18N
        cmdalterar.setToolTipText("Editar Cadastro");
        cmdalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdalterarActionPerformed(evt);
            }
        });

        cmdnovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/mais32x32.png"))); // NOI18N
        cmdnovo.setToolTipText("Novo Cadastro");
        cmdnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdnovoActionPerformed(evt);
            }
        });

        cmdsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar32x32.png"))); // NOI18N
        cmdsalvar.setToolTipText("Salvar Cadastro");
        cmdsalvar.setEnabled(false);
        cmdsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsalvarActionPerformed(evt);
            }
        });

        cmddeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/deletar32x32.png"))); // NOI18N
        cmddeletar.setToolTipText("Pesquisar Cadastro");
        cmddeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeletarActionPerformed(evt);
            }
        });

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar32x32.png"))); // NOI18N
        cmdcancelar.setToolTipText("Editar Cadastro");
        cmdcancelar.setEnabled(false);
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });

        cmdpesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar32x32.png"))); // NOI18N
        cmdpesquisar1.setToolTipText("Pesquisar Cadastro");
        cmdpesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdpesquisar1ActionPerformed(evt);
            }
        });

        Mtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Mtable);

        txtobservacao.setEnabled(false);
        txtobservacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtobservacaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("  Taxa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 72, Short.MAX_VALUE)
                        .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmddeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdpesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtobservacao)
                                    .addComponent(txtdescricao)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtcodproduto)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbtaxa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtcodproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbtaxa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtpreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtobservacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdproximo)
                    .addComponent(cmdultimo)
                    .addComponent(cmdprimeiro)
                    .addComponent(cmdanterior)
                    .addComponent(cmdsalvar)
                    .addComponent(cmddeletar)
                    .addComponent(cmdnovo)
                    .addComponent(cmdalterar)
                    .addComponent(cmdcancelar)
                    .addComponent(cmdpesquisar1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodprodutoActionPerformed

    private void txtprecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecoActionPerformed

    private void cmdnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdnovoActionPerformed
        // TODO add your handling code here:
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdnovo.setEnabled(false);
        cmdalterar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdsalvar.setEnabled(true);
        cmddeletar.setEnabled(false);
        
        txtcodproduto.setEnabled(true);
        txtpreco.setEnabled(true);
        txtdescricao.setEnabled(true);
        txtobservacao.setEnabled(true);
        cmbtaxa.setEnabled(true);
        
        txtcodproduto.setText("");
        txtpreco.setText("");
        txtdescricao.setText("");
        txtobservacao.setText("");
        cmbtaxa.setSelectedIndex(0);
        
        cmdNovo=true;
        
        txtcodproduto.requestFocusInWindow();
        
        CarregarTable();
              
        
    }//GEN-LAST:event_cmdnovoActionPerformed

    private void cmdalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdalterarActionPerformed
        // TODO add your handling code here:
        cmdprimeiro.setEnabled(false);
        cmdanterior.setEnabled(false);
        cmdproximo.setEnabled(false);
        cmdultimo.setEnabled(false);
        cmdnovo.setEnabled(false);
        cmdalterar.setEnabled(false);
        cmdcancelar.setEnabled(true);
        cmdsalvar.setEnabled(true);
        cmddeletar.setEnabled(false);
        
        
        txtpreco.setEnabled(true);
        txtdescricao.setEnabled(true);
        txtobservacao.setEnabled(true);
        cmbtaxa.setEnabled(true);
         
        cmdNovo=false;
        
        txtpreco.requestFocusInWindow();
    }//GEN-LAST:event_cmdalterarActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed

        // Validando Campos no Formulario de Cadastro
        
        if (txtcodproduto.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um codigo de produto valido");
            txtcodproduto.requestFocusInWindow();
            return;
        }
        
        if (cmbtaxa.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar  uma taxa valido");
            cmbtaxa.requestFocusInWindow();
            return;
            
        }
        
        if (txtpreco.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar pre??o valido");
            txtpreco.requestFocusInWindow();
            return;
        }
       
        if (txtdescricao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar descri????o valido");
            txtdescricao.requestFocusInWindow();
            return;
        }
        
        if (txtobservacao.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar observacao valido");
            txtobservacao.requestFocusInWindow();
            return;
        }
        
        if (!Utilidades.isNumeric(txtpreco.getText())){
            JOptionPane.showMessageDialog(rootPane, "Apenas Numeros valido");
            txtpreco.requestFocusInWindow();
            return;
        }
        
        int preco = Integer.parseInt(txtpreco.getText());
        if (preco<=0){
            JOptionPane.showMessageDialog(rootPane, "Esse campo s?? aceita numero maior que 0");
            txtpreco.requestFocusInWindow();
            return;
        }

        int poslinha = clsdados.LinhaProdutos(txtcodproduto.getText());
        if (cmdNovo){       
            if (poslinha != -1){
            JOptionPane.showMessageDialog(rootPane, " Esse cadastro de usuario j?? existe no banco de dados");
            txtcodproduto.requestFocusInWindow();
            return;
            
        }
        }
        else{
            if(poslinha == -1){
                JOptionPane.showMessageDialog(rootPane, " Esse cadastro de usuario n??o existe no banco de dados");
                txtcodproduto.requestFocusInWindow();
                return;
                
            }
        }
        Produtos Mproduto = new Produtos(txtcodproduto.getText(), txtdescricao.getText(), preco, cmbtaxa.getSelectedIndex(), txtobservacao.getText());
        
        String msg;
        if (cmdNovo){
            msg=clsdados.Cadproduto(Mproduto);
        }else{
            msg = clsdados.EditarProduto(Mproduto, poslinha);
        }
        JOptionPane.showMessageDialog(rootPane, msg);
        CarregarTable();
                
        // Codigo do bot??o salvar formulario usuarios
        
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmddeletar.setEnabled(true);
        
        txtcodproduto.setEnabled(false);
        txtpreco.setEnabled(false);
        txtdescricao.setEnabled(false);
        txtobservacao.setEnabled(false);
        cmbtaxa.setEnabled(false);
        
    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        // Codigo do bot??o cancelar
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmddeletar.setEnabled(true);
        
        txtcodproduto.setEnabled(false);
        txtpreco.setEnabled(false);
        txtdescricao.setEnabled(false);
        txtobservacao.setEnabled(false);
        cmbtaxa.setEnabled(false);
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     visualizarCadastros();
     CarregarTable();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmdprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprimeiroActionPerformed
        // Codigo de bot??o primeiro do formulario de ususarios
        
        Produtoatual = 0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdprimeiroActionPerformed

    private void cmdultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdultimoActionPerformed
        // Ultimo metodo para chamar o contador
        Produtoatual = clsdados.NProdutos()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdultimoActionPerformed

    private void cmdproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdproximoActionPerformed
        // Proximo incremento
        Produtoatual ++;
        if (Produtoatual == clsdados.NProdutos()){
            Produtoatual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdproximoActionPerformed

    private void cmdanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdanteriorActionPerformed
        // incremento anterior
        Produtoatual --;
        if (Produtoatual == -1){
            Produtoatual = clsdados.NProdutos()-1;
            
        }
        visualizarCadastros();
        
        
    }//GEN-LAST:event_cmdanteriorActionPerformed

    private void cmddeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeletarActionPerformed
        // Metodo para deletar
        int Del;
        Del = JOptionPane.showConfirmDialog(rootPane, "Deseja deletar o cadastro ?");
        if(Del !=0){
            return;
        }
        String msg;
        msg = clsdados.DeletarUsuario(Produtoatual);
        JOptionPane.showMessageDialog(rootPane, msg);
        Produtoatual=0;
        visualizarCadastros();
        CarregarTable();
    }//GEN-LAST:event_cmddeletarActionPerformed

    private void cmdpesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdpesquisar1ActionPerformed
        // Metodo Pesquisar
        String produto = JOptionPane.showInputDialog("Digite o codigo do produto para realizar sua pesquisa");
        if (produto.equals("")){
            return;
        }
        int posL = clsdados.LinhaProdutos(produto);
        if (posL ==  -1){
            JOptionPane.showMessageDialog(rootPane, "N??o foi possivel localizar esse cadastro no banco de dados");
            return;
        }
        Produtoatual=posL;
        visualizarCadastros();
       
    }//GEN-LAST:event_cmdpesquisar1ActionPerformed

    private void cmbtaxaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbtaxaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbtaxaActionPerformed

    private void txtobservacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtobservacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtobservacaoActionPerformed

    private void txtdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescricaoActionPerformed
    private void visualizarCadastros(){
        txtcodproduto.setText(clsdados.getProdutos()[Produtoatual].getCodproduto());
        txtpreco.setText(""+clsdados.getProdutos()[Produtoatual].getPreco());
        txtdescricao.setText(clsdados.getProdutos()[Produtoatual].getDescricao());
        txtobservacao.setText(clsdados.getProdutos()[Produtoatual].getObservacao());
        cmbtaxa.setSelectedItem(clsdados.getProdutos()[Produtoatual].getTaxa());
    }
    
    private void CarregarTable(){
        String titulocabecalho[]={"Cod do Produto", "Descri????o", "Pre??o","Taxa", "Observa????o"};
        String RegCadastro[] = new String [5];
        Usertable=new DefaultTableModel(null,titulocabecalho);
        for(int i=0;i<clsdados.NProdutos();i++){
            RegCadastro[0]=clsdados.getProdutos()[i].getCodproduto();
            RegCadastro[1]=clsdados.getProdutos()[i].getDescricao();
            RegCadastro[2]="" + clsdados.getProdutos()[i].getPreco();
            RegCadastro[3]= Taxa (clsdados.getProdutos()[i].getTaxa());
            RegCadastro[4]=clsdados.getProdutos()[i].getObservacao();
            
            Usertable.addRow(RegCadastro);
        }
        Mtable.setModel(Usertable);
    }
    private String Taxa (int idtaxa){
        switch(idtaxa){
            case 0: return "Vit??ria";
            case 1: return "Vila Velha";
            case 2: return "Serra";
            case 3: return "Guaraparir";
            default: return "Sem Taxa";
            
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mtable;
    private javax.swing.JComboBox<String> cmbtaxa;
    private javax.swing.JButton cmdalterar;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmddeletar;
    private javax.swing.JButton cmdnovo;
    private javax.swing.JButton cmdpesquisar1;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdproximo;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodproduto;
    private javax.swing.JTextField txtdescricao;
    private javax.swing.JTextField txtobservacao;
    private javax.swing.JTextField txtpreco;
    // End of variables declaration//GEN-END:variables
}
