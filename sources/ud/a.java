package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f47013a;
    public final char f47014b;
    public final int f47015c = 1;

    public a(char c10, char c11) {
        this.f47013a = c10;
        this.f47014b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47013a, this.f47014b, this.f47015c);
    }
}
