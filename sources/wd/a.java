package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48927a;
    public final char f48928b;
    public final int f48929c = 1;

    public a(char c10, char c11) {
        this.f48927a = c10;
        this.f48928b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48927a, this.f48928b, this.f48929c);
    }
}
