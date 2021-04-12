/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONObject;

/**
 *
 * @author Carlos
 */
public class Database {

    private File tmpDir;
    private File tmpDir2;
    private File tmpDir3;
    private File tmpDir4;
    private File tmpDir5;
    private File tmpDir6;
    private boolean exists;
    private boolean exists2;
    private boolean exists3;
    private boolean exists4;
    private boolean exists5;
    private boolean exists6;
    private Armazenamento armazenamento;

    public Database() {
        tmpDir = new File("Configuracao.json");
        tmpDir2 = new File("Carros.json");
        tmpDir3 = new File("Equipe.json");
        tmpDir4 = new File("Piloto.json");
        tmpDir5 = new File("Partida.json");
        tmpDir6 = new File("Pista.json");
        armazenamento = new Armazenamento();
    }

    public boolean verificaDatabase() {
        exists = tmpDir.exists();
        exists2 = tmpDir2.exists();
        exists3 = tmpDir3.exists();
        exists4 = tmpDir4.exists();
        exists5 = tmpDir5.exists();
        exists6 = tmpDir6.exists();
        if (exists == true && exists2 == true && exists3 == true && exists4 == true && exists5 == true && exists6 == true) {
            return true;
        }
        return false;
    }
    
    public Armazenamento carregarDados() throws FileNotFoundException{
        this.carregarDadosCarros();
        this.carregarDadosConfiguracaoRFID();
        this.carregarDadosEquipe();
        this.carregarDadosPartida();
        this.carregarDadosPiloto();
        this.carregarDadosPista();
        this.carregarDadosInformacoesTAGS();
        return this.armazenamento;
    }

    private void carregarDadosCarros() throws FileNotFoundException {
        JSONObject Carros;
        Carros carro;
        Scanner scan = new Scanner(new File("Carros.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Carros = new JSONObject(stringJSON);
            carro = new Carros(Carros.getString("Cor do carro"), Carros.getString("Modelo do carro"), Carros.getString("Marca do carro"), Carros.getInt("Numero do carro"), Carros.getString("EPC"));
            armazenamento.armazenarCarro(carro);
        }
    }

    private void carregarDadosPiloto() throws FileNotFoundException {
        JSONObject Piloto;
        Pilotos piloto;
        Scanner scan = new Scanner(new File("Piloto.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Piloto = new JSONObject(stringJSON);
            piloto = new Pilotos(Piloto.getString("Nome"), Piloto.getInt("ID do piloto"), Piloto.getString("Nacionalidade"), Piloto.getString("Apelido"), Piloto.getString("Data de Nascimento"), Piloto.getString("Status do piloto"));
            armazenamento.armazenarPiloto(piloto);
        }
    }

    private void carregarDadosEquipe() throws FileNotFoundException {
        JSONObject Equipe;
        Equipe equipe;
        Scanner scan = new Scanner(new File("Equipe.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Equipe = new JSONObject(stringJSON);
            equipe = new Equipe(Equipe.getInt("ID"), Equipe.getString("Nome da equipe"), Equipe.getString("Nacionalidade da equipe"), Equipe.getInt("Ano"), Equipe.getString("Apelido da equipe"));
            armazenamento.armazenarEquipe(equipe);
        }
    }

    private void carregarDadosPartida() throws FileNotFoundException {
        JSONObject Partida;
        Partida partida;
        Scanner scan = new Scanner(new File("Partida.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Partida = new JSONObject(stringJSON);
            partida = new Partida(Partida.getInt("Numero de voltas"), this.armazenamento.getPista(), this.armazenamento.pilotosEmAtividade(), Partida.getInt("Minutos"));
            armazenamento.armazenarPartida(partida);
        }
    }

    private void carregarDadosPista() throws FileNotFoundException {
        JSONObject Pista;
        Pista pista;
        Scanner scan = new Scanner(new File("Partida.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Pista = new JSONObject(stringJSON);
            pista = new Pista(Pista.getInt("ID"), Pista.getString("Nome da pista"), Pista.getString("Pais da pista"));
            armazenamento.armazenarPista(pista);
        }
    }
    
    private void carregarDadosConfiguracaoRFID() throws FileNotFoundException {
        JSONObject configuracaoRFID;
        Configuracao configuracao;
        Scanner scan = new Scanner(new File("Configuracao.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            configuracaoRFID = new JSONObject(stringJSON);
            configuracao = new Configuracao(configuracaoRFID.getString("ip"), configuracaoRFID.getInt("porta de rede"), configuracaoRFID.getInt("potencia do sinal"), configuracaoRFID.getInt("taxa em baud"), configuracaoRFID.getString("protocolo"), configuracaoRFID.getString("porta serial"), configuracaoRFID.getString("regiao"), configuracaoRFID.getInt("antena"));
            armazenamento.armazenarConfiguracao(configuracao);
        }
    }
    
    private void carregarDadosInformacoesTAGS() throws FileNotFoundException {
        JSONObject Tag;
        Tag tag;
        Scanner scan = new Scanner(new File("informacoesTAG.json"));
        scan.useDelimiter("\n");
        String stringJSON;
        while (scan.hasNext()) {
            stringJSON = scan.next();
            Tag = new JSONObject(stringJSON);
            tag = new Tag(Tag.getString("epc"), Tag.getString("tempo"));
            armazenamento.armazenarTags(tag);
        }
    }
}
