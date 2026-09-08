package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f47040a;
    public final char f47041b;
    public final int f47042c = 1;

    public a(char c10, char c11) {
        this.f47040a = c10;
        this.f47041b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47040a, this.f47041b, this.f47042c);
    }
}
