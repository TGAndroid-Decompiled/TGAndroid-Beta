package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48923a;
    public final char f48924b;
    public final int f48925c = 1;

    public a(char c10, char c11) {
        this.f48923a = c10;
        this.f48924b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48923a, this.f48924b, this.f48925c);
    }
}
