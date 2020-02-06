/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import Controle.ControleIdeias;
import Modelo.ModeloConexao;

import Modelo.ModeloIdeias;
import Modelo.ModeloTabela;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;



import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;


/**
 *
 * @author Dinho
 */
public class formInicial extends javax.swing.JFrame {

    ModeloIdeias mod = new ModeloIdeias();
    ModeloConexao conex = new ModeloConexao();
    Controle.ControleIdeias controle = new ControleIdeias();
   java.util.Date dataSistem = new java.util.Date();
   SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
   String data = sdf.format(dataSistem);
   int flag = 0;     
    public formInicial() {
        initComponents();
      preenceherTabela("select * from tab_ideias order by viabilidade desc");
      atualizaDados();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDescricao = new javax.swing.JTextField();
        jTextFieldCod = new javax.swing.JTextField();
        jComboBoxViabilidade = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSituacao = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFildData = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelDataIdentifica = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonPessoa = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaIdeias = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabelAconcluir = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxPesquisaSituacao = new javax.swing.JComboBox();
        jButtonNovo = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonPesquisa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Codigo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        jLabel2.setText("Descrição");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 70, -1));

        jLabel3.setText("Viab.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, -1));

        jTextFieldDescricao.setEnabled(false);
        jPanel2.add(jTextFieldDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 180, -1));

        jTextFieldCod.setEnabled(false);
        jPanel2.add(jTextFieldCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, -1));

        jComboBoxViabilidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        jComboBoxViabilidade.setSelectedIndex(-1);
        jComboBoxViabilidade.setEnabled(false);
        jPanel2.add(jComboBoxViabilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        jLabel4.setText("Situação");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 70, -1));

        jComboBoxSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Registrada", "Em Desenvolvimento", "Cancelada", "Desenvolvida" }));
        jComboBoxSituacao.setSelectedIndex(-1);
        jComboBoxSituacao.setEnabled(false);
        jPanel2.add(jComboBoxSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 150, -1));

        jLabel5.setText("Data Cadastro");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        jFormattedTextFildData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jFormattedTextFildData.setEnabled(false);
        jPanel2.add(jFormattedTextFildData, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 90, -1));

        jLabel6.setText("Data Identificação");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 100, -1));
        jPanel2.add(jLabelDataIdentifica, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel8.setText("Nome Pessoa");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 80, -1));

        jButtonPessoa.setText("+");
        jButtonPessoa.setEnabled(false);
        jButtonPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPessoaActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, 50, -1));

        jTextFieldNome.setEnabled(false);
        jPanel2.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 910, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        TabelaIdeias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TabelaIdeias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaIdeiasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TabelaIdeiasMouseEntered(evt);
            }
        });
        TabelaIdeias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaIdeiasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaIdeiasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaIdeias);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 890, 320);

        jLabel9.setText("Total de Ideias:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, 340, 90, 14);

        jLabelAconcluir.setText("0");
        jPanel3.add(jLabelAconcluir);
        jLabelAconcluir.setBounds(110, 340, 50, 14);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 910, 370));

        jLabel7.setText("Pesquisa Por Situação");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 140, -1));

        jComboBoxPesquisaSituacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Registrada", "Em Desenvolvimento", "Cancelada", "Desenvolvida" }));
        jComboBoxPesquisaSituacao.setSelectedIndex(-1);
        jComboBoxPesquisaSituacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBoxPesquisaSituacaoMouseEntered(evt);
            }
        });
        jComboBoxPesquisaSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisaSituacaoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxPesquisaSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 150, -1));

        jButtonNovo.setText("Nova Ideia");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 30));

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setEnabled(false);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, 30));

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, 30));

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, 30));

        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 100, -1));

        jButton1.setText("Limpar Filtro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 937, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(973, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPessoaActionPerformed
       String nome = JOptionPane.showInputDialog("Digite o Nome da Pessoa Que deseja Cadastrar!");
            
            jTextFieldNome.setText(nome);
            mod.setDataIdentificacao(data);
            mod.setChaveAtera(true);
            
       
            jTextFieldNome.setEnabled(false);
            
        
      
       
    }//GEN-LAST:event_jButtonPessoaActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
       flag=1;
        jTextFieldDescricao.setEnabled(true);
        jTextFieldNome.setText("");
       
        jTextFieldDescricao.setText("");
        jComboBoxSituacao.setEnabled(true);
        jComboBoxSituacao.setSelectedIndex(-1);
        jComboBoxViabilidade.setEnabled(true);
        jComboBoxViabilidade.setSelectedIndex(-1);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jFormattedTextFildData.setText(this.data); 
        jButtonPessoa.setEnabled(true);
        
       
        
        
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        if(mod.isChaveAtera()==true){
            jButtonPessoa.setEnabled(false);
        }else
        {
            if(mod.isChaveAtera()==false)
            jButtonPessoa.setEnabled(true);
        }
        
        flag=2;
        jTextFieldDescricao.setEnabled(true);
        jComboBoxSituacao.setEnabled(true);
        jComboBoxViabilidade.setEnabled(true);
        
        
        jButtonSalvar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
       
            
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void TabelaIdeiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaIdeiasMouseClicked
        jButtonAlterar.setEnabled(true);
        preencherFormulario();
       
    }//GEN-LAST:event_TabelaIdeiasMouseClicked

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       jTextFieldCod.setText("");
       jButtonPessoa.setEnabled(false);
       jTextFieldDescricao.setText("");
       jButtonAlterar.setEnabled(false);
       jComboBoxSituacao.setSelectedIndex(-1);
       jTextFieldDescricao.setEnabled(false);
       jComboBoxSituacao.setEnabled(false);
       jComboBoxViabilidade.setEnabled(false);
       jComboBoxViabilidade.setSelectedIndex(-1);
      
       jTextFieldNome.setText("");
       jLabelDataIdentifica.setText("");
       jFormattedTextFildData.setText("");
       jButtonNovo.setEnabled(true);
       jButtonSalvar.setEnabled(false);
       jButtonCancelar.setEnabled(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed
    public void preencherFormulario(){
        int cod = Integer.parseInt(""+ TabelaIdeias.getValueAt(TabelaIdeias.getSelectedRow(), 0));
        mod.setPesquisa(String.valueOf(cod));
        controle.consultar(mod);
        jTextFieldCod.setText(String.valueOf(mod.getCodDesc()));
        jTextFieldDescricao.setText(mod.getDescricao());
        jLabelDataIdentifica.setText(mod.getDataIdentifica());
        jFormattedTextFildData.setText(mod.getDataCad());
        jLabelDataIdentifica.setText(mod.getDataIdentifica());
        jTextFieldNome.setText(mod.getNome());
        jComboBoxSituacao.setSelectedItem(mod.getSituacao());
        mod.isChaveAtera();
        jComboBoxViabilidade.setSelectedIndex(mod.getViabilidade()-1);
      
        
    }
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
       
      
        
        if(flag==1){
          
        mod.setDescricao(jTextFieldDescricao.getText());
        mod.setViabilidade((jComboBoxViabilidade.getSelectedIndex()+1));
        mod.setDataCad(jFormattedTextFildData.getText());
        mod.setSituacao(String.valueOf(jComboBoxSituacao.getSelectedItem()));
        mod.setNome(jTextFieldNome.getText());
       controle.salvar(mod);
        
        
       jTextFieldCod.setText("");
       jFormattedTextFildData.setText("");
       jTextFieldCod.setEnabled(false);
       jTextFieldDescricao.setText("");
       jTextFieldDescricao.setEnabled(false);
       jComboBoxSituacao.setSelectedIndex(-1);
       jComboBoxSituacao.setEnabled(false);
       jComboBoxViabilidade.setSelectedIndex(-1);
       jComboBoxViabilidade.setEnabled(false);
       jTextFieldNome.setText("");
       jLabelDataIdentifica.setText("");
       jButtonNovo.setEnabled(true);
       jButtonSalvar.setEnabled(false);
       }
       else{
           if(flag==2){
                if (jComboBoxSituacao.getSelectedItem()=="Desenvolvida"){
               mod.setConclusao("Desenvolvida");
           }
           else{
               if (jComboBoxSituacao.getSelectedItem()=="Cancelada"){
                   mod.setConclusao("Cancelada");
               }
           }
        mod.setNome(jTextFieldNome.getText());
        mod.setDescricao(jTextFieldDescricao.getText());
        mod.setSituacao(String.valueOf(jComboBoxSituacao.getSelectedItem()));
        mod.setViabilidade((jComboBoxViabilidade.getSelectedIndex()+1));
        mod.setDataCad(jFormattedTextFildData.getText());
       
        
        mod.setCodDesc(Integer.parseInt(jTextFieldCod.getText()));
        
       controle.editar(mod);
       jTextFieldNome.setText("");
       jTextFieldCod.setText("");
       jFormattedTextFildData.setText("");
       jTextFieldCod.setEnabled(false);
       jTextFieldDescricao.setText("");
       jTextFieldDescricao.setEnabled(false);
       jComboBoxSituacao.setSelectedIndex(-1);
       jComboBoxSituacao.setEnabled(false);
       jComboBoxViabilidade.setSelectedIndex(-1);
       jComboBoxViabilidade.setEnabled(false);
       
        jLabelDataIdentifica.setText("");
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.setText("");
      
      
       jButtonNovo.setEnabled(true);
              
           }
       }
       preenceherTabela("select * from tab_ideias order by viabilidade desc");
        jButtonPessoa.setEnabled(false);
        atualizaDados();
       
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    private void jComboBoxPesquisaSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisaSituacaoActionPerformed
      
    }//GEN-LAST:event_jComboBoxPesquisaSituacaoActionPerformed

    private void jComboBoxPesquisaSituacaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxPesquisaSituacaoMouseEntered
     
    }//GEN-LAST:event_jComboBoxPesquisaSituacaoMouseEntered

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
       mod.setPesquisa(String.valueOf(jComboBoxPesquisaSituacao.getSelectedItem()));
       preenceherTabela("select * from tab_ideias where situacao='"+mod.getPesquisa()+"'"+" order by viabilidade desc");
       atualizaDados();
    }//GEN-LAST:event_jButtonPesquisaActionPerformed
    public void atualizaDados(){
          for(int i =0; i<TabelaIdeias.getRowCount();i++){
           jLabelAconcluir.setText(String.valueOf(i+1));
}
    
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preenceherTabela("select * from tab_ideias order by viabilidade desc");
          jComboBoxPesquisaSituacao.setSelectedIndex(-1);
          jTextFieldCod.setText("");
          jTextFieldDescricao.setText("");
          jTextFieldNome.setText("");
          jFormattedTextFildData.setText("");
          jLabelDataIdentifica.setText("");
          jComboBoxSituacao.setSelectedIndex(-1);
          jComboBoxViabilidade.setSelectedIndex(-1);
          atualizaDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelaIdeiasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaIdeiasKeyPressed
      
       
    }//GEN-LAST:event_TabelaIdeiasKeyPressed

    private void TabelaIdeiasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaIdeiasMouseEntered
        
    }//GEN-LAST:event_TabelaIdeiasMouseEntered

    private void TabelaIdeiasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaIdeiasKeyReleased
           if(evt.getKeyCode()== KeyEvent.VK_UP || evt.getKeyCode()==KeyEvent.VK_DOWN){
             preencherFormulario(); 
         }
    }//GEN-LAST:event_TabelaIdeiasKeyReleased
     private void preenceherTabela(String sql) {
         ArrayList dados = new ArrayList();
         String colunas [] = new String[]{"Cod.","Data Cadastro","Descrição","Viabilidade","Status"};
         
         conex.conectar();
         conex.exePesquisaSql(sql);
        try {
            conex.rs.next();
           
            
            do {                
                  dados.add(new Object[]{conex.rs.getInt("coddesc"),conex.rs.getString("dataCad"),conex.rs.getString("descricao")
                 ,conex.rs.getInt("viabilidade"),conex.rs.getString("conclusao")});
            } while (conex.rs.next());
            
          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Não existe registro!");
        }
         
        
        
        
         ModeloTabela modelo = new ModeloTabela(dados, colunas);
         TabelaIdeias.setModel(modelo);
         
         TabelaIdeias.getColumnModel().getColumn(0).setPreferredWidth(100);///tamanho da coluna;
         TabelaIdeias.getColumnModel().getColumn(0).setResizable(false);//usuario nao edita o tamanho da coluna
         TabelaIdeias.getColumnModel().getColumn(1).setPreferredWidth(200);
         TabelaIdeias.getColumnModel().getColumn(1).setResizable(false);
         TabelaIdeias.getColumnModel().getColumn(2).setPreferredWidth(350);
         TabelaIdeias.getColumnModel().getColumn(2).setResizable(false);
         TabelaIdeias.getColumnModel().getColumn(3).setPreferredWidth(100);
         TabelaIdeias.getColumnModel().getColumn(3).setResizable(false);
         TabelaIdeias.getColumnModel().getColumn(4).setPreferredWidth(100);
         TabelaIdeias.getColumnModel().getColumn(4).setResizable(false);
       
         TabelaIdeias.getTableHeader().setReorderingAllowed(false);//nao pode ordenar
         TabelaIdeias.setAutoResizeMode(TabelaIdeias.AUTO_RESIZE_OFF);// tabela nao pode ser redimicionada
         TabelaIdeias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);// so pode selcionar uma linha por vez
         TabelaIdeias.setAutoCreateRowSorter(true);
         
         
    
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
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaIdeias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonPessoa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox jComboBoxPesquisaSituacao;
    private javax.swing.JComboBox jComboBoxSituacao;
    private javax.swing.JComboBox jComboBoxViabilidade;
    private javax.swing.JFormattedTextField jFormattedTextFildData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAconcluir;
    private javax.swing.JLabel jLabelDataIdentifica;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCod;
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

   
}
