package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f49365a;
    public final char f49366b;
    public final int f49367c = 1;

    public a(char c10, char c11) {
        this.f49365a = c10;
        this.f49366b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49365a, this.f49366b, this.f49367c);
    }
}
