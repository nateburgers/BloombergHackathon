package spaceship;

import spaceship.control.Command;
import spaceship.control.GameClient;
import spaceship.control.Response;
import spaceship.data.Status;

/**
 * Created by nate on 6/26/15.
 */
public class Main
  {
    public static void main(String[] arguments)
      {
        try {
          GameClient client = new GameClient("localhost", 17429, "a", "a");
          Response response = client.send(new Command("STATUS"));
          new Status(response.text);
          System.out.println(response.text);
        } catch (Exception e) {
          System.out.println(e.getMessage());
          System.exit(1);
        }
      }
  }
