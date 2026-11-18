package ud;

import c8.u9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58585a;
    public final char f58586b;
    public final int f58587c = 1;

    public a(char c10, char c11) {
        this.f58585a = c10;
        this.f58586b = (char) u9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58585a, this.f58586b, this.f58587c);
    }
}
