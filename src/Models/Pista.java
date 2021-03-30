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
public class Pista {
    private int id;
    private String nome;
    private String pais;
    private String recordeDeMelhorVolta;
    private String nomeDoPilotRecordista;

    public Pista(int id, String nome, String pais) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRecordeDeMelhorVolta() {
        return recordeDeMelhorVolta;
    }

    public void setRecordeDeMelhorVolta(String recordeDeMelhorVolta) {
        this.recordeDeMelhorVolta = recordeDeMelhorVolta;
    }

    public String getNomeDoPilotRecordista() {
        return nomeDoPilotRecordista;
    }

    public void setNomeDoPilotRecordista(String nomeDoPilotRecordista) {
        this.nomeDoPilotRecordista = nomeDoPilotRecordista;
    }
    
    
}
