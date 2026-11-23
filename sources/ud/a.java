package ud;

import c8.v9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58595a;
    public final char f58596b;
    public final int f58597c = 1;

    public a(char c10, char c11) {
        this.f58595a = c10;
        this.f58596b = (char) v9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58595a, this.f58596b, this.f58597c);
    }
}
