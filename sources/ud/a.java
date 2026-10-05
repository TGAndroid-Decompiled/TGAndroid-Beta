package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f47618a;
    public final char f47619b;
    public final int f47620c = 1;

    public a(char c10, char c11) {
        this.f47618a = c10;
        this.f47619b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f47618a, this.f47619b, this.f47620c);
    }
}
