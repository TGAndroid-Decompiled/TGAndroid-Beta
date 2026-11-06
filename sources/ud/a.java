package ud;

import c8.t9;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f56395a;
    public final char f56396b;
    public final int f56397c = 1;

    public a(char c10, char c11) {
        this.f56395a = c10;
        this.f56396b = (char) t9.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f56395a, this.f56396b, this.f56397c);
    }
}
