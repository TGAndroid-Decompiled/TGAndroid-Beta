package vd;

import java.util.Iterator;
import w7.a0;
public abstract class a implements Iterable {
    public final char f49765a;
    public final char f49766b;
    public final int f49767c = 1;

    public a(char c10, char c11) {
        this.f49765a = c10;
        this.f49766b = (char) a0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49765a, this.f49766b, this.f49767c);
    }
}
