/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Carlos
 */
public class Carros {
    private String cor;
    private String modelo;
    private String marca;
    private int numero;
    private String tagEPC;
    private String equipe;
    private Pilotos piloto;

    public Carros(String cor, String modelo, String marca, int numero, String tagEPC) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
        this.numero = numero;
        this.tagEPC = tagEPC;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumero() {
        return numero;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Pilotos getPiloto() {
        return piloto;
    }

    public void setPiloto(Pilotos piloto) {
        this.piloto = piloto;
    }

    public String getTagEPC() {
        return tagEPC;
    }
    
}
