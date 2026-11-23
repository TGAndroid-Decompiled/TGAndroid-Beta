package ud;

import c8.v9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f58710a;
    public final char f58711b;
    public final int f58712c = 1;

    public a(char c10, char c11) {
        this.f58710a = c10;
        this.f58711b = (char) v9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f58710a, this.f58711b, this.f58712c);
    }
}
