/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Carros;
import Models.Equipe;
import Models.Partida;
import Models.Pilotos;
import Models.Pista;
import java.util.Iterator;

/**
 *
 * @author Carlos
 */
public class Armazenamento {

    private ListaEncadeada carros = new ListaEncadeada();
    private ListaEncadeada pilotos = new ListaEncadeada();
    private ListaEncadeada equipe = new ListaEncadeada();
    private Pista pista;
    private Partida partida;
    
    public Armazenamento() {
    }

    public Pista getPista() {
        return pista;
    }

    public void armazenarPista(Pista pista) {
        this.pista = pista;
    }

    public Partida getPartida() {
        return partida;
    }

    public void armazenarPartida(Partida partida) {
        this.partida = partida;
    }
    
    public void armazenarCarro(Carros carro) {
        this.carros.add(carro);
    }

    public void armazenarPiloto(Pilotos piloto) {
        this.pilotos.add(piloto);
    }

    public void armazenarEquipe(Equipe equipe) {
        this.equipe.add(equipe);
    }

    public ListaEncadeada getCarros() {
        return carros;
    }

    public ListaEncadeada getPilotos() {
        return pilotos;
    }

    public ListaEncadeada getEquipe() {
        return equipe;
    }

    public Carros buscarCarro(String modeloCarro) {
        Iterator iterador = this.carros.iterator();
        Carros auxCarro;
        while (iterador.hasNext()) {
            auxCarro = (Carros) iterador.next();
            if (modeloCarro.equalsIgnoreCase(auxCarro.getModelo()) == true) {
                if (auxCarro.getPiloto() == null) {
                    return auxCarro;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
    
    public Carros buscarCarroComPiloto(String modeloCarro) {
        Iterator iterador = this.carros.iterator();
        Carros auxCarro;
        while (iterador.hasNext()) {
            auxCarro = (Carros) iterador.next();
            if (modeloCarro.equalsIgnoreCase(auxCarro.getModelo()) == true) 
                    return auxCarro;
        }
        return null;
    }
    
    public Equipe buscarEquipe(String nomeEquipe) {
        Iterator iterador = this.equipe.iterator();
        Equipe auxEquipe;
        while (iterador.hasNext()) {
            auxEquipe = (Equipe) iterador.next();
            if (nomeEquipe.equalsIgnoreCase(auxEquipe.getNome()) == true) {
                return auxEquipe;
            }
        }
        return null;
    }
    
    public Pilotos buscarPiloto(String nomePiloto) {
        Iterator iterador = this.pilotos.iterator();
        Pilotos auxPiloto;
        while (iterador.hasNext()) {
            auxPiloto = (Pilotos) iterador.next();
            if (nomePiloto.equalsIgnoreCase(auxPiloto.getNomeDoPiloto()) == true) {
                if(auxPiloto.isEmAtividade().equalsIgnoreCase("SIM"))
                    return auxPiloto;
                else
                    return null;
            }
        }
        return null;
    }
    
    public ListaEncadeada pilotosEmAtividade(){
        ListaEncadeada pilotosEmAtividade = new ListaEncadeada();
        Pilotos auxPiloto;
        Iterator iterador = this.pilotos.iterator();
        while(iterador.hasNext()){
            auxPiloto = (Pilotos) iterador.next();
            if(auxPiloto.getEmAtividade().equalsIgnoreCase("SIM"))
                this.pilotosEmAtividade().add(auxPiloto);
        }
        return this.pilotosEmAtividade();
    }
}
