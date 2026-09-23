package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f43626a;
    public final char f43627b;
    public final int f43628c = 1;

    public a(char c10, char c11) {
        this.f43626a = c10;
        this.f43627b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43626a, this.f43627b, this.f43628c);
    }
}
