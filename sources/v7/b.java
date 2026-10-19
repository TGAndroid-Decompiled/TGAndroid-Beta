package v7;

import java.util.Iterator;
public final class b extends i9 {
    public final transient d f47969c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f47969c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f47969c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int h(Object[] objArr) {
        return this.d.h(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f47969c.getClass();
        return 1;
    }
}
