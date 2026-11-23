package ud;

import c8.u9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58630a;
    public final char f58631b;
    public final int f58632c = 1;

    public a(char c10, char c11) {
        this.f58630a = c10;
        this.f58631b = (char) u9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58630a, this.f58631b, this.f58632c);
    }
}
