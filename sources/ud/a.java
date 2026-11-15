package ud;

import c8.s9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58019a;
    public final char f58020b;
    public final int f58021c = 1;

    public a(char c10, char c11) {
        this.f58019a = c10;
        this.f58020b = (char) s9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58019a, this.f58020b, this.f58021c);
    }
}
