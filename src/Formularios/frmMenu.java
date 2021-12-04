
package Formularios;

import Classes.Dados;

/**
 *
 * @author OBEL
 */
public class frmMenu extends javax.swing.JFrame {
private Dados clsdados;

public void setDados(Dados clsdados){
    this.clsdados = clsdados;
}
    public frmMenu() {
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

        Deskpainel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnarquivosclientessair = new javax.swing.JMenu();
        mnarquivosclientes = new javax.swing.JMenuItem();
        mnarquivosprodutos = new javax.swing.JMenuItem();
        mnarquivosusuarios = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnarquivosclientesaltsenha = new javax.swing.JMenuItem();
        mnarquivosclientesaltusuario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnmovimentacao = new javax.swing.JMenu();
        mnmovimentacaorelariosdevendas = new javax.swing.JMenuItem();
        mnmovimentacaovendas = new javax.swing.JMenuItem();
        mnajuda = new javax.swing.JMenu();
        mnajudasobre = new javax.swing.JMenuItem();
        mnajudaajuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA OBEL");

        javax.swing.GroupLayout DeskpainelLayout = new javax.swing.GroupLayout(Deskpainel);
        Deskpainel.setLayout(DeskpainelLayout);
        DeskpainelLayout.setHorizontalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );
        DeskpainelLayout.setVerticalGroup(
            DeskpainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mnarquivosclientessair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/arquivos32x32.png"))); // NOI18N
        mnarquivosclientessair.setText("Arquivos");
        mnarquivosclientessair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mnarquivosclientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnarquivosclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/clientes16x16.png"))); // NOI18N
        mnarquivosclientes.setText("Clientes");
        mnarquivosclientessair.add(mnarquivosclientes);

        mnarquivosprodutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnarquivosprodutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos16x16.png"))); // NOI18N
        mnarquivosprodutos.setText("Produtos");
        mnarquivosprodutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosprodutosActionPerformed(evt);
            }
        });
        mnarquivosclientessair.add(mnarquivosprodutos);

        mnarquivosusuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnarquivosusuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuarios16x16.jpg"))); // NOI18N
        mnarquivosusuarios.setText("Usuarios");
        mnarquivosusuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosusuariosActionPerformed(evt);
            }
        });
        mnarquivosclientessair.add(mnarquivosusuarios);
        mnarquivosclientessair.add(jSeparator3);

        mnarquivosclientesaltsenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnarquivosclientesaltsenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterarsenha16x16.png"))); // NOI18N
        mnarquivosclientesaltsenha.setText("Alterar Senha");
        mnarquivosclientesaltsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnarquivosclientesaltsenhaActionPerformed(evt);
            }
        });
        mnarquivosclientessair.add(mnarquivosclientesaltsenha);

        mnarquivosclientesaltusuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnarquivosclientesaltusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterarusuario16x16.png"))); // NOI18N
        mnarquivosclientesaltusuario.setText("Alterar Usuário");
        mnarquivosclientessair.add(mnarquivosclientesaltusuario);
        mnarquivosclientessair.add(jSeparator4);

        jMenuItem6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair16x16.png"))); // NOI18N
        jMenuItem6.setText("Sair");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        mnarquivosclientessair.add(jMenuItem6);

        jMenuBar1.add(mnarquivosclientessair);

        mnmovimentacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/movimentacao32x32.png"))); // NOI18N
        mnmovimentacao.setText("Movimentação");
        mnmovimentacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mnmovimentacaorelariosdevendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnmovimentacaorelariosdevendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatoriodevendas16x16.png"))); // NOI18N
        mnmovimentacaorelariosdevendas.setText("Relatórios de Vendas");
        mnmovimentacaorelariosdevendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnmovimentacaorelariosdevendasActionPerformed(evt);
            }
        });
        mnmovimentacao.add(mnmovimentacaorelariosdevendas);

        mnmovimentacaovendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnmovimentacaovendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas16x16.png"))); // NOI18N
        mnmovimentacaovendas.setText("Vendas");
        mnmovimentacao.add(mnmovimentacaovendas);

        jMenuBar1.add(mnmovimentacao);

        mnajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda32x32.png"))); // NOI18N
        mnajuda.setText("Ajuda");
        mnajuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        mnajudasobre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnajudasobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobre16x16.png"))); // NOI18N
        mnajudasobre.setText("Sobre");
        mnajuda.add(mnajudasobre);

        mnajudaajuda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        mnajudaajuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajuda16x16.png"))); // NOI18N
        mnajudaajuda.setText("Ajuda");
        mnajuda.add(mnajudaajuda);

        jMenuBar1.add(mnajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Deskpainel, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void mnarquivosclientesaltsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosclientesaltsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnarquivosclientesaltsenhaActionPerformed

    private void mnmovimentacaorelariosdevendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnmovimentacaorelariosdevendasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnmovimentacaorelariosdevendasActionPerformed

    private void mnarquivosusuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosusuariosActionPerformed
        //Codigo para acesso ao formulario Usuarios da Barra de Menu
        frmUsuarios fusuario = new frmUsuarios();
        fusuario.setDados(clsdados);
        Deskpainel.add(fusuario);
        fusuario.show();
    }//GEN-LAST:event_mnarquivosusuariosActionPerformed

    private void mnarquivosprodutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnarquivosprodutosActionPerformed
        //Codigo para acesso ao formulario Produtos da Barra de Menu
        frmProdutos Produtos = new frmProdutos();
        Produtos.setDados(clsdados);
        Deskpainel.add(Produtos);
        Produtos.show();
    }//GEN-LAST:event_mnarquivosprodutosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Deskpainel;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JMenu mnajuda;
    private javax.swing.JMenuItem mnajudaajuda;
    private javax.swing.JMenuItem mnajudasobre;
    private javax.swing.JMenuItem mnarquivosclientes;
    private javax.swing.JMenuItem mnarquivosclientesaltsenha;
    private javax.swing.JMenuItem mnarquivosclientesaltusuario;
    private javax.swing.JMenu mnarquivosclientessair;
    private javax.swing.JMenuItem mnarquivosprodutos;
    private javax.swing.JMenuItem mnarquivosusuarios;
    private javax.swing.JMenu mnmovimentacao;
    private javax.swing.JMenuItem mnmovimentacaorelariosdevendas;
    private javax.swing.JMenuItem mnmovimentacaovendas;
    // End of variables declaration//GEN-END:variables


}

