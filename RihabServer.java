import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataOutputStream;


public class RihabServer{
	
	public static void main(String[] args) throws Exception {

	try (ServerSocket ss = new ServerSocket(7000)) {
	    System.out.println("Server bound to port 7000");
		while (true){ //Endless loop is there to continously 1.accept a connection from the next client 2.interact with the client
			System.out.println("Listening...");
			try (Socket socket = ss.accept()) { // Here we accept the connection, opening it passively

				DataOutputStream out = new DataOutputStream(socket.getOutputStream());

				out.write("Hello i am Rihab".getBytes());
			}
		}
	}
	}
}
