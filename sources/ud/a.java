package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43963a;
    public final char f43964b;
    public final int f43965c = 1;

    public a(char c10, char c11) {
        this.f43963a = c10;
        this.f43964b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43963a, this.f43964b, this.f43965c);
    }
}
