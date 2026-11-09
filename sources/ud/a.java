package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56524a;
    public final char f56525b;
    public final int f56526c = 1;

    public a(char c10, char c11) {
        this.f56524a = c10;
        this.f56525b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56524a, this.f56525b, this.f56526c);
    }
}
