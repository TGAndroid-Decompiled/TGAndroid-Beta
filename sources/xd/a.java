package xd;

import a8.kf;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f51785a;
    public final char f51786b;
    public final int f51787c = 1;

    public a(char c10, char c11) {
        this.f51785a = c10;
        this.f51786b = (char) kf.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51785a, this.f51786b, this.f51787c);
    }
}
