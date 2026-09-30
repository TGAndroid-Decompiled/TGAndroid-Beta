package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f44071a;
    public final char f44072b;
    public final int f44073c = 1;

    public a(char c10, char c11) {
        this.f44071a = c10;
        this.f44072b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f44071a, this.f44072b, this.f44073c);
    }
}
