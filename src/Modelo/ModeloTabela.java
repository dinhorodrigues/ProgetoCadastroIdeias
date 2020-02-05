/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ModeloTabela extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModeloTabela(ArrayList lin, String[]col){
        setLinhas(lin);
        setColunas(col);
    }
    
    
    
    public ArrayList getLinhas() {
        return linhas;
    }
    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount(){
        return this.colunas.length;
    }
    public int getRowCount(){
        return this.linhas.size();
    }
    public String getColumnName(int numColunas){
        return this.colunas[numColunas];
    }
    public Object getValueAt (int numLinhas, int numColunas){
        Object[] linha =  (Object[])getLinhas().get(numLinhas);
        
        return linha [numColunas];
    }
    
}
