package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f47041a;
    public final char f47042b;
    public final int f47043c = 1;

    public a(char c10, char c11) {
        this.f47041a = c10;
        this.f47042b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47041a, this.f47042b, this.f47043c);
    }
}
