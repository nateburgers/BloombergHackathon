package spaceship.entity;

import spaceship.data.Vector;

/**
 * Created by nate on 6/26/15.
 */
public class Bomb
  {
    public final Vector position;
    public final int lastObservedTime;

    public Bomb(Vector position, int lastObservedTime)
      {
        this.position = position;
        this.lastObservedTime = lastObservedTime;
      }
  }
