package v7;

import java.util.Iterator;
public final class b extends i9 {
    public final transient d f42938c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f42938c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f42938c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final int i(Object[] objArr) {
        return this.d.i(objArr);
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int size() {
        this.f42938c.getClass();
        return 1;
    }
}
