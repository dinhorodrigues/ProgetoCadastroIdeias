/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Dinho
 */
public class ModeloIdeias {
    private String nome;
    private int codDesc;
    private String descricao;
    private int viabilidade;
    private String dataCad;
    private String dataIdentificacao;
    private String situacao;
    private String conclusao;
    private String pesquisa;
    private boolean chaveAltera;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
       
    
    public void setDescricao(String des){
        this.descricao = des;
        
    }
    public String getDescricao(){
        return this.descricao;
    }
    public void setViabilidade(int viab){
        this.viabilidade = viab;
        
    }
    public int getViabilidade(){
        return this.viabilidade;
        
    }
    public void setDataCad(String data){
        this.dataCad = data;
    }
    public String getDataCad(){
        return this.dataCad;
    }
    public void setDataIdentificacao(String dataIden){
       
         this.dataIdentificacao = dataIden;
        
       
    }
    public String getDataIdentifica(){
        return this.dataIdentificacao;
    }
    public void setSituacao(String situa){
        this.situacao = situa;
    }
    public String getSituacao(){
        return this.situacao;
    }
    public void setConclusao(String con){
        this.conclusao =con;
    }
    public String getConclusao(){
        return this.conclusao;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public int getCodDesc() {
        return codDesc;
    }

    public void setCodDesc(int codDesc) {
        this.codDesc = codDesc;
    }

    /**
     * @return the chaveAtera
     */
    public boolean isChaveAtera() {
        return chaveAltera;
    }

    /**
     * @param chaveAtera the chaveAtera to set
     */
    public void setChaveAtera(boolean chaveAtera) {
        this.chaveAltera = chaveAtera;
    }
}
