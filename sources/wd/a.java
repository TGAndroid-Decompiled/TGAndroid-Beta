package wd;

import java.util.Iterator;
import w7.j0;
public abstract class a implements Iterable {
    public final char f47531a;
    public final char f47532b;
    public final int f47533c = 1;

    public a(char c10, char c11) {
        this.f47531a = c10;
        this.f47532b = (char) j0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47531a, this.f47532b, this.f47533c);
    }
}
