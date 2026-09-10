package ud;

import java.util.Iterator;
import w7.x;
public abstract class a implements Iterable {
    public final char f42649a;
    public final char f42650b;
    public final int f42651c = 1;

    public a(char c10, char c11) {
        this.f42649a = c10;
        this.f42650b = (char) x.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f42649a, this.f42650b, this.f42651c);
    }
}
