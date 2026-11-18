package y7;

import java.util.Iterator;
public final class b extends l9 {
    public final transient d f60768c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f60768c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f60768c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int f(Object[] objArr) {
        return this.d.f(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f60768c.getClass();
        return 1;
    }
}
