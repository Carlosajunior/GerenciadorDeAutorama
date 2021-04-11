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
public class Configuracao {
    private String ip;
    private int portaDeRede;
    private int potenciaDoSinal;
    private int taxaEmBaud;
    private String protocolo;
    private String portaSerial;
    private String regiao;
    private int antena;

    public Configuracao(String ip, int portaDeRede, int potenciaDoSinal, int taxaEmBaud, String protocolo, String portaSerial, String regiao, int antena) {
        this.ip = ip;
        this.portaDeRede = portaDeRede;
        this.potenciaDoSinal = potenciaDoSinal;
        this.taxaEmBaud = taxaEmBaud;
        this.protocolo = protocolo;
        this.portaSerial = portaSerial;
        this.regiao = regiao;
        this.antena = antena;
    }

    public String getIp() {
        return ip;
    }

    public int getPortaDeRede() {
        return portaDeRede;
    }

    public int getPotenciaDoSinal() {
        return potenciaDoSinal;
    }

    public int getTaxaEmBaud() {
        return taxaEmBaud;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public String getPortaSerial() {
        return portaSerial;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getAntena() {
        return antena;
    }
    
    
}
