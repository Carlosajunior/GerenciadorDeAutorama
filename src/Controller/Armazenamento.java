/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Carros;
import Models.Equipe;
import Models.Pilotos;

/**
 *
 * @author Carlos
 */
public class Armazenamento {

    private ListaEncadeada carros = new ListaEncadeada();
    private ListaEncadeada pilotos = new ListaEncadeada();
    private ListaEncadeada equipe = new ListaEncadeada();

    public Armazenamento() {
    }
    
    public void armazenarCarro(Carros carro){
        this.carros.add(carro);
    }
    
    public void armazenarPiloto(Pilotos piloto){
        this.carros.add(piloto);
    }
    
    public void armazenarEquipe(Equipe equipe){
        this.carros.add(equipe);
    }

}
