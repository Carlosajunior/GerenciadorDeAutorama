/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Controller.ListaEncadeada;
import java.util.Iterator;

/**
 *
 * @author Carlos
 */
public class Equipe {
    private int iD;
    private String nome;
    private String nacionalidade;
    private int ano;
    private String apelido;
    private ListaEncadeada listaPilotos;
    private ListaEncadeada listaCarros;
    private int pontos = 0;

    public Equipe(int iD, String nome, String nacionalidade, int ano, String apelido) {
        this.iD = iD;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.ano = ano;
        this.apelido = apelido;
        this.listaCarros = new ListaEncadeada();
        this.listaPilotos = new ListaEncadeada();
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public ListaEncadeada getListaPilotos() {
        return listaPilotos;
    }

    public void adicionar(Pilotos piloto) {
        this.listaPilotos.add(piloto);
    }

    public ListaEncadeada getListaCarros() {
        return listaCarros;
    }

    public void adicionarCarros(Carros carro) {
        this.listaCarros.add(carro);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    
    public void calcularPontosDaEquipe(){
        Iterator aux = this.listaPilotos.iterator();
        Pilotos auxPiloto;
        while(aux.hasNext()){
            auxPiloto = (Pilotos) aux.next();
            this.pontos = this.pontos+ auxPiloto.getPontuacaoPiloto();
        }
    }
    
}
