package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f43701a;
    public final char f43702b;
    public final int f43703c = 1;

    public a(char c10, char c11) {
        this.f43701a = c10;
        this.f43702b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43701a, this.f43702b, this.f43703c);
    }
}
