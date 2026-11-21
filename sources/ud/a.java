package ud;

import c8.u9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58626a;
    public final char f58627b;
    public final int f58628c = 1;

    public a(char c10, char c11) {
        this.f58626a = c10;
        this.f58627b = (char) u9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58626a, this.f58627b, this.f58628c);
    }
}
