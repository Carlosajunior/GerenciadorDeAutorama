package Controller;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ClienteTCP {
    private String ip;
    private int portaDeRede;
    private String confirmação;

    public ClienteTCP(String ip, int portaDeRede) {
        this.ip = ip;
        this.portaDeRede = portaDeRede;
    }
    
    
    public void estabelecerConexão(){
        try {
            Socket cliente = new Socket(ip, portaDeRede);            
            confirmação = "conexão estabelecida com o seguinte endereço de IP: "+cliente.getInetAddress();    
        } catch (IOException ex) {
            Logger.getLogger(ClienteTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getConfirmação() {
        return confirmação;
    }
    
}
