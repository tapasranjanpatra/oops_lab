import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

    public static void main(String[] args) throws IOException {
        // Create a server socket on port 8080
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server started. Listening to the port 8080.");

        // Wait for a client to connect
        Socket socket = serverSocket.accept();
        System.out.println("Client connected.");

        // Get an InputStream to read data from the client
        InputStream inputStream = socket.getInputStream();

        // Create a FileOutputStream to write the data to a file
        FileOutputStream fileOutputStream = new FileOutputStream("received_file.txt");

        // Create a buffer to hold the data being read from the client
        byte[] buffer = new byte[1024];

        // Read the data from the client into the buffer and write it to the file
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, bytesRead);
        }

        // Close the streams and sockets
        fileOutputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

        System.out.println("File received successfully.");
    }
}
