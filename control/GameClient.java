package spaceship.control;

import java.io.*;
import java.net.Socket;

/**
 * Created by nate on 6/26/15.
 */
public class GameClient
  {
    private final BufferedReader reader;
    private final BufferedWriter writer;

    public GameClient(String host, int port, String username, String password) throws IOException
      {
        Socket socket = new Socket(host, port);
        this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        this.writer.write(username + " " + password + "\n");
        this.writer.flush();
      }

    public Response send(Command command) throws IOException
      {
        this.writer.write(command.getText() + "\n");
        this.writer.flush();
        return new Response(this.reader.readLine());
      }
  }
