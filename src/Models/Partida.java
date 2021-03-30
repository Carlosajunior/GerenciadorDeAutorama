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
    private int horas;
    private int minutos;
    private int segundos;

    public Partida(int numeroDeVoltas, Pista pista, ListaEncadeada listaPilotosEmAtividade, int horas, int minutos, int segundos) {
        this.numeroDeVoltas = numeroDeVoltas;
        this.pista = pista;
        this.listaPilotosEmAtividade = listaPilotosEmAtividade;
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getNumeroDeVoltas() {
        return numeroDeVoltas;
    }

    public void setNumeroDeVoltas(int numeroDeVoltas) {
        this.numeroDeVoltas = numeroDeVoltas;
    }

    public Pista getPista() {
        return pista;
    }

    public void setPista(Pista pista) {
        this.pista = pista;
    }

    public ListaEncadeada getListaPilotosEmAtividade() {
        return listaPilotosEmAtividade;
    }

    public void setListaPilotosEmAtividade(ListaEncadeada listaPilotosEmAtividade) {
        this.listaPilotosEmAtividade = listaPilotosEmAtividade;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    
}
