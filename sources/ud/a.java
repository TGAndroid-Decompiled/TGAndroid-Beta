package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43964a;
    public final char f43965b;
    public final int f43966c = 1;

    public a(char c10, char c11) {
        this.f43964a = c10;
        this.f43965b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43964a, this.f43965b, this.f43966c);
    }
}
