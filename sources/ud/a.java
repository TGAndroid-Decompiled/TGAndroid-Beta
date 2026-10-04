package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f47602a;
    public final char f47603b;
    public final int f47604c = 1;

    public a(char c10, char c11) {
        this.f47602a = c10;
        this.f47603b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47602a, this.f47603b, this.f47604c);
    }
}
