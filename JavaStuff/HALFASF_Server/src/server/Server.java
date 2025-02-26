package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 
 * There where that server code gonna go
 * @author j
 *
 */
public abstract class Server {
	private int portNumber;
	ServerSocket serverSocket;
	Socket clientSocket; //We're just gonna acecept one client
	
	
	public Server(int portN) {
		portNumber = portN;
		serverSocket = null;
		clientSocket = null;
	}
	 
	boolean serverStart() {
		try {
			//Don't allow for 0 server socket santize in main
			if (serverSocket == null)
				serverSocket = new ServerSocket(portNumber);
			
		} catch (Exception e) {
			System.out.println("There was a server starting error " + e);
			return false;
		}
		
		return true;
		
	}
	
	
	boolean acceptClients() throws IOException {
		clientSocket = serverSocket.accept(); //listen for clients
		
		return true;
		
	}
	
	
}
