/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controller.ListaEncadeada;

/**
 *
 * @author Carlos
 */
public class Partida {
    private int numeroDeVoltas;
    private Pista pista;
    private ListaEncadeada listaPilotosEmAtividade;
    private int minutos;

    public Partida(int numeroDeVoltas, Pista pista, ListaEncadeada listaPilotosEmAtividade, int minutos) {
        this.numeroDeVoltas = numeroDeVoltas;
        this.pista = pista;
        this.listaPilotosEmAtividade = listaPilotosEmAtividade;
        this.minutos = minutos;
    }

    public int getNumeroDeVoltas() {
        return numeroDeVoltas;
    }

    public Pista getPista() {
        return pista;
    }

    public ListaEncadeada getListaPilotosEmAtividade() {
        return listaPilotosEmAtividade;
    }

    public int getMinutos() {
        return minutos;
    }
}
