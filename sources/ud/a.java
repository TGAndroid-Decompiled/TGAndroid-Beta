package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f43706a;
    public final char f43707b;
    public final int f43708c = 1;

    public a(char c10, char c11) {
        this.f43706a = c10;
        this.f43707b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43706a, this.f43707b, this.f43708c);
    }
}
