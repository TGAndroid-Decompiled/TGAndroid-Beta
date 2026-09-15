package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f43678a;
    public final char f43679b;
    public final int f43680c = 1;

    public a(char c10, char c11) {
        this.f43678a = c10;
        this.f43679b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43678a, this.f43679b, this.f43680c);
    }
}
