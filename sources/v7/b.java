package v7;

import java.util.Iterator;
public final class b extends h9 {
    public final transient d f50408c;
    public final transient c d;

    public b(d dVar, c cVar) {
        this.f50408c = dVar;
        this.d = cVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f50408c.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override
    public final Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override
    public final int l(Object[] objArr) {
        return this.d.l(objArr);
    }

    @Override
    public final int size() {
        this.f50408c.getClass();
        return 1;
    }
}
