package vd;

import java.util.Iterator;
import w7.b0;
public abstract class a implements Iterable {
    public final char f49581a;
    public final char f49582b;
    public final int f49583c = 1;

    public a(char c10, char c11) {
        this.f49581a = c10;
        this.f49582b = (char) b0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49581a, this.f49582b, this.f49583c);
    }
}
