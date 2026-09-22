package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f44001a;
    public final char f44002b;
    public final int f44003c = 1;

    public a(char c10, char c11) {
        this.f44001a = c10;
        this.f44002b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f44001a, this.f44002b, this.f44003c);
    }
}
