/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Classes.Dados;
import Classes.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author OBEL
 */
public class frmUsuarios extends javax.swing.JInternalFrame {
private Dados clsdados;
private int usuarioatual = 0;
private boolean cmdNovo = false;

public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    public frmUsuarios() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbperfil = new javax.swing.JComboBox<>();
        txtcodusuario = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtsobrenome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmdproximo = new javax.swing.JButton();
        cmdultimo = new javax.swing.JButton();
        cmdprimeiro = new javax.swing.JButton();
        cmdanterior = new javax.swing.JButton();
        cmdalterar = new javax.swing.JButton();
        cmdnovo = new javax.swing.JButton();
        cmdsalvar = new javax.swing.JButton();
        cmdpesquisar = new javax.swing.JButton();
        cmdcancelar = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        txtconfsenha = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Usuarios ");
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
        jLabel1.setText("Cod. Usuário:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("           Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Sobre Nome:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel4.setText("          Senha:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel5.setText("Conf. Senha:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel6.setText("Perfil:");

        cmbperfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Perfil", "Administrador", "Funcionario" }));
        cmbperfil.setEnabled(false);
        cmbperfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbperfilActionPerformed(evt);
            }
        });

        txtcodusuario.setEnabled(false);
        txtcodusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodusuarioActionPerformed(evt);
            }
        });

        txtnome.setEnabled(false);
        txtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomeActionPerformed(evt);
            }
        });

        txtsobrenome.setEnabled(false);
        txtsobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsobrenomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Cadastro de Usuários");

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

        cmdpesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar32x32.png"))); // NOI18N
        cmdpesquisar.setToolTipText("Pesquisar Cadastro");

        cmdcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cancelar32x32.png"))); // NOI18N
        cmdcancelar.setToolTipText("Editar Cadastro");
        cmdcancelar.setEnabled(false);
        cmdcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelarActionPerformed(evt);
            }
        });

        txtsenha.setText("jPasswordField1");

        txtconfsenha.setText("jPasswordField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome)
                            .addComponent(txtsobrenome)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmdprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdanterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdproximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(cmdnovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addComponent(txtsenha)
                            .addComponent(txtconfsenha))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(cmbperfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtconfsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdproximo)
                    .addComponent(cmdultimo)
                    .addComponent(cmdprimeiro)
                    .addComponent(cmdanterior)
                    .addComponent(cmdsalvar)
                    .addComponent(cmdpesquisar)
                    .addComponent(cmdnovo)
                    .addComponent(cmdalterar)
                    .addComponent(cmdcancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodusuarioActionPerformed

    private void txtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomeActionPerformed

    private void txtsobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsobrenomeActionPerformed

    private void cmbperfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbperfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbperfilActionPerformed

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
        cmdpesquisar.setEnabled(false);
        
        txtcodusuario.setEnabled(true);
        txtnome.setEnabled(true);
        txtsobrenome.setEnabled(true);
        txtsenha.setEnabled(true);
        txtconfsenha.setEnabled(true);
        cmbperfil.setEnabled(true);
        
        txtcodusuario.setText("");
        txtnome.setText("");
        txtsobrenome.setText("");
        txtsenha.setText("");
        txtconfsenha.setText("");
        cmbperfil.setSelectedIndex(0);
        
        cmdNovo=true;
        
        txtcodusuario.requestFocusInWindow();
              
        
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
        cmdpesquisar.setEnabled(false);
        
        
        txtnome.setEnabled(true);
        txtsobrenome.setEnabled(true);
        txtsenha.setEnabled(true);
        txtconfsenha.setEnabled(true);
        cmbperfil.setEnabled(true);
         
        cmdNovo=false;
        
        txtnome.requestFocusInWindow();
    }//GEN-LAST:event_cmdalterarActionPerformed

    private void cmdsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsalvarActionPerformed

        // Validando Campos no Formulario de Cadastro
        
        if (txtcodusuario.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um codigo valido");
            txtcodusuario.requestFocusInWindow();
            return;
        }
        
        if (cmbperfil.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Favor selecionar  um perfil valido");
            cmbperfil.requestFocusInWindow();
            return;
            
        }
        
        if (txtnome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um nome valido");
            txtnome.requestFocusInWindow();
            return;
        }
       
        if (txtsobrenome.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um sobrenome valido");
            txtsobrenome.requestFocusInWindow();
            return;
        }
         
        String SSenha = new String (txtsenha.getPassword());
        String confSenha = new String (txtconfsenha.getPassword());
        
        if (SSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar uma senha valida");
            txtsenha.requestFocusInWindow();
            return;
        }
        
        if (confSenha.equals("")){
            JOptionPane.showMessageDialog(rootPane, "Favor digitar um codigo valido");
            txtconfsenha.requestFocusInWindow();
            return;
        }
        
        if (!SSenha.equals(confSenha)){
            JOptionPane.showMessageDialog(rootPane, "Senha diferentes");
            txtsenha.requestFocusInWindow();
            return;
        }
        
        int poslinha = clsdados.LinhaUsuario(txtcodusuario.getText());
        if (cmdNovo){       
            if (poslinha != -1){
            JOptionPane.showMessageDialog(rootPane, " Esse cadastro de usuario já existe no banco de dados");
            txtcodusuario.requestFocusInWindow();
            return;
            
        }
        }
        else{
            if(poslinha == -1){
                JOptionPane.showMessageDialog(rootPane, " Esse cadastro de usuario não existe no banco de dados");
                txtcodusuario.requestFocusInWindow();
                return;
                
            }
        }
            
        
        
        Usuario MUsuario = new Usuario(txtcodusuario.getText(), txtnome.getText(), txtsobrenome.getText(),SSenha,(String) cmbperfil.getSelectedItem());
        String msg = clsdados.CadUsuario(MUsuario);
        JOptionPane.showMessageDialog(rootPane, msg);
                
        // Codigo do botão salvar formulario usuarios
        
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmdpesquisar.setEnabled(true);
        
        txtcodusuario.setEnabled(false);
        txtnome.setEnabled(false);
        txtsobrenome.setEnabled(false);
        txtsenha.setEnabled(false);
        txtconfsenha.setEnabled(false);
        cmbperfil.setEnabled(false);
    }//GEN-LAST:event_cmdsalvarActionPerformed

    private void cmdcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelarActionPerformed
        // Codigo do botão cancelar
        cmdprimeiro.setEnabled(true);
        cmdanterior.setEnabled(true);
        cmdproximo.setEnabled(true);
        cmdultimo.setEnabled(true);
        cmdnovo.setEnabled(true);
        cmdalterar.setEnabled(true);
        cmdcancelar.setEnabled(false);
        cmdsalvar.setEnabled(false);
        cmdpesquisar.setEnabled(true);
        
        txtcodusuario.setEnabled(false);
        txtnome.setEnabled(false);
        txtsobrenome.setEnabled(false);
        txtsenha.setEnabled(false);
        txtconfsenha.setEnabled(false);
        cmbperfil.setEnabled(false);
    }//GEN-LAST:event_cmdcancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
     visualizarCadastros();   
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmdprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprimeiroActionPerformed
        // Codigo de botão primeiro do formulario de ususarios
        
        usuarioatual = 0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdprimeiroActionPerformed

    private void cmdultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdultimoActionPerformed
        // Ultimo metodo para chamar o contador
        usuarioatual = clsdados.NUsuarios()-1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdultimoActionPerformed

    private void cmdproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdproximoActionPerformed
        // Proximo incremento
        usuarioatual ++;
        if (usuarioatual == clsdados.NUsuarios()){
            usuarioatual=0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdproximoActionPerformed

    private void cmdanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdanteriorActionPerformed
        // incremento anterior
        usuarioatual --;
        if (usuarioatual == -1){
            usuarioatual = clsdados.NUsuarios()-1;
            
        }
        visualizarCadastros();
        
        
    }//GEN-LAST:event_cmdanteriorActionPerformed
    private void visualizarCadastros(){
        txtcodusuario.setText(clsdados.getUsuarios()[usuarioatual].getIdcodusuario());
        txtnome.setText(clsdados.getUsuarios()[usuarioatual].getNome());
        txtsobrenome.setText(clsdados.getUsuarios()[usuarioatual].getSobrenome());
        txtsenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        txtconfsenha.setText(clsdados.getUsuarios()[usuarioatual].getSenha());
        cmbperfil.setSelectedItem(clsdados.getUsuarios()[usuarioatual].getPerfil());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbperfil;
    private javax.swing.JButton cmdalterar;
    private javax.swing.JButton cmdanterior;
    private javax.swing.JButton cmdcancelar;
    private javax.swing.JButton cmdnovo;
    private javax.swing.JButton cmdpesquisar;
    private javax.swing.JButton cmdprimeiro;
    private javax.swing.JButton cmdproximo;
    private javax.swing.JButton cmdsalvar;
    private javax.swing.JButton cmdultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcodusuario;
    private javax.swing.JPasswordField txtconfsenha;
    private javax.swing.JTextField txtnome;
    private javax.swing.JPasswordField txtsenha;
    private javax.swing.JTextField txtsobrenome;
    // End of variables declaration//GEN-END:variables
}
