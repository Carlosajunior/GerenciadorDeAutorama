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
    private String nomeDaEquipeDoPiloto;
    private int idPiloto;
    private String nacionalidade;
    private String apelido;
    private String dataDeNascimento;
    private Carros carro;
    private Equipe equipe;
    private boolean emAtividade;
    private int pontuacaoPiloto = 0;

    public Pilotos(String nomeDoPiloto, String nomeDaEquipeDoPiloto, int idPiloto, String nacionalidade, String apelido, String dataDeNascimento, Carros carro, Equipe equipe, boolean emAtividade) {
        this.nomeDoPiloto = nomeDoPiloto;
        this.nomeDaEquipeDoPiloto = nomeDaEquipeDoPiloto;
        this.idPiloto = idPiloto;
        this.nacionalidade = nacionalidade;
        this.apelido = apelido;
        this.dataDeNascimento = dataDeNascimento;
        this.carro = carro;
        this.equipe = equipe;
        this.emAtividade = emAtividade;
    }

    public Pilotos(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeDoPiloto() {
        return nomeDoPiloto;
    }

    public void setNomeDoPiloto(String nomeDoPiloto) {
        this.nomeDoPiloto = nomeDoPiloto;
    }

    public String getNomeDaEquipeDoPiloto() {
        return nomeDaEquipeDoPiloto;
    }

    public void setNomeDaEquipeDoPiloto(String nomeDaEquipeDoPiloto) {
        this.nomeDaEquipeDoPiloto = nomeDaEquipeDoPiloto;
    }

    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
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

    public boolean isEmAtividade() {
        return emAtividade;
    }

    public void setEmAtividade(boolean emAtividade) {
        this.emAtividade = emAtividade;
    }

    public int getPontuacaoPiloto() {
        return pontuacaoPiloto;
    }

    public void setPontuacaoPiloto(int pontuacaoPiloto) {
        this.pontuacaoPiloto = pontuacaoPiloto;
    }

    
}
