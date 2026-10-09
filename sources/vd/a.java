package vd;

import java.util.Iterator;
import w7.b0;
public abstract class a implements Iterable {
    public final char f49537a;
    public final char f49538b;
    public final int f49539c = 1;

    public a(char c10, char c11) {
        this.f49537a = c10;
        this.f49538b = (char) b0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49537a, this.f49538b, this.f49539c);
    }
}
