package spaceship.entity;

import spaceship.data.Vector;

/**
 * Created by nate on 6/26/15.
 */
public class Ship
  {
    public final Vector position;
    public final Vector velocity;
    public final int lastObservedTime;

    public Ship(Vector position, Vector velocity, int lastObservedTime)
      {
        this.position = position;
        this.velocity = velocity;
        this.lastObservedTime = lastObservedTime;
      }

    public Ship(Vector position, Vector velocity)
      {
        this(position, velocity, 0);
      }
  }
