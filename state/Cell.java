package spaceship.state;

import spaceship.data.Vector;
import spaceship.entity.Bomb;
import spaceship.entity.Mine;
import spaceship.entity.Ship;

import java.util.Set;

/**
 * Created by nate on 6/26/15.
 */
public class Cell
  {
    Vector position;
    Vector size;
    Set<Bomb> bombs;
    Set<Mine> mines;
    Set<Ship> ships;

    public Cell(Vector position, Vector size, Set<Bomb> bombs, Set<Mine> mines, Set<Ship> ships)
      {
        this.position = position;
        this.size = size;
        this.bombs = bombs;
        this.mines = mines;
        this.ships = ships;
      }
  }
