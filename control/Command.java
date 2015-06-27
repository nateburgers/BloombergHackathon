package spaceship.control;

/**
 * Created by nate on 6/26/15.
 */
public class Command
  {
    private final String text;

    public Command(String text)
      {
        this.text = text;
      }

    public String getText()
      {
        return text;
      }
  }
