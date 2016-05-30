/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.state;

/**
 *
 * @author jederson
 */
public class Mario {
    
    private     MarioState estadoAtual;
    
    public void levarDano(){
        this.estadoAtual = estadoAtual.levarDano();
    }   
    
    public void pegarCogumelo(){
        this.estadoAtual = estadoAtual.pegarCogumelo();
    }
    
    public void pegarFlor(){
        this.estadoAtual = estadoAtual.pegaFlor();
    }
    
    public void pegarPena(){
        this.estadoAtual = estadoAtual.pegarPena();
    }
}
