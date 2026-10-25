package u7;

import java.util.Iterator;
public final class j extends f {
    public final transient l f49602c;
    public final transient k d;

    public j(l lVar, k kVar) {
        this.f49602c = lVar;
        this.d = kVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (this.f49602c.get(obj) != null) {
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
        return this.f49602c.h;
    }
}
