/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

import com.server.model.Server;
import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author josip
 */
public class main {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9000);
        
        Server server = new Server(serverSocket);
        server.startServer();
    }
}
