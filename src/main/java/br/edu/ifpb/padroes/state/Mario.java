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
    
    private enum EstadoMario{
        PEQUENO, GRANDE, FLOR, PENA;
    }
    
    private EstadoMario estadoAtual;
    
    public void levarDano(){
        if(estadoAtual == EstadoMario.PEQUENO){
            System.out.println("Game Over");
            return;
        }
         if(estadoAtual == EstadoMario.GRANDE){
            System.out.println("Mario oltou ao estado Pequeno");
            this.estadoAtual = EstadoMario.PEQUENO;
        }
        
         if(estadoAtual == EstadoMario.FLOR){
             System.out.println("Mario oltou ao estado Grande");
             this.estadoAtual = EstadoMario.GRANDE;
         }
         
         if(estadoAtual == EstadoMario.PENA){
             System.out.println("Mario oltou ao estado Flor");
             this.estadoAtual = EstadoMario.FLOR;
         }
    }   
    
    public void pegarCogumelo(){
        
    }
    
    public void pegarFlor(){
        
    }
    
    public void pegarPena(){
        
    }
}
