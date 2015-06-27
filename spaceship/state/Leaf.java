package spaceship.state;

/**
 * Created by nate on 6/26/15.
 */
public class Leaf<T> implements IQuadTree<T>
  {
    public final T cell;

    public Leaf(T cell)
      {
        this.cell = cell;
      }
  }
