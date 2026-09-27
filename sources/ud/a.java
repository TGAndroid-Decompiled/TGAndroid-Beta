package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f44006a;
    public final char f44007b;
    public final int f44008c = 1;

    public a(char c10, char c11) {
        this.f44006a = c10;
        this.f44007b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f44006a, this.f44007b, this.f44008c);
    }
}
