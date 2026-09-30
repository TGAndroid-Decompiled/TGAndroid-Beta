package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f43965a;
    public final char f43966b;
    public final int f43967c = 1;

    public a(char c10, char c11) {
        this.f43965a = c10;
        this.f43966b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43965a, this.f43966b, this.f43967c);
    }
}
