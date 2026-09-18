package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43933a;
    public final char f43934b;
    public final int f43935c = 1;

    public a(char c10, char c11) {
        this.f43933a = c10;
        this.f43934b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43933a, this.f43934b, this.f43935c);
    }
}
