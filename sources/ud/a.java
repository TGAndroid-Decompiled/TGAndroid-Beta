package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f47012a;
    public final char f47013b;
    public final int f47014c = 1;

    public a(char c10, char c11) {
        this.f47012a = c10;
        this.f47013b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47012a, this.f47013b, this.f47014c);
    }
}
