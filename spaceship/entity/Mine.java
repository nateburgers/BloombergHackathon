package spaceship.entity;

import spaceship.data.Vector;

/**
 * Created by nate on 6/26/15.
 */
public class Mine
  {
    public final Vector position;
    public final Ship owner;

    public Mine(Vector position, Ship owner)
      {
        this.position = position;
        this.owner = owner;
      }
  }
