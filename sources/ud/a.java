package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56419a;
    public final char f56420b;
    public final int f56421c = 1;

    public a(char c10, char c11) {
        this.f56419a = c10;
        this.f56420b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56419a, this.f56420b, this.f56421c);
    }
}
