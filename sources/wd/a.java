package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48926a;
    public final char f48927b;
    public final int f48928c = 1;

    public a(char c10, char c11) {
        this.f48926a = c10;
        this.f48927b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48926a, this.f48927b, this.f48928c);
    }
}
