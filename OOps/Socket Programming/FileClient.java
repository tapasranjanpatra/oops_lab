import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class FileClient {

    public static void main(String[] args) throws IOException {
        // Connect to the server at localhost on port 8080
        Socket socket = new Socket("localhost", 8080);
        System.out.println("Connected to the server.");

        // Choose the file to send to the server
        File fileToSend = new File("file_to_send.txt");

        // Get an OutputStream to send data to the server
        OutputStream outputStream = socket.getOutputStream();

        // Create a buffer to hold the data being read from the file
        byte[] buffer = new byte[1024];

        // Read the data from the file and write it to the server
        int bytesRead;
        FileInputStream fileInputStream = new FileInputStream(fileToSend);
        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        // Close the streams and socket
        outputStream.close();
        fileInputStream.close();
        socket.close();

        System.out.println("File data sent successfully.");
    }
}
