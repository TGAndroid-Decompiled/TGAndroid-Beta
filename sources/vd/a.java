package vd;

import java.util.Iterator;
import w7.b0;
public abstract class a implements Iterable {
    public final char f49624a;
    public final char f49625b;
    public final int f49626c = 1;

    public a(char c10, char c11) {
        this.f49624a = c10;
        this.f49625b = (char) b0.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f49624a, this.f49625b, this.f49626c);
    }
}
