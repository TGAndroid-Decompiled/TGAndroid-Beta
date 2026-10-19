package wd;

import java.util.Iterator;
import w7.i0;
public abstract class a implements Iterable {
    public final char f48918a;
    public final char f48919b;
    public final int f48920c = 1;

    public a(char c10, char c11) {
        this.f48918a = c10;
        this.f48919b = (char) i0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f48918a, this.f48919b, this.f48920c);
    }
}
