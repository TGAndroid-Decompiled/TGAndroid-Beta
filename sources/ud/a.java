package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43980a;
    public final char f43981b;
    public final int f43982c = 1;

    public a(char c10, char c11) {
        this.f43980a = c10;
        this.f43981b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43980a, this.f43981b, this.f43982c);
    }
}
