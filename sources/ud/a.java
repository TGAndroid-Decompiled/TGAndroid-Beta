package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56511a;
    public final char f56512b;
    public final int f56513c = 1;

    public a(char c10, char c11) {
        this.f56511a = c10;
        this.f56512b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56511a, this.f56512b, this.f56513c);
    }
}
