package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48917a;
    public final char f48918b;
    public final int f48919c = 1;

    public a(char c10, char c11) {
        this.f48917a = c10;
        this.f48918b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48917a, this.f48918b, this.f48919c);
    }
}
