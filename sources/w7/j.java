package w7;

import java.util.Iterator;
public final class j extends f {
    public final transient l f57599c;
    public final transient k d;

    public j(l lVar, k kVar) {
        this.f57599c = lVar;
        this.d = kVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f57599c.get(obj) != null) {
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
        return this.f57599c.h;
    }
}
