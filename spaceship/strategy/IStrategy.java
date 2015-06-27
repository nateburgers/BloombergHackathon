package spaceship.strategy;

import spaceship.control.Command;
import spaceship.data.Pair;
import spaceship.entity.Ship;
import spaceship.state.Cell;
import spaceship.state.IQuadTree;

/**
 * Created by nate on 6/26/15.
 */
public interface IStrategy
  {
    Pair<IQuadTree<Cell>, Command> compute(IQuadTree<Cell> state, Ship player);
  }
