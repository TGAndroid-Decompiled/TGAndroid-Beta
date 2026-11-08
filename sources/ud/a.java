package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56512a;
    public final char f56513b;
    public final int f56514c = 1;

    public a(char c10, char c11) {
        this.f56512a = c10;
        this.f56513b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56512a, this.f56513b, this.f56514c);
    }
}
