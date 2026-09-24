package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43949a;
    public final char f43950b;
    public final int f43951c = 1;

    public a(char c10, char c11) {
        this.f43949a = c10;
        this.f43950b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43949a, this.f43950b, this.f43951c);
    }
}
