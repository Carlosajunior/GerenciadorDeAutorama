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
public class Pilotos {
    private String nomeDoPiloto;
    private int idPiloto;
    private String nacionalidade;
    private String apelido;
    private String dataDeNascimento;
    private Carros carro;
    private Equipe equipe;
    private String emAtividade;
    private int pontuacaoPiloto = 0;

    public Pilotos(String nomeDoPiloto, int idPiloto, String nacionalidade, String apelido, String dataDeNascimento, String emAtividade) {
        this.nomeDoPiloto = nomeDoPiloto;
        this.idPiloto = idPiloto;
        this.nacionalidade = nacionalidade;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.emAtividade = emAtividade;
    }

    public String getNomeDoPiloto() {
        return nomeDoPiloto;
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }


    public String getApelido() {
        return apelido;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String isEmAtividade() {
        return emAtividade;
    }

    public int getPontuacaoPiloto() {
        return pontuacaoPiloto;
    }

    public void setPontuacaoPiloto(int pontuacaoPiloto) {
        this.pontuacaoPiloto = pontuacaoPiloto;
    }

    public String getEmAtividade() {
        return emAtividade;
    }

    public void setEmAtividade(String emAtividade) {
        this.emAtividade = emAtividade;
    }

    
}
