package Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
    private Socket cliente;

    public ClienteTCP(String ip, int portaDeRede) {
        this.ip = ip;
        this.portaDeRede = portaDeRede;
    }
    
    
    public void estabelecerConexão(){
        try {
            cliente = new Socket(ip, portaDeRede);                        
        } catch (IOException ex) {
            Logger.getLogger(ClienteTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String enviarArquivoJSON(String stringJSON) throws IOException{
        OutputStream output = cliente.getOutputStream();
        DataOutputStream outputStream = new DataOutputStream(output);
        outputStream.writeUTF(stringJSON);
        outputStream.flush();    
        InputStream input = cliente.getInputStream();     
        DataInputStream inputStream = new DataInputStream(input);
        String stringJSON2 = inputStream.readUTF();
        outputStream.close();
        return stringJSON2;
    }

}
