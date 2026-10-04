package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f47603a;
    public final char f47604b;
    public final int f47605c = 1;

    public a(char c10, char c11) {
        this.f47603a = c10;
        this.f47604b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47603a, this.f47604b, this.f47605c);
    }
}
