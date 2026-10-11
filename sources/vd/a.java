package vd;

import java.util.Iterator;
import w7.b0;
public abstract class a implements Iterable {
    public final char f49658a;
    public final char f49659b;
    public final int f49660c = 1;

    public a(char c10, char c11) {
        this.f49658a = c10;
        this.f49659b = (char) b0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49658a, this.f49659b, this.f49660c);
    }
}
