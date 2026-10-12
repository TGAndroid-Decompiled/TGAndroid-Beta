package vd;

import java.util.Iterator;
import w7.a0;
public abstract class a implements Iterable {
    public final char f49773a;
    public final char f49774b;
    public final int f49775c = 1;

    public a(char c10, char c11) {
        this.f49773a = c10;
        this.f49774b = (char) a0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49773a, this.f49774b, this.f49775c);
    }
}
