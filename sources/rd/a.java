package rd;

import b8.hd;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f54490a;
    public final char f54491b;
    public final int f54492c = 1;

    public a(char c2, char c10) {
        this.f54490a = c2;
        this.f54491b = (char) hd.a(c2, c10, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f54490a, this.f54491b, this.f54492c);
    }
}
