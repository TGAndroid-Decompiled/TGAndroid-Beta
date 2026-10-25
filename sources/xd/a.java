package xd;

import a8.kf;
import java.util.Iterator;
public abstract class a implements Iterable {
    public final char f51724a;
    public final char f51725b;
    public final int f51726c = 1;

    public a(char c10, char c11) {
        this.f51724a = c10;
        this.f51725b = (char) kf.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f51724a, this.f51725b, this.f51726c);
    }
}
