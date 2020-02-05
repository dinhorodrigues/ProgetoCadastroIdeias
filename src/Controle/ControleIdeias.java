/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.ModeloConexao;
import Modelo.ModeloIdeias;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author Dinho
 */
public class ControleIdeias {
    ModeloConexao conex = new ModeloConexao();
    ModeloIdeias  ideia = new ModeloIdeias();
    
    
    public void salvar(ModeloIdeias mod){
        conex.conectar();
        
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into tab_ideias (dataCad,descricao,situacao,viabilidade,chavealtera)values(?,?,?,?,?)");
            pst.setString(1, mod.getDataCad());
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getSituacao());
            pst.setInt(4,mod.getViabilidade());
            pst.setBoolean(5, mod.isChaveAtera());
            pst.execute();
            JOptionPane.showMessageDialog(null, "ideia cadastrada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Salvar dados!");
        
    }
        conex.desconecta();
    }
    public void editar(ModeloIdeias mod){
        conex.conectar();
         try {
            PreparedStatement pst = conex.con.prepareStatement("update tab_ideias set datacad=?,descricao=?"
                    + ",situacao=?,viabilidade=?,nome_pessoa=?,dataidentifica=?,chavealtera=?,conclusao=? where coddesc=?");
            pst.setString(1, mod.getDataCad());
            pst.setString(2, mod.getDescricao());
            pst.setString(3, mod.getSituacao());
            pst.setInt(4,mod.getViabilidade());
            
            
            pst.setString(5,mod.getNome());
            pst.setString(6, mod.getDataIdentifica());
            pst.setBoolean(7, mod.isChaveAtera());
            pst.setString(8, mod.getConclusao());
            pst.setInt(9, mod.getCodDesc());
            pst.execute();
            
           JOptionPane.showMessageDialog(null, "ideia alterada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar Aterar dados!"+ ex);
        conex.desconecta();
    }
    }
    public ModeloIdeias consultar(ModeloIdeias mod){
        conex.conectar();
        conex.exePesquisaSql("select * from tab_ideias where coddesc='"+ mod.getPesquisa()+"'");
        try {
            conex.rs.next();
            mod.setCodDesc(conex.rs.getInt("coddesc"));
            mod.setDataCad(conex.rs.getString("datacad"));
            mod.setDataIdentificacao(conex.rs.getString("dataidentifica"));
            mod.setNome(conex.rs.getString("nome_pessoa"));
            mod.setDescricao(conex.rs.getString("descricao"));
            mod.setSituacao(conex.rs.getString(("situacao")));
            mod.setViabilidade(conex.rs.getInt("viabilidade"));
            mod.setChaveAtera(conex.rs.getBoolean("chavealtera"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao pesquisar!");
        }
        return mod;
        
    }
    public ModeloIdeias filtroPesquisa(ModeloIdeias mod){
        conex.conectar();
        conex.exePesquisaSql("select * from tab_ideias where situacao='"+ mod.getPesquisa()+"'");
        return mod;
    }
}
