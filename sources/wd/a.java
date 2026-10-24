package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f49364a;
    public final char f49365b;
    public final int f49366c = 1;

    public a(char c10, char c11) {
        this.f49364a = c10;
        this.f49365b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49364a, this.f49365b, this.f49366c);
    }
}
