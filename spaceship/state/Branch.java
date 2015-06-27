package spaceship.state;

/**
 * Created by nate on 6/26/15.
 */
public class Branch<T> implements IQuadTree<T>
  {
    public final IQuadTree<T> a;
    public final IQuadTree<T> b;
    public final IQuadTree<T> c;
    public final IQuadTree<T> d;

    public Branch(IQuadTree<T> a, IQuadTree<T> b, IQuadTree<T> c, IQuadTree<T> d)
      {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
      }
  }
