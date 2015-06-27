package spaceship.entity;

import spaceship.data.Vector;

/**
 * Created by nate on 6/26/15.
 */
public class Ship
  {
    public final String owner;
    public final Vector position;
    public final Vector velocity;
    public final int lastObservedTime;

    public Ship(String owner, Vector position, Vector velocity, int lastObservedTime)
      {
        this.owner = owner;
        this.position = position;
        this.velocity = velocity;
        this.lastObservedTime = lastObservedTime;
      }

    public Ship(Vector position, Vector velocity)
      {
        this(null, position, velocity, 0);
      }
  }
