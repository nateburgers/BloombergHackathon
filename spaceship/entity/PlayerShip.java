package spaceship.entity;

import spaceship.data.Vector;

/**
 * Created by Ashish109 on 6/27/2015.
 */
public class PlayerShip
{
    public final Vector position;
    public final Vector velocity;

    public PlayerShip(Vector position, Vector velocity)
    {
        this.position = position;
        this.velocity = velocity;
    }
}
