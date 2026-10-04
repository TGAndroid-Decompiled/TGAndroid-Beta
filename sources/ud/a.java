package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f47611a;
    public final char f47612b;
    public final int f47613c = 1;

    public a(char c10, char c11) {
        this.f47611a = c10;
        this.f47612b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47611a, this.f47612b, this.f47613c);
    }
}
