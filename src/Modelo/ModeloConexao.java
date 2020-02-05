/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

/**
 *
 * @author Dinho
 */
public class ModeloConexao {
    public Statement stm; // faz pesquisa no banco
    public ResultSet rs;// armazena o resultado da pesquisa
    public String driver= "org.postgresql.Driver";// identifica o servico de banco de dados
    public String caminho = "jdbc:postgresql://localhost:5433/helloTickt";// onde esta o banco de dados
    public String usuario = "postgres";
    public String senha = "milly18";
     public Connection con ; // conexão com o banco de dados
    
    
    
    public void conectar(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            this.con = DriverManager.getConnection(caminho,usuario,senha);
           // JOptionPane.showMessageDialog(null, "conectado!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao se Conectar com o Banco de Dados!\n"+ex.getMessage());
        }
    }
    public void desconecta()// metodo responsavel para desconectar com o banco de dados
    {
        try
        {
           this.con.close();
         //  JOptionPane.showMessageDialog(null, "Banco de Dados desconectado com Sucesso!");
           
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao desconectar com o banco de dados! \n"+ex.getMessage());
        }
    }
    
    public void exePesquisaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Executar Pesquisa Conexão Banco de Dados! \n"+ex.getMessage());
        }
    }
}
