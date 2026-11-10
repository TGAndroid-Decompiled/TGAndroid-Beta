package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56523a;
    public final char f56524b;
    public final int f56525c = 1;

    public a(char c10, char c11) {
        this.f56523a = c10;
        this.f56524b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56523a, this.f56524b, this.f56525c);
    }
}
