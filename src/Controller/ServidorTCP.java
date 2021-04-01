/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class ServidorTCP {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(2021);
            Socket cliente = servidor.accept();
            InputStream input = cliente.getInputStream();
            ObjectInputStream inputStream = new ObjectInputStream(input);
            String stringJSON2 = inputStream.readUTF();
            OutputStream output = cliente.getOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(output);
            outputStream.writeUTF(stringJSON2);
            servidor.close();
            cliente.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
