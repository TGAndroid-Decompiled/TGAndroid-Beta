package vd;

import java.util.Iterator;
import w7.b0;
public abstract class a implements Iterable {
    public final char f49535a;
    public final char f49536b;
    public final int f49537c = 1;

    public a(char c10, char c11) {
        this.f49535a = c10;
        this.f49536b = (char) b0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49535a, this.f49536b, this.f49537c);
    }
}
