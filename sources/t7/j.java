package t7;

import java.util.Iterator;
public final class j extends f {
    public final transient l f43346c;
    public final transient k d;

    public j(l lVar, k kVar) {
        this.f43346c = lVar;
        this.d = kVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f43346c.get(obj) != null) {
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
        return this.f43346c.h;
    }
}
