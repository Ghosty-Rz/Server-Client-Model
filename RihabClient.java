import java.io.DataInputStream;
import java.net.Socket;

public class RihabClient{

	public static void main (String[] args) throws Exception {
		try (Socket socket = new Socket("localhost", 7000)){
			DataInputStream in = new DataInputStream(socket.getInputStream()) ;

			String message = new String (in.readAllBytes());
			System.out.println(message);
		}
	}
}