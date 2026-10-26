package xd;

import a8.kf;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f51727a;
    public final char f51728b;
    public final int f51729c = 1;

    public a(char c10, char c11) {
        this.f51727a = c10;
        this.f51728b = (char) kf.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51727a, this.f51728b, this.f51729c);
    }
}
