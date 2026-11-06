package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56420a;
    public final char f56421b;
    public final int f56422c = 1;

    public a(char c10, char c11) {
        this.f56420a = c10;
        this.f56421b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56420a, this.f56421b, this.f56422c);
    }
}
