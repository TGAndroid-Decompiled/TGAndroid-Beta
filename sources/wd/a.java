package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f47530a;
    public final char f47531b;
    public final int f47532c = 1;

    public a(char c10, char c11) {
        this.f47530a = c10;
        this.f47531b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47530a, this.f47531b, this.f47532c);
    }
}
