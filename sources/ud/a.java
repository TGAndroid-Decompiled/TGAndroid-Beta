package ud;

import c8.u9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58584a;
    public final char f58585b;
    public final int f58586c = 1;

    public a(char c10, char c11) {
        this.f58584a = c10;
        this.f58585b = (char) u9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58584a, this.f58585b, this.f58586c);
    }
}
