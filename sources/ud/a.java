package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43962a;
    public final char f43963b;
    public final int f43964c = 1;

    public a(char c10, char c11) {
        this.f43962a = c10;
        this.f43963b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43962a, this.f43963b, this.f43964c);
    }
}
