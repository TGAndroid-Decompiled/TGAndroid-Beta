package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48939a;
    public final char f48940b;
    public final int f48941c = 1;

    public a(char c10, char c11) {
        this.f48939a = c10;
        this.f48940b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48939a, this.f48940b, this.f48941c);
    }
}
