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
public class MarioPequeno implements MarioState{

    @Override
    public MarioState levarDano() {
            System.out.println("Gamer Over");
            return null;
    }

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario virou MarioGrande");
        return new MarioGrande();
    }

    @Override
    public MarioState pegaFlor() {
        System.out.println("Mario virou Mario Grande");
        return new MarioGrande()
    }

    @Override
    public MarioState pegarPena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
