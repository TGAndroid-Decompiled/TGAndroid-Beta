package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48964a;
    public final char f48965b;
    public final int f48966c = 1;

    public a(char c10, char c11) {
        this.f48964a = c10;
        this.f48965b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48964a, this.f48965b, this.f48966c);
    }
}
